public class ContaBancariaTransferencia {
    private double saldo;

    public ContaBancariaTransferencia(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void transferir(double valor) throws TransferenciaInvalidaException {
        if (valor <= 0) {
            throw new TransferenciaInvalidaException("O valor da transferência deve ser positivo.");
        }
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
        this.saldo = saldo;
    }
}
