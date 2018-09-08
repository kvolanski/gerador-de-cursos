package br.edu.papayaSugar.controller;

import java.util.*;

public class TestaAlunos {


    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();
        alunos.add("Kevin Volanski");
        alunos.add("Alberto Souza");
        alunos.add("Robson Manfroi");
        alunos.add("Hyran Portes");
        alunos.add("Tiago Cesar");
        alunos.add("Diego Cit");

        List<String> listaAlunos = new ArrayList<>(alunos);


        boolean estaMatriculado = alunos.contains("Kevin Volanski");

        System.out.println(estaMatriculado);

        for (String aluno : alunos){
            System.out.println(aluno);
        }

        System.out.println(alunos);


    }
}
