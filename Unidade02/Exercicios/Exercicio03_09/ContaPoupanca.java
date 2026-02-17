public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String nomeTitular, double saldo, String numeroConta, double taxaRendimento) {
        super(nomeTitular, saldo, numeroConta);
        this.taxaRendimento = taxaRendimento;
    }

    public void calcularRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento calculado: " + rendimento);
    }

    public void calcularNovoSaldo() {
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento aplicado: R$" + rendimento + ". Novo saldo: R$" + getSaldo());
    }

    @Override
    public void aplicarJuros() {
        double taxa = 0.065; // 6,5%
        double juros = getSaldo() * taxa;
        setSaldo(getSaldo() + juros);
        System.out.printf("[Conta Poupança] Juros de 6.5%% aplicados: +R$%.2f%n", juros);
    }
    
}
