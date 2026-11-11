
package calculadora;


public class ConversorTemperatura {
    
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
}
