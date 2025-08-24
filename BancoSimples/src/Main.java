import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;

        System.out.println("Seja bem-vindo!!!\n");

        System.out.println("Digite o numéro da conta: ");
        String numConta = scan.nextLine();
        System.out.println("Digite o nome do titular da conta: ");
        String nomeTitular = scan.nextLine();
        System.out.println("Deseja realizar o depósito inicial? Sim ou Não?");
        String reposta = scan.nextLine();
        ContaBancaria conta = new ContaBancaria(numConta, nomeTitular);
        if (reposta.equalsIgnoreCase("Sim")) {
            System.out.println("Digite o valor do depósito inicial: ");
            double depositoInicial = scan.nextDouble();
            scan.nextLine();
            conta.DepositoInicial(depositoInicial);
            System.out.println("\nConta criada com sucesso!");
            conta.DadosConta();
        } else {
            System.out.println("\nConta criada com sucesso!");
            conta.DadosConta();
        }

        while (loop) {


            System.out.println("--- MENU ---\n" + "⦁\t1. Depositar\n" + "⦁\t2. Sacar\n" + "⦁\t3. Consultar Saldo\n" + "⦁\t4. Sair");
            int escolha = scan.nextInt();
            scan.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o valor desejado para depósito: ");
                    double valorDeposito = scan.nextDouble();
                    scan.nextLine();
                    conta.Deposito(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor desejado para o saque: ");
                    double valorSaque = scan.nextDouble();
                    scan.nextLine();
                    conta.Saque(valorSaque);
                    break;

                case 3:
                    conta.ConsultarSaldo();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    loop = false;
                    break;

                default:
            }
        }


    }
}