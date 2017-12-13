/**
 * Ejercicio 23 | Tema 6
 * Simula la tirada de cinco dados de póker.
 * @author Lucia Blanco
 */
 
 public class Ejercicio23_6 { // Clase principal
  public static void main(String[] args) {
    final int numTiradas = 5;
    System.out.print("Tirada: ");
    for (int i = 0; i < numTiradas; i++){
    int dado = (int)(Math.random()*6) + 1;
      switch (dado){
        case 1:
          System.out.print("As");
          break;
        case 2:
          System.out.print("K");
          break;
        case 3:
          System.out.print("Q");
          break;
        case 4:
          System.out.print("J");
          break;
        case 5:
          System.out.print("7");
          break;
        default:
          System.out.print("8");
      }
      System.out.print(" ");
    }
  }
}
