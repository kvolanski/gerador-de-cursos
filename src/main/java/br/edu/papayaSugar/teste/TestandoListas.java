package br.edu.papayaSugar.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

    public static void main(String[] args) {

        //criando as aulas
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe de Aula";
        String aula3 = "Trabalhando com cursos e sets";
        String aula4 = "Aumentando nosso conhecimento";


        final ArrayList<String> listaAulas = new ArrayList<String>();

        //adicionando aulas na lista de aulas
        listaAulas.add(aula1);
        listaAulas.add(aula2);
        listaAulas.add(aula3);
        listaAulas.add(aula4);

        //mostrando no console as aulas na minha lista de aulas
        System.out.println(listaAulas);

        //removendo a primeira aula da lista de aulas
        listaAulas.remove(0);

        //mostrando minha lista de aulas depois de remover uma delas.
        System.out.println(listaAulas);

        //mostrando minhas aulas uma embaixo da outra por meio de um forEach
        for (String  aula : listaAulas){
            System.out.println("Aula: " + aula);
        }

        //pegando a primeira aula e guardando em uma variavel
        String primeiraAula = listaAulas.get(0);
        //mostrando a aula que guardei na variavel
        System.out.println("A primeira aula é " + primeiraAula);

        //motrando as minhas aulas.
        for (int i = 0; i < listaAulas.size(); i++) {
            System.out.println("Aula : "+ listaAulas.get(i));
        }

        //usando lambda
        listaAulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula: "+ aula);
        });

        //ordenando minha lista de aulas por ordem alfabética
        Collections.sort(listaAulas);
        System.out.println("Lista ordenada por ordem alfabética");
        System.out.println(listaAulas);

        //ordenando a minha lista de aulas por ordem decrescente alfabética
        Collections.reverse(listaAulas);
        System.out.println("Lista ordenada por ordem inversa alfabética");
        System.out.println(listaAulas);




    }





}
