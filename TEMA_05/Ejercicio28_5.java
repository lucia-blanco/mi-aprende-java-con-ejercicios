/**
 * Ejercicio 28 | Tema 5
 * Escribe un programa que calcule el factorial de un número entero leído por teclado.
 * @author Lucia Blanco
 */
 
 public class Ejercicio28_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    int numUs = Integer.parseInt(System.console().readLine());
    int factorial = 1;
    for (int i = 1; i <= numUs; i++){
      factorial *= i;
    }
    System.out.print(numUs+"! = "+factorial);
  }
}
