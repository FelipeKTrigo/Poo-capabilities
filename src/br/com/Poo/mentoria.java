package br.com.Poo;

import java.time.LocalDate;

public class mentoria extends conteudo{

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                 "data=" + data +
                '}';
    }

    @Override
    public double CalculoXP() {
        return XP_PADRAO + 20d;
    }
}
