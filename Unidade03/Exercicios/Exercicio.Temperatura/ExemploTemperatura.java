public class ExemploTemperatura {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();
        
        try {
            conversor.converterCelsiusParaFahrenheit(25);
            conversor.converterCelsiusParaFahrenheit(-300);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
