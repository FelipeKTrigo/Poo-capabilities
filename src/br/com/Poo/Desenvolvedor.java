package br.com.Poo;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Desenvolvedor {
    private  String Nome;
    private Set<conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void InscreverBootcamp (bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir (){
       Optional<conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
       if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
       }else{
           System.err.println("voce não esta matriculado em nenhum conteudo")   ;
       }
    }
    public double calcularTotalXP(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.CalculoXP()).sum();

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
    public Set<conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Desenvolvedor that = (Desenvolvedor) o;
        return Objects.equals(Nome, that.Nome) && Objects.equals(conteudosInscritos, that.conteudosInscritos) && Objects.equals(conteudosConcluidos, that.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, conteudosInscritos, conteudosConcluidos);
    }
}
