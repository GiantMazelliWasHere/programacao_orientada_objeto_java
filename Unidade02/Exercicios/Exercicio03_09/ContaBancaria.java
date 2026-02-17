public class ContaBancaria {
    private String nomeTitular;
    private double saldo;
    private String numeroConta;

    public ContaBancaria(String nomeTitular, double saldo, String numeroConta) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void aplicarJuros() {
        System.out.println("Método genérico: nenhuma taxa aplicada.");
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
