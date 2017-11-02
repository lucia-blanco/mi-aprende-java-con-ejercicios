/**
 * Ejercicio 31 | Tema 5
 * Pinta la letra L por pantalla hecha con asteriscos.
 * @author Lucia Blanco
 */
 
 public class Ejercicio31_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    for (int i = 0; i < h-1; i++){
      System.out.println("*");
    }
    for (int i = 0; i < ((h/2)+1); i++){
      System.out.print("* ");
    }
  }
}
