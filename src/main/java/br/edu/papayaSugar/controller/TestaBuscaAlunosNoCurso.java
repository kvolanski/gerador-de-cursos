package br.edu.papayaSugar.controller;

import br.edu.papayaSugar.entidade.Aluno;
import br.edu.papayaSugar.entidade.Aula;
import br.edu.papayaSugar.entidade.Curso;

public class TestaBuscaAlunosNoCurso {

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

        System.out.println("Quem é o aluno com a matricula 5617?");
        Aluno aluno  = javaCurso.buscaMatricula(3215);
        System.out.println("Aluno: "+ aluno);

    }


}
