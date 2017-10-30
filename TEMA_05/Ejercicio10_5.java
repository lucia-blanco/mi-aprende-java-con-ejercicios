/**
 * Ejercicio 10 | Tema 5
 * Calcula la media de un conjunto de números.
 * @author Lucia Blanco
 */
 
 public class Ejercicio10_5 { // Clase principal
  public static void main(String[] args) {
    double num = 0;
    double dividendo = 0;
    double contador = 0;
      do{
        System.out.print("Introduce un número ");
        num = Double.parseDouble(System.console().readLine());
        dividendo = dividendo + num;
        contador++;
      } while (num > 0);
      double media = (dividendo-num)/(contador-1);
      System.out.println("La media es: "+ media +" .");
    }
  }
