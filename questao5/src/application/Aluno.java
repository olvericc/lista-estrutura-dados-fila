package application;

public class Aluno
{
    String nome;
    int idade;

    public Aluno(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString()
    {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
