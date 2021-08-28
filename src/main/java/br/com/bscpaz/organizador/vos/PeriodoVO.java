package br.com.bscpaz.organizador.vos;

import java.time.LocalDate;

public class PeriodoVO {

    private String pasta;
    private LocalDate inicio;
    private LocalDate fim;
    
    public PeriodoVO(String pasta, LocalDate inicio, LocalDate fim) {
        this.pasta = pasta;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getPasta() {
        return pasta;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

}

