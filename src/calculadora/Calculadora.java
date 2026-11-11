
package calculadora;

public class Calculadora {
    
    public double sumar (double valor1, double valor2){
    
        
        return valor1 + valor2;
    
    }
    
    public double resta (double valor1, double valor2){
    
        
        return valor1 - valor2;
    
    }
    
    public double multiplicacion  (double valor1, double valor2){
    
        
        return valor1 * valor2;
    
    }
    
  public double dividir(double valor1, double valor2) {

    if (valor2 == 0) {
        throw new ArithmeticException("No se puede dividir entre cero.");
    }

    return valor1 / valor2;
}
    

    
    
}
