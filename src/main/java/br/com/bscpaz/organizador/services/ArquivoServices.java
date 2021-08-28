package br.com.bscpaz.organizador.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

import br.com.bscpaz.organizador.exceptions.DataNaoEncontradaException;
import br.com.bscpaz.organizador.vos.PeriodoBrunoVO;
import br.com.bscpaz.organizador.vos.PeriodoVO;

public class ArquivoServices {

    private String pastaRaizOrigem;
    private String pastaRaizDestino;
    private List<PeriodoVO> periodos;
    private int contador = 0;
    
    public ArquivoServices(String pastaRaizOrigem, String pastaRaizDestino) {
        this.pastaRaizOrigem = pastaRaizOrigem;
        this.pastaRaizDestino = pastaRaizDestino;
        PeriodoBrunoVO periodoBruno = new PeriodoBrunoVO();
        this.periodos = periodoBruno.getPeriodos();
    }

    
    public void organizaFotosEVideos() {
        listaTodosOsArquivosEOrganize(this.pastaRaizOrigem);
    }
    
    
    protected void listaTodosOsArquivosEOrganize(String pastaOrigem) {
        File pastaRaiz = new File(pastaOrigem);
        File[] arquivos = pastaRaiz.listFiles();

        for (File arquivo : arquivos) {
            if (arquivo.isDirectory()) {
                listaTodosOsArquivosEOrganize(arquivo.getAbsolutePath());
            } else {
                try {
                    organize(arquivo.getAbsolutePath());
                } catch (DataNaoEncontradaException e) {
                    System.out.println("Não foi possuível tratar o arquivo " + arquivo.getAbsolutePath() + " - Erro: " + e.getMessage());
                }
            }
        }
    }

    
    protected void organize(String nomeAbsolutoDoArquivo) throws DataNaoEncontradaException {
        LocalDate dataDoArquivo = obtemDataOrigemDoArquivo(nomeAbsolutoDoArquivo);
        
        if (dataDoArquivo != null) {
            String pastaDestinoFinal = criePastasDestino(dataDoArquivo, isVideo(nomeAbsolutoDoArquivo));
            moveArquivo(nomeAbsolutoDoArquivo, pastaDestinoFinal);
        } else {
            throw new DataNaoEncontradaException(nomeAbsolutoDoArquivo);
        }
    }

    
    protected LocalDate obtemDataOrigemDoArquivo(String nomeAbsolutoDoArquivo) {
        LocalDate dataDeNomeDeCelular = getDataDoNomeDoArquivo(nomeAbsolutoDoArquivo);
        
        if (dataDeNomeDeCelular != null) { 
            return dataDeNomeDeCelular;
        } 
        return getDataOrigemDeMetadado(nomeAbsolutoDoArquivo);
    }
    
    
    protected static LocalDate getDataDoNomeDoArquivo(String nomeAbsolutoDoArquivo) {
        try {
            String nomeDoArquivo = new File(nomeAbsolutoDoArquivo).getName();
            String dataDoArquivo = getNomeSemPrefixoESufixo(nomeDoArquivo);
            
            if (isData(dataDoArquivo) && hasAno(dataDoArquivo) && hasMes(dataDoArquivo) && hasDia(dataDoArquivo)) {
                return getDataDeString(dataDoArquivo);
            }
        } catch (Exception e) {
            //System.out.println("Arquivo '" + nomeAbsolutoDoArquivo + "' n�o possui data no nome do arquivo.");
        }
        return null;
     }
    
    
    protected boolean isVideo(String nomeDoArquivo) {
        return getExtensao(nomeDoArquivo).toUpperCase().equals(".MTS") || 
                getExtensao(nomeDoArquivo).toUpperCase().equals(".MP4") ||
                getExtensao(nomeDoArquivo).toUpperCase().equals(".AVI") ||
                getExtensao(nomeDoArquivo).toUpperCase().equals(".MOV") ||
                getExtensao(nomeDoArquivo).toUpperCase().equals(".3GP") ||
                getExtensao(nomeDoArquivo).toUpperCase().equals(".VOB");
    }
    
    
    protected static String getExtensao(String nomeDoArquivo) {
        return nomeDoArquivo.substring(nomeDoArquivo.length() - 4, nomeDoArquivo.length());
    }

    
    protected static String getNomeSemPrefixoESufixo(String nomeDoArquivo) {
        String nomeSemPrefixo = nomeDoArquivo;
        
        if (nomeSemPrefixo.toUpperCase().startsWith("IMG-") || nomeSemPrefixo.toUpperCase().startsWith("VID_")
                || nomeSemPrefixo.toUpperCase().startsWith("VID-")) {
            nomeSemPrefixo = nomeSemPrefixo.replace("IMG-", "")
                    .replace("VID_", "").replace("VID-", "").replace("img-", "")
                    .replace("vid_", "").replace("vid-", "");
        }
        return nomeSemPrefixo.substring(0, 8);
    }
    
    
    protected static boolean isData(String dataArquivo) {
        return dataArquivo.length() == 8;
    }
    
    
    protected static boolean hasAno(String dataArquivo) {
        int ano = Integer.valueOf(dataArquivo.substring(0, 4)).intValue();
        if (ano >= 2000 && ano <= 2050) {
            return true;
        }
        return false;
    }
    
    
    protected static boolean hasMes(String dataArquivo) {
        if (dataArquivo.length() >= 8) {
            int mes = 0;
            String mesStr = dataArquivo.substring(4, 6);

            if (mesStr.startsWith("0")) {
                mes = Integer.valueOf(mesStr.substring(1, 2)).intValue();
            } else {
                mes = Integer.valueOf(mesStr).intValue();
            }

            if (mes >= 1 && mes <= 12) {
                return true;
            }
        }
        return false;
    }

    
    protected static boolean hasDia(String dataArquivo) {
        if (dataArquivo.length() >= 8) {
            int mes = 0;
            String mesStr = dataArquivo.substring(6, 8);

            if (mesStr.startsWith("0")) {
                mes = Integer.valueOf(mesStr.substring(1, 2)).intValue();
            } else {
                mes = Integer.valueOf(mesStr).intValue();
            }

            if (mes >= 1 && mes <= 31) {
                return true;
            }
        }
        return false;
    }
    
    
    protected static LocalDate getDataOrigemDeMetadado(String nomeDoArquivo) {
        LocalDate data = null;
        File arquivo = new File(nomeDoArquivo);
        
        try {
            Metadata metadata = ImageMetadataReader.readMetadata(arquivo);

            for (Directory metadados : metadata.getDirectories()) {
                for (Tag tag : metadados.getTags()) {
                    if (tag.getTagName().equalsIgnoreCase("Date/Time Original")) {
                        data = getDataDeString(tag.getDescription());
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
    
    
    private static LocalDate getDataDeString(String dataEncontrada) {
        String dataDoArquivo = dataEncontrada;
        LocalDate dataArquivo = null;

        String datePatterns[] = {
                "yyyy:MM:dd HH:mm:ss",
                "yyyy:MM:dd HH:mm",
                "yyyy-MM-dd HH:mm:ss",
                "yyyy-MM-dd HH:mm",
                "yyyy.MM.dd HH:mm:ss",
                "yyyy.MM.dd HH:mm",
                "yyyy-MM-dd'T'HH:mm:ss",
                "yyyy-MM-dd'T'HH:mm",
                "yyyy-MM-dd",
                "yyyyMMdd",
                "yyyy-MM",
                "yyyy" };

        // if the date string has subsecond information, it supersedes the subsecond parameter
        Pattern subsecondPattern = Pattern.compile("(\\d\\d:\\d\\d:\\d\\d)(\\.\\d+)");
        Matcher subsecondMatcher = subsecondPattern.matcher(dataDoArquivo);
        if (subsecondMatcher.find()) {
            dataDoArquivo = subsecondMatcher.replaceAll("$1");
        }

        // if the date string has time zone information, it supersedes the timeZone parameter
        Pattern timeZonePattern = Pattern.compile("(Z|[+-]\\d\\d:\\d\\d)$");
        Matcher timeZoneMatcher = timeZonePattern.matcher(dataDoArquivo);
        if (timeZoneMatcher.find()) {
            dataDoArquivo = timeZoneMatcher.replaceAll("");
        }
        
        for (String datePattern : datePatterns) {
            try {
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern(datePattern);
                dataArquivo = LocalDate.parse(dataDoArquivo, formatador);
                break;
            } catch (DateTimeParseException ex) {
                // simplesmente tente o novo padr�o.
            }
        }
        return dataArquivo;
    }
    
    
    protected String criePastasDestino(LocalDate data, boolean isVideo) {
        int ano = data.getYear();
        String mes = getDescricaoMes(data);
        String pastaDestinoAno = getPastaDestinoAno(pastaRaizDestino, data, ano);
        String pastaDestinoMes = getPastaDestinoAnoMes(pastaDestinoAno, mes, isVideo);
        
       criaPastaDestino(pastaDestinoAno);
       criaPastaDestino(pastaDestinoMes);
       return pastaDestinoMes;
    }
    
    
    protected static String getDescricaoMes(LocalDate data) {
        String nomeDoMes = null;
        
        switch (data.getMonthValue()) {
        case 1:
            nomeDoMes = "01. Janeiro";
            break;
        case 2:
            nomeDoMes = "02. Fevereiro";
            break;
        case 3:
            nomeDoMes = "03. Mar�o";
            break;
        case 4:
            nomeDoMes = "04. Abril";
            break;
        case 5:
            nomeDoMes = "05. Maio";
            break;
        case 6:
            nomeDoMes = "06. Junho";
            break;
        case 7:
            nomeDoMes = "07. Julho";
            break;
        case 8:
            nomeDoMes = "08. Agosto";
            break;
        case 9:
            nomeDoMes = "09. Setembro";
            break;
        case 10:
            nomeDoMes = "10. Outubro";
            break;
        case 11:
            nomeDoMes = "11. Novembro";
            break;
        case 12:
            nomeDoMes = "12. Dezembro";
            break;
        }
        return nomeDoMes; 
    }

    
    protected String getPastaDestinoAno(String pastaDestino, LocalDate data, int ano) {
        String localidade = "\\" + getLocalidade(data); //<<< comentar em caso de n�o usar localidades
        return pastaDestino +  localidade + "\\" + ano;
    }

    
    protected String getLocalidade(LocalDate dataArquivo) {
        for (PeriodoVO periodoVO : periodos) {
            LocalDate inicio = periodoVO.getInicio();
            LocalDate fim = periodoVO.getFim();
            
            if (dataArquivo.isEqual(inicio) || dataArquivo.isEqual(fim) || 
                    (dataArquivo.isAfter(inicio) && dataArquivo.isBefore(fim))) {
                return periodoVO.getPasta();
            }
        }
        return "";
    }


    protected String getPastaDestinoAnoMes(String pastaDestino, String mes, boolean isVideo) {
        if (isVideo) {
            return pastaDestino + "\\" + mes + "\\V�deos";
        }
        return pastaDestino + "\\" + mes;
    }
    
    
    protected void moveArquivo(String arquivo, String pastaDestinoFinal) {
        Path source = FileSystems.getDefault().getPath(arquivo);
        Path newDir = FileSystems.getDefault().getPath(pastaDestinoFinal);
        
        try {
            Path destino = newDir.resolve(source.getFileName());
            File f = destino.toFile();
            if (!f.exists()) {
                System.out.println("Movendo '" + arquivo + "' para '" + pastaDestinoFinal + "'...");
                Files.move(source, destino, StandardCopyOption.ATOMIC_MOVE);
                contador++;                
            } else {
                String pastaDestinoMesDuplicados = pastaDestinoFinal + "\\duplicados_avaliar";
                criaPastaDestino(pastaDestinoMesDuplicados);
                Path newDirDup = FileSystems.getDefault().getPath(pastaDestinoMesDuplicados);
                try {
                    System.out.println("Movendo '" + arquivo + "' para '" + pastaDestinoMesDuplicados + "'...");
                    Files.move(source, newDirDup.resolve(source.getFileName()), StandardCopyOption.ATOMIC_MOVE);
                    contador++;
                } catch (IOException e1) {
                    e1.printStackTrace();
                }    
            }

        } catch (IOException e) {
            String pastaDestinoMesDuplicados = pastaDestinoFinal + "\\duplicados_avaliar";
            criaPastaDestino(pastaDestinoMesDuplicados);
            Path newDirDup = FileSystems.getDefault().getPath(pastaDestinoMesDuplicados);
            try {
                System.out.println("Movendo '" + arquivo + "' para '" + pastaDestinoMesDuplicados + "'...");
                Files.move(source, newDirDup.resolve(source.getFileName()), StandardCopyOption.ATOMIC_MOVE);
                contador++;
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }           
    }
    
    
    protected void criaPastaDestino(String pastaDestino) {
        File pasta = new File(pastaDestino);
        
        if (!pasta.exists()) {
            System.out.println("Criando pasta '" + pastaDestino + "'...");
            pasta.mkdirs();
        }
    }
    
    public int getContador() {
        return contador;
    }
}

