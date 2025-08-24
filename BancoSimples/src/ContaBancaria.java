import java.text.DecimalFormat;

public class ContaBancaria {
    private final String numConta;
    private final String nomeTitular;
    private double saldo;

    public ContaBancaria(String numConta, String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.saldo = 0;

    }

    DecimalFormat numFormatado = new DecimalFormat("#,##0.00");

    public double DepositoInicial(double valor){
        double novoSaldo = 0;
        if (valor > 0) {
            novoSaldo = saldo += valor;
        }else {
            System.err.println("Error!!!!, não é possivel fazer deposito negativo.");
        }
        return novoSaldo;
    }

    public double Deposito(double valor) {
        double novoSaldo = 0;
        if (valor > 0) {
            novoSaldo = saldo += valor;
            String novoSaldoFormatado = numFormatado.format(novoSaldo);
            System.out.println("Deposito realizado com sucesso!! " +
                    "\nNovo saldo: R$" + novoSaldoFormatado);
        } else {
            System.err.println("Error!!!!, não é possivel fazer deposito negativo.");
        }
        return novoSaldo;
    }

    public double Saque(double valor) {
        double novoSaldo = 0;
        if (valor <= saldo) {
            if (valor > 0) {
                novoSaldo = saldo -= valor;
                String novoSaldoFormatado = numFormatado.format(novoSaldo);
                System.out.println("Saque realizado com sucesso!! " +
                        "\nNovo saldo: R$" + novoSaldoFormatado);
            } else {
                System.err.println("Error!!!!, não é possivel sacar um valor negativo.");
            }
        } else {
            System.err.println("Error!!!! saldo insuficiente");
        }
        return novoSaldo;
    }

    public void ConsultarSaldo() {
        String SaldoFormatado = numFormatado.format(saldo);
        System.out.println("Saldo atual: R$" + SaldoFormatado);
    }

    public void DadosConta(){
        String SaldoFormatado = numFormatado.format(saldo);
        System.out.println("\n"+"---Dados Conta---" + "\n Numéro Conta: " + numConta
                + "\n Nome Titular: " + nomeTitular + "\n Saldo Conta: R$" + SaldoFormatado + "\n");
    }

}
