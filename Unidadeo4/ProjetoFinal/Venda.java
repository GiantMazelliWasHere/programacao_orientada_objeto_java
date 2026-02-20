import java.time.LocalDateTime;

public class Venda {
    private Veiculo veiculo;
    private Pessoa comprador;
    private double valorVenda;
    private LocalDateTime dataVenda;

    public Venda(Veiculo veiculo, Pessoa comprador, double valorVenda, LocalDateTime dataVenda) {
        this.veiculo = veiculo;
        this.comprador = comprador;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
    }

    public void exibirDetalhesVenda() {
        System.out.println("Detalhes da Venda:");
        System.out.println("Veiculo: " + veiculo.getModelo() + " - Ano: " + veiculo.getAno());
        System.out.println("Comprador: " + comprador.getNome() + " - Contato: " + comprador.getTelefone());
        System.out.println("Valor da Venda: R$ " + valorVenda);
        System.out.println("Data da Venda: " + dataVenda);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Pessoa getComprador() {
        return comprador;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setComprador(Pessoa comprador) {
        this.comprador = comprador;
    }

    public void setValorVenda(double valorVenda) {
        if (valorVenda < 0) {
            throw new IllegalArgumentException("Valor de venda inválido");
        }
        this.valorVenda = valorVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }
    
}
