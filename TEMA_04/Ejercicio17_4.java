/**
 * Ejercicio 17 | Tema 4
 * Ultima cifra de un número entero.
 * @author Lucia Blanco
 */
 
 public class Ejercicio17_4 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Por favor, introduce un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
    //Calcula la última cifra y la muestra
    System.out.println(" La última cifra de " +num+ " es: " +(num % 10));
  }
}
