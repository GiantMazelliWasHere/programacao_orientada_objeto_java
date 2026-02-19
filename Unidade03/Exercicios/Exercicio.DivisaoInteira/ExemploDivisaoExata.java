public class ExemploDivisaoExata {
    public static void main(String[] args) {
        DivisaoInteira divisao = new DivisaoInteira();
        
        try {
            divisao.divisaoExata(10, 2); // Deve ser exata
            divisao.divisaoExata(10, 3); // Não é exata, deve lançar a exceção
        } catch (DivisaoInteiraInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
