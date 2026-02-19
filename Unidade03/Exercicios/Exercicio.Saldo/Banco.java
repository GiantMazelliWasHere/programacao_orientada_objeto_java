public class Banco {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaBancaria conta = new ContaBancaria(1000.00);
        
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());
        
        try {
            conta.sacar(200.00);
            conta.sacar(900.00); // Tentativa de saque que excede o saldo
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
