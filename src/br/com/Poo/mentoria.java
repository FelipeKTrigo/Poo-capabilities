package br.com.Poo;

import java.time.LocalDate;

public class mentoria extends conteudo{

    private LocalDate data;

    @Override
    public double CalculoXP() {
        return XP_PADRAO + 20d;
    }
}
