package br.edu.papayaSugar.controller;

import br.edu.papayaSugar.entidade.Aluno;
import br.edu.papayaSugar.entidade.Aula;
import br.edu.papayaSugar.entidade.Curso;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {


    public static void main(String[] args) {

        Curso javaCurso = new Curso("Dominando as coleções do Java","Paulo Silveira");

        javaCurso.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaCurso.adiciona(new Aula("Criando uma aula",20));
        javaCurso.adiciona(new Aula("Modelando com coleções",24));


        Aluno aluno1 = new Aluno("Kevin Volanski",12454);
        Aluno aluno2 = new Aluno("Robson Manfroi",32154);
        Aluno aluno3 = new Aluno("Hyran Portes",344234);


        javaCurso.matriculaAluno(aluno1);
        javaCurso.matriculaAluno(aluno2);
        javaCurso.matriculaAluno(aluno3);

        System.out.println("Todos os alunos matriculados no curso: ");

        Set<Aluno> alunos = javaCurso.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()){
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }

        Vector<Aluno> vetor = new Vector<>();

        //iterator.forEachRemaining(aluno -> System.out.println(aluno));

        //javaCurso.getAlunos().forEach(a -> System.out.println(a));

//
//        System.out.println("O aluno " + aluno1 + "esta matriculado? ");
//        System.out.println(javaCurso.estaMatricula(aluno1));





    }


}
