package application;

public class Main
{
    public static void main(String[] args)
    {
        Salinha salinha = new Salinha();
        int numero;

        do
        {
            System.out.println("\nMenu de seleção:\n1 - Inserir um novo aluno\n2 - Consultar alunos já cadastrados\n3 - Sair");
            System.out.print("Para continuar, insira um número correspondente: ");

            numero = salinha.sc.nextInt();
            salinha.sc.nextLine();

            switch (numero)
            {
                case 1:
                    salinha.inserir();
                    break;
                case 2:
                    salinha.consultar();
                    break;
                case 3:
                    salinha.sair();
                    break;
                default:
                    System.out.println("Tente novamente, por gentileza.");
            }
        }
        while (numero!= 3);
    }
}
