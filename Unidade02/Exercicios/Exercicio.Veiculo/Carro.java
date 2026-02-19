public class Carro extends Veiculo {
    private String motor;

    public Carro(String marca, String modelo, int ano, String motor) {
        super(marca, modelo, ano);
        this.motor = motor;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Motor: " + motor);
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }    
}
