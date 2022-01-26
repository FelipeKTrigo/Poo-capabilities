package br.com.Poo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class bootcamp {
    private String Nome;
    private String descricao;
    private final LocalDate datainicial = LocalDate.now();
    private final LocalDate datafinal = datainicial.plusDays(45);
    private Set<Desenvolvedor> devsInscritos = new HashSet<>();
    private Set<conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDatainicial() {
        return datainicial;
    }

    public LocalDate getDatafinal() {
        return datafinal;
    }

    public Set<Desenvolvedor> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Desenvolvedor> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bootcamp bootcamp = (bootcamp) o;
        return Objects.equals(Nome, bootcamp.Nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(datainicial, bootcamp.datainicial) && Objects.equals(datafinal, bootcamp.datafinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, descricao, datainicial, datafinal, devsInscritos, conteudos);
    }
}
