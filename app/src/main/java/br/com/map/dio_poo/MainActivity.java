package br.com.map.dio_poo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

import java.time.LocalDate;

import br.com.map.dio_poo.domain.Bootcamp;
import br.com.map.dio_poo.domain.Curso;
import br.com.map.dio_poo.domain.Dev;
import br.com.map.dio_poo.domain.Mentoria;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Curso curso1 = new Curso();
           curso1.setTitulo("curso Java");
           curso1.setDescricao("descrição do curso java");
           curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso Kotlin");
        curso1.setDescricao("descrição do curso kotlin");
        curso1.setCargahoraria(108);

       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("Mentoria Java");
       mentoria.setDescricao("descrição");
       mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWesley = new Dev();
        devWesley.setNome("Wesley");
        devWesley.inscreverBootcamp(bootcamp);


        System.out.println("Conteudo Incritos Wesley:"+ devWesley.getConteudoInscritos());
        devWesley.progredir();
        devWesley.progredir();
        System.out.println("-");
        System.out.println("Conteudo Incritos Wesley:"+ devWesley.getConteudoInscritos());
        System.out.println("Conteudo Concluidos Wesley:"+ devWesley.getConteudoCocluidos());


        System.out.println("-----------------");


        Dev devJoão = new Dev();
        devJoão.inscreverBootcamp(bootcamp);
        devJoão.setNome("João");
        System.out.println("Conteudo Incritos João:"+ devJoão.getConteudoInscritos());
        devJoão.progredir();
        devJoão.progredir();
        devJoão.progredir();
            System.out.println("-");
        System.out.println("Conteudo Incritos João:"+ devJoão.getConteudoInscritos());
        System.out.println("Conteudo Concluido João:"+ devJoão.getConteudoCocluidos());
        System.out.println("------------------");
    }
}