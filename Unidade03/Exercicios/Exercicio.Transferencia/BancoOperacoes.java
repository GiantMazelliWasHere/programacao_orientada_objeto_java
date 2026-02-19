public class BancoOperacoes {
    public static void main(String[] args) {
        ContaBancariaTransferencia conta = new ContaBancariaTransferencia(1000.00);

        try {
            conta.transferir(200.00);
            System.out.println("Transferência realizada com sucesso. Saldo atual: " + conta.getSaldo());
        } catch (TransferenciaInvalidaException e) {
            System.out.println("Erro na transferência: " + e.getMessage());
        }

        try {
            conta.transferir(-50.00);
        } catch (TransferenciaInvalidaException e) {
            System.out.println("Erro na transferência: " + e.getMessage());
        }
    }
}
