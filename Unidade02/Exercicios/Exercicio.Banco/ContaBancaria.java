public class ContaBancaria {
    private String nomeTitular;
    private double saldo;
    private String numeroConta;
    private int limite;

    public ContaBancaria(String nomeTitular, double saldo, String numeroConta, int limite) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.limite = limite;
    }

    public void depositar(double valor) {
        if (valor > 0 && valor <= limite) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo e dentro do limite.");
        }
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

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        if (limite >= 0) {
            this.limite = limite;
        } else {
            System.out.println("Limite inválido. O limite deve ser um valor positivo.");
        }
    }
}
