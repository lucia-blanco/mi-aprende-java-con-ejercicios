/**
 * Ejercicio 9 | Tema 5
 * Dice cuántos dígitos tiene el número introducido.
 * @author Lucia Blanco
 */
 
 public class Ejercicio09_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número ");
    int num = Integer.parseInt(System.console().readLine());
    int i;
    for (i = 0; num > 0; i++){
      num = num/10;
    }
    System.out.println("El número tiene "+i+" cifras.");
  }
}
