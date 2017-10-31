/**
 * Ejercicio 19 | Tema 5
 * Pirámide llena.
 * @author Lucia Blanco
 */
 
 public class Ejercicio19_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el caracter: ");
    String car = System.console().readLine();
    for (int j = 0; j < h; ++j) {
      for (int i = 0; i < h-j-1; ++i) {
        System.out.print(" ");
      }
      for (int i = 0; i < 2*j+1; ++i) {
        System.out.print(car);
      }
      System.out.println();
    }
  }
}

