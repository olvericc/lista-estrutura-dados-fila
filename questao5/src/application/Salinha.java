package application;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Salinha
{
    private PriorityQueue<Aluno> Alunos = new PriorityQueue<>(Comparator.comparingInt(a -> a.idade));
    final Scanner sc = new Scanner(System.in);

    public void inserir()
    {
        System.out.print("Primeiro, forneça o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Segundo, forneça a idade do aluno: ");
        int idade = sc.nextInt();

        sc.nextLine();

        Alunos.add(new Aluno(nome, idade));
        System.out.println("Aluno inserido com sucesso!");
    }

    public void consultar()
    {
        System.out.println("Os alunos cadastrados na fila são:");
        for (Aluno aluno : Alunos)
        {
            System.out.println(aluno);
        }
    }

    public void sair()
    {
        System.exit(0);
    }

}
