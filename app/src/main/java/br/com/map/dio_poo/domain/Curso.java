package br.com.map.dio_poo.domain;

public class  Curso extends Conteudo{



    private int cargahoraria;

    public Curso() {
    }

    @Override
    public double calularxp() {
        return XP_PADRAO * cargahoraria;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" +getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }


}
