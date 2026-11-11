
package calculadora;


public class Mein {
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        ConversorTemperatura conversor = new ConversorTemperatura();
        Raizcuadrada_Exponente operaciones = new Raizcuadrada_Exponente();

        double valor1 = 20;
        double valor2 = 5;
        double valor3 = 2;

        // Operaciones de la calculadora
        System.out.println("===== CALCULADORA =====");

        System.out.println("Suma: " + calculadora.sumar(valor1, valor2));
        System.out.println("Resta: " + calculadora.resta(valor1, valor2));
        System.out.println("Multiplicacion: " + calculadora.multiplicacion(valor1, valor2));
        System.out.println("Division: " + calculadora.dividir(valor1, valor2));

        // Conversion de temperatura
        System.out.println("\n===== CONVERSOR DE TEMPERATURA =====");

        System.out.println("Fahrenheit a Celsius: "
                + conversor.fahrenheitACelsius(valor1));

        System.out.println("Celsius a Fanrenheit: "
                + conversor.celsiusAFahrenheit(valor1));

        // Raiz cuadrada y exponente
        System.out.println("\n===== RAIZ CUADRADA Y EXPONENTE =====");

        System.out.println("raiz cuadrada: "
                + operaciones.Raiz(valor1));

        System.out.println("exponente: "
                + operaciones.Exponente(valor1, valor3));
    }
        
}
    

