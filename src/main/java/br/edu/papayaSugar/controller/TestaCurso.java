package br.edu.papayaSugar.controller;

import br.edu.papayaSugar.entidade.Aula;
import br.edu.papayaSugar.entidade.Curso;

import java.util.List;
import java.util.logging.Logger;

public class TestaCurso {

    public static void main(String[] args) {


        try {


            Curso javaCurso = new Curso("Dominando as coleções do Java","Paulo Silveira");
            List<Aula> listaAulas = javaCurso.getListaAulas();

            //listaAulas.add(new Aula("Trabalhando com ArrayList",21));
            //javaCurso.getListaAulas().add(new Aula("Trabalhando com ArrayList",21));
            javaCurso.adiciona(new Aula("Trabalhando com ArrayList",21));
            javaCurso.adiciona(new Aula("Criando uma aula",20));
            javaCurso.adiciona(new Aula("Modelando com coleções",22));
            System.out.println(listaAulas);


            Aula [] array;


        }catch (Exception e){
                    System.out.println("algo de errado não está certo");
        }




    }


}
