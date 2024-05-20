package application;

import java.util.ArrayDeque;
import java.util.Scanner;

public class CallCenter
{
    private final ArrayDeque<Object> filaDeContatos = new ArrayDeque<>().clone();
    final Scanner sc = new Scanner(System.in);

    public void inserir()
    {
        System.out.print("Digite o nome do contatinho: ");
        String nome = sc.nextLine();

        System.out.print("Digite o telefone do contatinho: ");
        String telefone = sc.nextLine();

        filaDeContatos.addLast(new Contatinho(nome, telefone));
        System.out.println("O contatinho foi inserido com sucesso.");
    }

    public void proximo()
    {
        if (!filaDeContatos.isEmpty())
        {
            Contatinho contatinho = (Contatinho) filaDeContatos.removeFirst();

            System.out.println(contatinho.toString());
        }
        else
        {
            System.out.println("A fila de contatinhos está vazia.");
        }
    }

    public void sair()
    {
        System.exit(0);
    }
}
