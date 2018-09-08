package br.edu.papayaSugar.entidade;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> listaAulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getListaAulas() {
        return Collections.unmodifiableList(listaAulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula){
        this.listaAulas.add(aula);
    }

    public int getTempoTotal(){
        return this.listaAulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public float getTempoMedio(){
        return getTempoTotal()/listaAulas.size();
    }

    @Override
    public String toString() {

        return "[Curso: "+ nome + ", tempo total: " + getTempoTotal()+" minutos" + ", aulas: "+ listaAulas+ " ]";
    }

    public void matriculaAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatricula(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
}
