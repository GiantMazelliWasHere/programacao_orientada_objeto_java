public class ContaBancaria {
    private String titular;
    private double saldo;
    private  int numeroConta;

    public ContaBancaria(String titular, double saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", 1000.0, 12345);
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Número da Conta: " + conta.getNumeroConta());

        conta.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        conta.sacar(200.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());

        conta.sacar(1500.0); // Tentativa de saque com saldo insuficiente
    }
}
