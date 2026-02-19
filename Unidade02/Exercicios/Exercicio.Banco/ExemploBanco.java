public class ExemploBanco {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", 1000.0, "12345-6", 500, 0.065);
        contaPoupanca.calcularRendimento();
        contaPoupanca.calcularNovoSaldo();
        contaPoupanca.aplicarJuros();

        ContaCorrente contaCorrente = new ContaCorrente("João", 500.0, "65432-1", 200, 2020);
        contaCorrente.aniversario();
        contaCorrente.sacar(100.0);
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(300.0);
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(800.0); // Tentativa de saque que excede o limite
        contaCorrente.consultarSaldo();
        contaCorrente.aplicarJuros();
    }
}
