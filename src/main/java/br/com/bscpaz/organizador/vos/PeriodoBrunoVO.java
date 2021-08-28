package br.com.bscpaz.organizador.vos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PeriodoBrunoVO {
    private List<PeriodoVO> periodos = new ArrayList<PeriodoVO>();

    public PeriodoBrunoVO() {
        setPastaFamilia();
        //setViagens();
        setCasamentos();
        //setFazenda();
    }
    
    public List<PeriodoVO> getPeriodos() {
        return periodos;
    }
    
  //================================================================================================================
    private static final String AGRUPADOR_VIAGENS = "Lugares\\";
    private static final String NY = AGRUPADOR_VIAGENS + "Nova York";
    private static final String WASHINGTON = AGRUPADOR_VIAGENS + "Washington";
    private static final String BOSTON = AGRUPADOR_VIAGENS + "Boston";
    private static final String MIAMI = AGRUPADOR_VIAGENS + "Miami";
    private static final String PARIS = AGRUPADOR_VIAGENS + "Paris";
    private static final String SERRA_NEGRA = AGRUPADOR_VIAGENS + "Serra Negra";
    private static final String MAQUINE = AGRUPADOR_VIAGENS + "Gruta de Maquin�";
    private static final String TATUI = AGRUPADOR_VIAGENS + "Tatu�";
    private static final String BUENO_AIRES = AGRUPADOR_VIAGENS + "Buenos Aires";
    private static final String CAMPOS_JORDAO = AGRUPADOR_VIAGENS + "Campos do Jord�o";
    private static final String CHAPADA_V = AGRUPADOR_VIAGENS + "Chapada dos Veadeiros";
    private static final String NORONHA = AGRUPADOR_VIAGENS + "Fernando de Noronha";
    private static final String BELO_HORIZONTE = AGRUPADOR_VIAGENS + "Belo Horizonte";
    private static final String PIRENOPOLIS = AGRUPADOR_VIAGENS + "Piren�polis";
    private static final String S_GAUCHA = AGRUPADOR_VIAGENS + "Serra Ga�cha";
    private static final String CURITIBA = AGRUPADOR_VIAGENS + "Curitiba";
    private static final String CIPO = AGRUPADOR_VIAGENS + "Serra do Cip�";
    private static final String GALINHAS = AGRUPADOR_VIAGENS + "Porto de Galinhas";
    private static final String POCOS = AGRUPADOR_VIAGENS + "Po�os de Caldas";
    private static final String SAUIPE = AGRUPADOR_VIAGENS + "Costa do Sau�pe";
    private static final String CRV = AGRUPADOR_VIAGENS + "Concei��o do Rio Verde";
    private static final String ARAXA = AGRUPADOR_VIAGENS + "Arax�";
    private static final String CAMPINAS = AGRUPADOR_VIAGENS + "Campinas";
    private static final String GOIANIA = AGRUPADOR_VIAGENS + "Goi�nia";
    private static final String FLORIPA = AGRUPADOR_VIAGENS + "Florian�polis";
    private static final String SAO_PAULO = AGRUPADOR_VIAGENS + "S�o Paulo";
    private static final String SANTIAGO = AGRUPADOR_VIAGENS + "Santiago";
    private static final String GUARUJA = AGRUPADOR_VIAGENS + "Guaruj�";
    private static final String MACEIO = AGRUPADOR_VIAGENS + "Macei�";
    private static final String OURO_PRETO = AGRUPADOR_VIAGENS + "Ouro Preto";
    private static final String MONTE_VERDE = AGRUPADOR_VIAGENS + "Monte Verde";
    private static final String BRASILIA = AGRUPADOR_VIAGENS + "Bras�lia";
    private static final String CARAPEBUS = AGRUPADOR_VIAGENS + "Carapebus e Vit�ria";
    private static final String TOPO_MUNDO = AGRUPADOR_VIAGENS + "Topo do Mundo";
    private static final String APARECIDA = AGRUPADOR_VIAGENS + "Aparecida";
    
    private void setViagens() {
        periodos.add(new PeriodoVO(CAMPOS_JORDAO, LocalDate.of(2005, 6, 10), LocalDate.of(2005, 6, 12))); 
        periodos.add(new PeriodoVO(BELO_HORIZONTE, LocalDate.of(2005, 12, 2), LocalDate.of(2005, 12, 2))); 
        periodos.add(new PeriodoVO(OURO_PRETO, LocalDate.of(2005, 12, 3), LocalDate.of(2005, 12, 3))); 
        
        periodos.add(new PeriodoVO(MACEIO, LocalDate.of(2006, 10, 1), LocalDate.of(2006, 10, 6)));
        periodos.add(new PeriodoVO(CHAPADA_V, LocalDate.of(2006, 4, 29), LocalDate.of(2006, 5, 1)));
        periodos.add(new PeriodoVO(POCOS, LocalDate.of(2006, 8, 5), LocalDate.of(2006, 8, 6)));
        
        periodos.add(new PeriodoVO(GUARUJA, LocalDate.of(2007, 1, 20), LocalDate.of(2007, 1, 21))); 
        periodos.add(new PeriodoVO(SAO_PAULO, LocalDate.of(2007, 7, 22), LocalDate.of(2007, 7, 22))); 
        periodos.add(new PeriodoVO(MONTE_VERDE, LocalDate.of(2007, 7, 13), LocalDate.of(2007, 7, 15))); 
        periodos.add(new PeriodoVO(APARECIDA, LocalDate.of(2007, 12, 8), LocalDate.of(2007, 12, 8))); 
        periodos.add(new PeriodoVO(BUENO_AIRES, LocalDate.of(2007, 9, 21), LocalDate.of(2007, 9, 23))); 
        periodos.add(new PeriodoVO(SANTIAGO, LocalDate.of(2007, 9, 24), LocalDate.of(2007, 9, 28)));
        
        periodos.add(new PeriodoVO(FLORIPA, LocalDate.of(2008, 2, 10), LocalDate.of(2008, 2, 24)));

        periodos.add(new PeriodoVO(CURITIBA, LocalDate.of(2009, 1, 16), LocalDate.of(2009, 1, 18))); 
        
        periodos.add(new PeriodoVO(NY, LocalDate.of(2010, 6, 5), LocalDate.of(2010, 6, 10))); 
        periodos.add(new PeriodoVO(WASHINGTON, LocalDate.of(2010, 6, 11), LocalDate.of(2010, 6, 13))); 
        periodos.add(new PeriodoVO(BOSTON, LocalDate.of(2010, 6, 14), LocalDate.of(2010, 6, 15))); 
        periodos.add(new PeriodoVO(SERRA_NEGRA, LocalDate.of(2010, 7, 10), LocalDate.of(2010, 7, 10)));
        
        periodos.add(new PeriodoVO(BELO_HORIZONTE, LocalDate.of(2011, 1, 5), LocalDate.of(2011, 1, 5)));
        periodos.add(new PeriodoVO(MAQUINE, LocalDate.of(2011, 1, 4), LocalDate.of(2011, 1, 4))); 
        periodos.add(new PeriodoVO(BELO_HORIZONTE, LocalDate.of(2011, 4, 23), LocalDate.of(2011, 4, 23))); 
        periodos.add(new PeriodoVO(TOPO_MUNDO, LocalDate.of(2011, 8, 28), LocalDate.of(2011, 8, 28))); 
        periodos.add(new PeriodoVO(BRASILIA, LocalDate.of(2011, 9, 10), LocalDate.of(2011, 9, 11))); 
        periodos.add(new PeriodoVO(CARAPEBUS, LocalDate.of(2011, 10, 2), LocalDate.of(2011, 10, 2))); 
        periodos.add(new PeriodoVO(BRASILIA, LocalDate.of(2011, 10, 22), LocalDate.of(2011, 10, 22))); 
        periodos.add(new PeriodoVO(CAMPINAS, LocalDate.of(2011, 10, 29), LocalDate.of(2011, 10, 29)));
        periodos.add(new PeriodoVO(TATUI, LocalDate.of(2011, 11, 2), LocalDate.of(2011, 11, 2)));
        periodos.add(new PeriodoVO(BELO_HORIZONTE, LocalDate.of(2011, 12, 25), LocalDate.of(2011, 12, 25)));
        periodos.add(new PeriodoVO(CHAPADA_V, LocalDate.of(2011, 12, 28), LocalDate.of(2011, 12, 30)));
        periodos.add(new PeriodoVO(GOIANIA, LocalDate.of(2011, 12, 31), LocalDate.of(2011, 12, 31)));
        
        periodos.add(new PeriodoVO(NORONHA, LocalDate.of(2012, 4, 28), LocalDate.of(2012, 5, 5)));
        periodos.add(new PeriodoVO(BELO_HORIZONTE, LocalDate.of(2012, 8, 3), LocalDate.of(2012, 8, 4)));
        periodos.add(new PeriodoVO(TATUI, LocalDate.of(2012, 8, 11), LocalDate.of(2012, 8, 11)));
        periodos.add(new PeriodoVO(PIRENOPOLIS, LocalDate.of(2012, 9, 5), LocalDate.of(2012, 9, 16)));
        
        periodos.add(new PeriodoVO(S_GAUCHA, LocalDate.of(2013, 4, 8), LocalDate.of(2013, 4, 14)));
        periodos.add(new PeriodoVO(CIPO, LocalDate.of(2013, 8, 21), LocalDate.of(2013, 8, 24)));
        periodos.add(new PeriodoVO(GALINHAS, LocalDate.of(2013, 11, 1), LocalDate.of(2013, 11, 7)));
        periodos.add(new PeriodoVO(TATUI, LocalDate.of(2013, 12, 7), LocalDate.of(2013, 12, 7)));
        
        periodos.add(new PeriodoVO(BELO_HORIZONTE, LocalDate.of(2014, 9, 9), LocalDate.of(2014, 9, 11)));
        periodos.add(new PeriodoVO(TATUI, LocalDate.of(2014, 9, 13), LocalDate.of(2014, 9, 14)));
        periodos.add(new PeriodoVO(TATUI, LocalDate.of(2014, 11, 8), LocalDate.of(2014, 11, 8)));
        periodos.add(new PeriodoVO(BELO_HORIZONTE, LocalDate.of(2014, 12, 27), LocalDate.of(2014, 12, 28)));

        periodos.add(new PeriodoVO(PARIS, LocalDate.of(2015, 9, 7), LocalDate.of(2015, 9, 18)));  
        periodos.add(new PeriodoVO(TATUI, LocalDate.of(2015, 11, 6), LocalDate.of(2015, 11, 8))); 
        periodos.add(new PeriodoVO(SAUIPE, LocalDate.of(2015, 12, 9), LocalDate.of(2015, 12, 13))); 
        periodos.add(new PeriodoVO(CRV, LocalDate.of(2015, 12, 23), LocalDate.of(2015, 12, 28))); 
        
        periodos.add(new PeriodoVO(MIAMI, LocalDate.of(2016, 10, 10), LocalDate.of(2016, 10, 21))); 
        periodos.add(new PeriodoVO(BELO_HORIZONTE, LocalDate.of(2016, 3, 24), LocalDate.of(2016, 3, 27)));
        periodos.add(new PeriodoVO(BELO_HORIZONTE, LocalDate.of(2016, 6, 11), LocalDate.of(2016, 6, 12)));
        periodos.add(new PeriodoVO(ARAXA, LocalDate.of(2016, 6, 28), LocalDate.of(2016, 6, 30)));
        periodos.add(new PeriodoVO(BELO_HORIZONTE, LocalDate.of(2016, 7, 2), LocalDate.of(2016, 7, 2)));
        periodos.add(new PeriodoVO(BELO_HORIZONTE, LocalDate.of(2016, 9, 8), LocalDate.of(2016, 9, 11)));
        periodos.add(new PeriodoVO(BELO_HORIZONTE, LocalDate.of(2016, 12, 25), LocalDate.of(2017, 1, 2)));
    }

    //================================================================================================================
    private static final String FAZENDA = AGRUPADOR_VIAGENS + "Fazenda";
    
    private void setFazenda() {
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2010, 12, 19), LocalDate.of(2010, 12, 30))); 
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2011, 3, 7), LocalDate.of(2011, 3, 8))); 
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2011, 11, 11), LocalDate.of(2011, 11, 12))); 
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2011, 11, 14), LocalDate.of(2011, 11, 15))); 
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2011, 6, 24), LocalDate.of(2011, 6, 26))); 
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2011, 8, 11), LocalDate.of(2011, 8, 13)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2012, 2, 20), LocalDate.of(2012, 2, 20)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2012, 8, 18), LocalDate.of(2012, 8, 28)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2013, 8, 30), LocalDate.of(2013, 8, 31)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2013, 12, 31), LocalDate.of(2014, 1, 1)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2014, 4, 14), LocalDate.of(2014, 4, 20)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2014, 4, 14), LocalDate.of(2014, 4, 22)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2014, 6, 21), LocalDate.of(2014, 4, 22)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2014, 9, 18), LocalDate.of(2014, 9, 21)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2014, 12, 19), LocalDate.of(2014, 12, 29)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2014, 12, 30), LocalDate.of(2015, 1, 4)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2015, 4, 3), LocalDate.of(2015, 4, 5)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2015, 2, 16), LocalDate.of(2015, 2, 16)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2015, 6, 3), LocalDate.of(2015, 6, 3)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2015, 7, 11), LocalDate.of(2015, 7, 16)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2015, 12, 19), LocalDate.of(2015, 12, 21)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2015, 12, 29), LocalDate.of(2015, 12, 31)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2016, 1, 1), LocalDate.of(2016, 1, 1)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2016, 2, 7), LocalDate.of(2016, 2, 9)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2016, 7, 7), LocalDate.of(2016, 7, 9)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2016, 10, 29), LocalDate.of(2016, 11, 2)));
        periodos.add(new PeriodoVO(FAZENDA, LocalDate.of(2016, 12, 21), LocalDate.of(2016, 12, 25)));

    }
    
    //================================================================================================================
    private static final String CASAM_THAISA = "Casamentos//Tha�sa e Sandro";
    private static final String CASAM_SELMA = "Casamentos//Selma e Eduardo";
    private static final String CASAM_BRUNO = "Casamentos//Silvania e Bruno";
    private static final String CASAM_PANELA_SIL = "Casamentos//Silvania e Bruno//Ch� de Panela";
    private static final String CASAM_MICHELE = "Casamentos//Michele e Paulo";
    private static final String CASAM_DANIEL = "Casamentos//Ana Paula e Daniel";
    private static final String CASAM_LESSANDRA = "Casamentos//Lessandra e Marcos";
    private static final String CASAM_FABRICIO = "Casamentos//Fabr�cio";
    private static final String CASAM_NATALIA = "Casamentos//Nat�lia e Ricardo";
    private static final String CASAM_RENILDA = "Casamentos//Renilda e Bruno";
    private static final String CASAM_ANDREIA = "Casamentos//Andr�ia e F�bio";
    
    private void setCasamentos() {
        periodos.add(new PeriodoVO(CASAM_THAISA, LocalDate.of(2006, 1, 14), LocalDate.of(2006, 1, 14)));
        periodos.add(new PeriodoVO(CASAM_SELMA, LocalDate.of(2007, 6, 22), LocalDate.of(2007, 6, 23)));
        periodos.add(new PeriodoVO(CASAM_PANELA_SIL, LocalDate.of(2009, 4, 4), LocalDate.of(2009, 4, 4))); 
        periodos.add(new PeriodoVO(CASAM_BRUNO, LocalDate.of(2009, 5, 2), LocalDate.of(2009, 5, 13))); 
        periodos.add(new PeriodoVO(CASAM_ANDREIA, LocalDate.of(2009, 11, 14), LocalDate.of(2009, 11, 14))); 
        periodos.add(new PeriodoVO(CASAM_ANDREIA, LocalDate.of(2009, 4, 18), LocalDate.of(2009, 4, 18))); 
        periodos.add(new PeriodoVO(CASAM_MICHELE, LocalDate.of(2010, 10, 23), LocalDate.of(2010, 10, 23))); 
        periodos.add(new PeriodoVO(CASAM_DANIEL, LocalDate.of(2012, 12, 8), LocalDate.of(2012, 12, 8))); 
        periodos.add(new PeriodoVO(CASAM_FABRICIO, LocalDate.of(2012, 10, 13), LocalDate.of(2012, 10, 14))); 
        periodos.add(new PeriodoVO(CASAM_NATALIA, LocalDate.of(2012, 7, 7), LocalDate.of(2012, 7, 7))); 
        periodos.add(new PeriodoVO(CASAM_LESSANDRA, LocalDate.of(2013, 8, 16), LocalDate.of(2013, 8, 16))); 
        periodos.add(new PeriodoVO(CASAM_RENILDA, LocalDate.of(2013, 11, 16), LocalDate.of(2013, 11, 16))); 
    }
    
  //================================================================================================================
    private static final String AGRUPADOR_FAMILIA = "Fam�lia\\";
    private static final String LAURA_BATIZADO = AGRUPADOR_FAMILIA + "Laura\\Batizado";
    private static final String IGOR_BATIZADO = AGRUPADOR_FAMILIA + "Igor\\Batizado";
    private static final String IGOR_28S = AGRUPADOR_FAMILIA + "Igor\\Gravidez\\28 Semanas";
    private static final String IGOR_35S = AGRUPADOR_FAMILIA + "Igor\\Gravidez\\35 Semanas";
    private static final String IGOR_N = AGRUPADOR_FAMILIA + "Igor\\00 Primeiros dias";
    private static final String IGOR_1M = AGRUPADOR_FAMILIA + "Igor\\01 M�s";
    private static final String IGOR_2M = AGRUPADOR_FAMILIA + "Igor\\02 Meses";
    private static final String IGOR_3M = AGRUPADOR_FAMILIA + "Igor\\03 Meses";
    private static final String IGOR_4M = AGRUPADOR_FAMILIA + "Igor\\04 Meses";
    private static final String IGOR_5M = AGRUPADOR_FAMILIA + "Igor\\05 Meses";
    private static final String IGOR_6M = AGRUPADOR_FAMILIA + "Igor\\06 Meses";
    private static final String IGOR_7M = AGRUPADOR_FAMILIA + "Igor\\07 Meses";
    private static final String IGOR_8M = AGRUPADOR_FAMILIA + "Igor\\08 Meses";
    private static final String IGOR_9M = AGRUPADOR_FAMILIA + "Igor\\09 Meses";
    private static final String IGOR_10M = AGRUPADOR_FAMILIA + "Igor\\10 Meses";
    private static final String IGOR_11M = AGRUPADOR_FAMILIA + "Igor\\11 Meses";
    private static final String IGOR_1 = AGRUPADOR_FAMILIA + "Igor\\01 Ano";
    private static final String IGOR_1A = AGRUPADOR_FAMILIA + "Igor\\Anivers�rios\\01 Ano";
    private static final String IGOR_2A = AGRUPADOR_FAMILIA + "Igor\\Anivers�rios\\02 Anos";
    
    private static final String VITOR_1A = AGRUPADOR_FAMILIA + "V�tor\\Anivers�rios\\01 Anos";
    private static final String VITOR_2A = AGRUPADOR_FAMILIA + "V�tor\\Anivers�rios\\02 Anos";
    private static final String BRUNO_31A = AGRUPADOR_FAMILIA + "Bruno\\Anivers�rios\\31 Anos";
    private static final String BRUNO_32A = AGRUPADOR_FAMILIA + "Bruno\\Anivers�rios\\32 Anos";
    private static final String BRUNO_33A = AGRUPADOR_FAMILIA + "Bruno\\Anivers�rios\\33 Anos";
    
    private static final String SILVANIA_28A = AGRUPADOR_FAMILIA + "Silvania\\Anivers�rios\\28 Anos";

    private void setPastaFamilia() {
        periodos.add(new PeriodoVO(IGOR_28S, LocalDate.of(2013, 11, 17), LocalDate.of(2013, 11, 17)));
        periodos.add(new PeriodoVO(IGOR_35S, LocalDate.of(2014, 1, 4), LocalDate.of(2014, 1, 4)));
        periodos.add(new PeriodoVO(IGOR_N, LocalDate.of(2014, 2, 3), LocalDate.of(2014, 2, 5)));
        periodos.add(new PeriodoVO(IGOR_1M, LocalDate.of(2014, 3, 3), LocalDate.of(2014, 3, 3)));
        periodos.add(new PeriodoVO(IGOR_2M, LocalDate.of(2014, 4, 3), LocalDate.of(2014, 4, 3)));
        periodos.add(new PeriodoVO(IGOR_3M, LocalDate.of(2014, 5, 3), LocalDate.of(2014, 5, 3)));
        periodos.add(new PeriodoVO(IGOR_4M, LocalDate.of(2014, 6, 3), LocalDate.of(2014, 6, 3)));
        periodos.add(new PeriodoVO(IGOR_5M, LocalDate.of(2014, 7, 3), LocalDate.of(2014, 7, 3)));
        periodos.add(new PeriodoVO(IGOR_6M, LocalDate.of(2014, 8, 3), LocalDate.of(2014, 8, 3)));
        periodos.add(new PeriodoVO(IGOR_7M, LocalDate.of(2014, 9, 3), LocalDate.of(2014, 9, 3)));
        periodos.add(new PeriodoVO(IGOR_8M, LocalDate.of(2014, 10, 3), LocalDate.of(2014, 10, 3)));
        periodos.add(new PeriodoVO(IGOR_9M, LocalDate.of(2014, 11, 3), LocalDate.of(2014, 11, 3)));
        periodos.add(new PeriodoVO(IGOR_10M, LocalDate.of(2014, 12, 3), LocalDate.of(2014, 12, 3)));
        periodos.add(new PeriodoVO(IGOR_11M, LocalDate.of(2015, 1, 3), LocalDate.of(2015, 1, 3)));
        
        periodos.add(new PeriodoVO(IGOR_BATIZADO, LocalDate.of(2014, 6, 29), LocalDate.of(2014, 6, 29)));
        
        periodos.add(new PeriodoVO(IGOR_1A, LocalDate.of(2015, 2, 7), LocalDate.of(2015, 2, 7)));
        periodos.add(new PeriodoVO(IGOR_2A, LocalDate.of(2016, 1, 30), LocalDate.of(2016, 1, 30)));
        
        periodos.add(new PeriodoVO(IGOR_1, LocalDate.of(2015, 2, 3), LocalDate.of(2015, 2, 3)));
        
        periodos.add(new PeriodoVO(VITOR_1A, LocalDate.of(2011, 11, 13), LocalDate.of(2011, 11, 14)));
        periodos.add(new PeriodoVO(VITOR_2A, LocalDate.of(2012, 11, 10), LocalDate.of(2012, 11, 10)));
        periodos.add(new PeriodoVO(LAURA_BATIZADO, LocalDate.of(2016, 7, 3), LocalDate.of(2016, 7, 3)));
        
        periodos.add(new PeriodoVO(BRUNO_31A, LocalDate.of(2011, 1, 12), LocalDate.of(2011, 1, 12)));
        periodos.add(new PeriodoVO(BRUNO_32A, LocalDate.of(2012, 1, 14), LocalDate.of(2012, 1, 14)));
        periodos.add(new PeriodoVO(BRUNO_33A, LocalDate.of(2013, 1, 12), LocalDate.of(2013, 1, 12)));
        
        periodos.add(new PeriodoVO(SILVANIA_28A, LocalDate.of(2007, 4, 29), LocalDate.of(2007, 4, 29)));
    }
}
