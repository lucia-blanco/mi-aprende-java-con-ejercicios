/**
 * Ejercicio 23 | Tema 5
 * Introduce una serie de números hasta que su sumatorio sea < 1000 y hace la media.
 * @author Lucia Blanco
 */
 
 public class Ejercicio23_5 { // Clase principal
  public static void main(String[] args) {
    double num = 0;
    double dividendo = 0;
    double contador = 0;
    do{
      System.out.print("Introduce un número ");
      num = Double.parseDouble(System.console().readLine());
      dividendo = dividendo + num;
      contador++;
    } while (dividendo < 1000);
    dividendo -= num;
    double media = (dividendo-num)/(contador-2);
    System.out.println("Ha introducido "+contador+" números.");
    System.out.println("La suma de todos los números es: "+dividendo+".");
    System.out.println("La media es: "+ media +".");
  }
}
  
