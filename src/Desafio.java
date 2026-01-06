import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String clienteName = "Alfrades Catala";
        double clienteSaldo = 2500.00;

        // Menu Inicial do Cliente.
        System.out.println("***************************************| Menu inicial |*************************************************");
        System.out.println("Nome do Cliente                  "+ clienteName);
        System.out.println("Tipo de conta                    Corrente");
        System.out.println(String.format("Saldo inicial                    R$%.2f", clienteSaldo));
        System.out.println("****************************************| Fim Menu | ****************************************************\n");

        // Opcoes e suas funcionalidades
        int escolha = 0;
        int count = 0;
        while (count != -1){
            System.out.println("1 - Consultar saldo. ");
            System.out.println("2 - Receber Valor. ");
            System.out.println("3 - Transferir valor. ");
            System.out.println("4 - Sair. ");

            System.out.println("Escolha uma opcao a sua escolha: ");
            escolha = leitura.nextInt();
            switch (escolha){
                case 1:
                    System.out.println(String.format("\n\nSaldo actual R$%.2f \n\n",clienteSaldo));
                    break;
                case 2:
                    System.out.println("Insira o valor a ser transferido em sua conta. ");
                    double valorTranferir = leitura.nextDouble();
                    clienteSaldo += valorTranferir;
                    System.out.println(String.format("\n\nValor que se encontra em sua conta actualmente R$%.2f\n\n", clienteSaldo));
                    break;
                case 3:
                    System.out.println("Insira o valor a tranferir para outra conta. ");
                    double valorEnviar = leitura.nextDouble();
                    if (clienteSaldo < valorEnviar ) {
                        System.out.println("\n\nSaldo insuficiente em sua conta. ");
                        System.out.println(String.format("Saldo disponivel para o uso R$%.2f\n\n", clienteSaldo));
                    }else {
                        clienteSaldo -= valorEnviar;
                        System.out.println("\n\nSaldo enviado com exito. ");
                        System.out.println(String.format("Saldo actual R$%.2f\n\n", clienteSaldo));
                    }
                    break;
                case 4:
                    System.out.println("\n\nSaiste do sistema com exito.");
                    count = -1;
                    break;
                default:
                    System.out.println("\n\nEsta opcao nao existe nesse nosso sistema. \n\n\n\n");
            count++;
        }
        }
    }

}
