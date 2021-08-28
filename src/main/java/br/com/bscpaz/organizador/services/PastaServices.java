package br.com.bscpaz.organizador.services;

import java.io.File;

public class PastaServices {
    
    public void excluiPastasVazias(String pastaOrigem) {
        File root = new File(pastaOrigem);
        File[] arquivos = root.listFiles();

        for (File arquivo : arquivos) {
            if (arquivo.isDirectory()) {
                if (arquivo.listFiles().length == 0) {
                    System.out.println("Excluindo a pasta vazia " + arquivo);
                    arquivo.delete();
                } else {
                    excluiPastasVazias(arquivo.getAbsolutePath());
                }
            }
        }
    }
}

