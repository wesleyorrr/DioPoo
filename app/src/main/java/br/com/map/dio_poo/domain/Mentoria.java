package br.com.map.dio_poo.domain;

import java.time.LocalDate;

public class  Mentoria extends Conteudo {

   private LocalDate data;
    @Override
    public double calularxp() {
        return XP_PADRAO + 20;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        return "Curso{" +
                "titulo='" +getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", Local Data=" + data +
                '}';
    }
}
