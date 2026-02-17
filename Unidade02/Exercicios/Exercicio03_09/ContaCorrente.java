public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String nomeTitular, double saldo, String numeroConta, double limite) {
        super(nomeTitular, saldo, numeroConta);
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void aplicarJuros() {
        double taxa = 0.15; // 15%
        double juros = getSaldo() * taxa;
        setSaldo(getSaldo() + juros);
        System.out.printf("[Conta Corrente] Juros de 15%% aplicados: +R$%.2f%n", juros);
    }
}
