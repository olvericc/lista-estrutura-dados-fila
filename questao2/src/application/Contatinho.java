package application;

public class Contatinho
{
    String nome, telefone;

    public Contatinho(String nome, String telefone)
    {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString()
    {
        return "Contatinhos " +
                "{" +
                    "nome = " + nome + '\'' +
                    ", telefone = " + telefone + '\'' +
                '}';
    }
}
