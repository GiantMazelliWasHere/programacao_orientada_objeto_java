public class ConversorTemperatura {
    public void converterCelsiusParaFahrenheit(double celsius) {
        if(celsius < -273.15) {
            throw new IllegalArgumentException("A temperatura em Celsius não pode ser menor que -273.15°C");
        }
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C é igual a " + fahrenheit + "°F");
    }
}
