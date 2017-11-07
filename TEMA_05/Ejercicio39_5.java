/**
 * Ejercicio 39 | Tema 5
 * Reloj de arena con asteriscos.
 * @author Lucia Blanco
 */
 
 public class Ejercicio39_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    int numUs = Integer.parseInt(System.console().readLine());
    int factorial = 1;
    for (int i = 1; i <= numUs; i++){
      factorial *= i;
      System.out.println(i+"! = "+factorial);
    }
  }
}
