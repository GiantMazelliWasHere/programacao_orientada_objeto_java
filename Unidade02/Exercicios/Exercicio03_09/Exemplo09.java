public class Exemplo09 {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", 1000.0, "12345-6", 0.05);
        contaPoupanca.calcularRendimento();
        contaPoupanca.calcularNovoSaldo();
        contaPoupanca.aplicarJuros();

        ContaCorrente contaCorrente = new ContaCorrente("João", 500.0, "65432-1", 200.0);
        contaCorrente.sacar(600.0);
        contaCorrente.consultarSaldo();
        contaCorrente.aplicarJuros();
    }
}
