package br.com.map.dio_poo.domain;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoCocluidos = new LinkedHashSet<>();

    @RequiresApi(api = Build.VERSION_CODES.O)
    public  void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);

    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void  progredir(){
        Optional<Conteudo> conteudo =  this.conteudoInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoCocluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        } else {

         System.err.println("Você não está Matriculado em nenhum conteudo!");


        };

    };
    @RequiresApi(api = Build.VERSION_CODES.N)
    public double calcularTotalXp(){
        return this.conteudoCocluidos
                .stream()
                .mapToDouble(Conteudo::calularxp)
                .sum();

    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoCocluidos() {
        return conteudoCocluidos;
    }

    public void setConteudoCocluidos(Set<Conteudo> conteudoCocluidos) {
        this.conteudoCocluidos = conteudoCocluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudoCocluidos, dev.conteudoCocluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudoCocluidos);
    }
}
