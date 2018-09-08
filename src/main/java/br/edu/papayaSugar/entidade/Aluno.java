package br.edu.papayaSugar.entidade;

public class Aluno {

    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if (nome == null){
            throw new NullPointerException("Nome não pode ser null");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "[ Aluno: "  + nome + ", Matricula: "+ matricula + ".]";
    }

    @Override
    public boolean equals(Object obj) {

        Aluno outro = (Aluno) obj;
        return this.nome.equals(((Aluno) obj).nome);

    }


    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
