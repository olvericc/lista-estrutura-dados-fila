package application;

public class Aluninho
{
    String nome;
    String matricula;
    int idade;

    public Aluninho(String nome, String matricula, int idade)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    @Override
    public String toString()
    {
        return "Aluninhos " +
                "{" +
                    "nome = " + nome + '\'' +
                    ", matricula = " + matricula + '\'' +
                    ", idade = " + idade +
                '}';
    }
}
