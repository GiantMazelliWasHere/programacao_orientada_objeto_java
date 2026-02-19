public class ContaCorrente extends ContaBancaria {
    private int anoAbertura;

    public ContaCorrente(String nomeTitular, double saldo, String numeroConta, double limite, int anoAbertura) {
        super(nomeTitular, saldo, numeroConta, 0);
        this.anoAbertura = anoAbertura;
    }

    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void aniversario() {
        int anoAtual = java.time.Year.now().getValue();
        if (anoAtual - anoAbertura >= 1) {
            System.out.println("Parabéns! Hoje é o aniversário da conta de " + getNomeTitular() + "!");
        } else {
            System.out.println("A conta de " + getNomeTitular() + " ainda não completou um ano.");
        }
    }

    @Override
    public void aplicarJuros() {
        double taxa = 0.15; // 15%
        double juros = getSaldo() * taxa;
        setSaldo(getSaldo() + juros);
        System.out.printf("[Conta Corrente] Juros de 15%% aplicados: +R$%.2f%n", juros);
    }

    public int getAnoAbertura() {
        return anoAbertura;
    }

    public void setAnoAbertura(int anoAbertura) {
        if (anoAbertura > 0) {
            this.anoAbertura = anoAbertura;
        } else {
            System.out.println("Ano de abertura inválido. O ano deve ser positivo.");
        }
    }
}
