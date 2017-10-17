/**
 * Ejercicio 6 | Tema 4
 * Calcula el tiempo que tardará un objeto en caer desde una altura h.
 * @author Lucia Blanco
 */
 
 public class Ejercicio06_4 { // Clase principal
  public static void main(String[] args) {
    final double g = 9.81;
    /* Recibe altura */
    System.out.print("Por favor, introduce la altura: ");
    double h = Double.parseDouble(System.console().readLine());
    /* Calcula el tiempo y lo muestra */
    double tiempo = Math.sqrt((2*h)/g);
    System.out.printf("Un objeto a una altura %f, tarda %.3f segundos en caer", h, tiempo);
  }
}
