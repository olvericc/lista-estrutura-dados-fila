package application;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Mercadinho
{
    private final Queue<String> Clientes = new ArrayDeque<>();
    final Scanner sc = new Scanner(System.in);

    public void inserir()
    {
        System.out.print("Primeiro, forneça o nome do cliente: ");
        String nome = sc.nextLine();
        Clientes.add(nome);

        System.out.println("O cliente foi inserido com sucesso!");
    }

    public void remover()
    {
        if (!Clientes.isEmpty())
        {
            String clienteRemovido = Clientes.remove();
            System.out.println("O cliente removido foi: " + clienteRemovido);
        }
        else
        {
            System.out.println("A fila está vazia.");
        }
    }

    public void consultarQtd()
    {
        int qtdClientes = Clientes.size();
        System.out.println("A quantidade de clientes na fila são: " + qtdClientes);
    }

    public void sair()
    {
        System.exit(0);
    }
}
