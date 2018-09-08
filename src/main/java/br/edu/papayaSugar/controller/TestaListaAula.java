package br.edu.papayaSugar.controller;

import br.edu.papayaSugar.entidade.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {

    public static void main(String[] args) {


        Aula aula1 = new Aula("Revisitando os ArrayLists",21);
        Aula aula2 = new Aula("Lista de objetos",20);
        Aula aula3 = new Aula("Relacionamento de listas e objetos",15);

        ArrayList<Aula> listaAulas = new ArrayList<>();
        listaAulas.add(aula1);
        listaAulas.add(aula2);
        listaAulas.add(aula3);

      //  System.out.println(listaAulas);

        Collections.sort(listaAulas);

        System.out.println(listaAulas);

        Collections.sort(listaAulas,Comparator.comparing(Aula::getTempo));
        System.out.println(listaAulas);

        listaAulas.sort(Comparator.comparing(Aula::getTempo));
        listaAulas.sort(Comparator.comparing(Aula::getTitulo));
        System.out.println(listaAulas);

    }


}
