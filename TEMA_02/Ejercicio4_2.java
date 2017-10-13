/**
 * Ejercicio 4 | Tema 2
 * Conversor de euros a pesetas.
 * @author Lucia Blanco
 */

public class Ejercicio4_2 { // Clase principal
  public static void main(String[] args) {
    float euros = 2;
    int pesetas = (int)(euros*166.86);
    
    System.out.printf("%f euros son %d   pts.", euros, pesetas);
    
  }
}
