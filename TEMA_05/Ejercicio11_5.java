/**
 * Ejercicio 11 | Tema 5
 * Cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * @author Lucia Blanco
 */
 
 public class Ejercicio11_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número ");
    double base = Double.parseDouble(System.console().readLine());
    int contador;
    System.out.printf("%15s %15s %15s \n", "Número", "Cuadrado", "Cubo");
    for (contador = 1; contador < 6; contador++){
      double cuadrado = Math.pow(base, 2);
      double cubo = Math.pow(base, 3);
      System.out.printf("%15f %15f %15f \n", base, cuadrado, cubo);
      base++;
    }
  }
}
