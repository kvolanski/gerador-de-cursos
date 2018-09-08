package br.edu.papayaSugar.controller;

import br.edu.papayaSugar.entidade.Aula;
import br.edu.papayaSugar.entidade.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {


        try {

            Curso javaCurso = new Curso("Dominando as coleções do Java","Paulo Silveira");

            javaCurso.adiciona(new Aula("Trabalhando com ArrayList",21));
            javaCurso.adiciona(new Aula("Criando uma aula",20));
            javaCurso.adiciona(new Aula("Modelando com coleções",24));

            List<Aula> aulasImutaveis = javaCurso.getListaAulas();
            System.out.println(aulasImutaveis);

            List<Aula> aulas = new ArrayList<>(aulasImutaveis);

            Collections.sort(aulas);
            System.out.println(aulas);

            System.out.println(javaCurso.getTempoTotal());
            System.out.println("A média de tempo dos cursos é de :"+javaCurso.getTempoMedio());

            System.out.println(javaCurso);






        }catch (Exception e){
                    System.out.println("algo de errado não está certo");
        }




    }


}
