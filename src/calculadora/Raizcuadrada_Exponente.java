
package calculadora;


public class Raizcuadrada_Exponente {
    
        public double Raiz(double valor1) {
        if (valor1 < 0) {
            throw new ArithmeticException("No se puede calcular la raiz cuadrada de un numero negativo");
        }

        return Math.sqrt(valor1);
    }

    public double Exponente(double valor1, double valor2) {
        return Math.pow(valor1, valor2);
    }
}

    

