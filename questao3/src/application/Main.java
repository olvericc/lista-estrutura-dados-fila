package application;

public class Main
{
    public static void main(String[] args)
    {
        Mercadinho mercadinho = new Mercadinho();
        int numero;

        do
        {
            System.out.println("\nMenu de seleção: \n1 - Inserir um novo cliente \n2 - Remover um cliente\n3 - Consultar Quantidade de Clientes \n4 - Sair do programa\n\n");
            System.out.print("Para continuar, insira um número correspondente: ");
            numero = Integer.parseInt(mercadinho.sc.nextLine());

            switch (numero) {
                case 1:
                    mercadinho.inserir();
                    break;
                case 2:
                    mercadinho.remover();
                    break;
                case 3:
                    mercadinho.consultarQtd();
                    break;
                case 4:
                    mercadinho.sair();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        while (numero != 4) ;
    }
}
