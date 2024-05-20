package application;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        CallCenter callCenter = new CallCenter();
        int numero;

        do
        {
            System.out.println("\nMenu de seleção: \n1 - Inserir um novo contato \n2 - Próximo contato \n3 - Sair");
            System.out.print("Para continuar, insira um número correspondente: ");
            numero = callCenter.sc.nextInt();
            callCenter.sc.nextLine();

            switch (numero)
            {
                case 1:
                    callCenter.inserir();
                    break;
                case 2:
                    callCenter.proximo();
                    break;
                case 3:
                    callCenter.sair();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        while (true);
    }
}
