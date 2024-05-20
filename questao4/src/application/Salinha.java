package application;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Salinha
{
    private final PriorityQueue<Aluninho> Alunos = new PriorityQueue<>(Comparator.comparingInt(a -> a.idade));
    final Scanner sc = new Scanner(System.in);

    public void inserir()
    {
        System.out.print("Primeiro, forneça o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Segundo, forneça a matrícula do aluno: ");
        String matricula = String.valueOf(sc.nextInt());

        System.out.print("Terceiro, forneça a idade do aluno: ");
        int idade = sc.nextInt();
        sc.nextLine();

        Alunos.add(new Aluninho(nome, matricula, idade));
        System.out.println("O aluno foi cadastrado com sucesso.");
    }

    public void consultar()
    {
        System.out.println("Alunos na fila da sala de aula são:");

        for (Aluninho aluninho : Alunos)
        {
            System.out.println(aluninho);
        }
    }

    public void sair()
    {
        System.exit(0);
    }
}
