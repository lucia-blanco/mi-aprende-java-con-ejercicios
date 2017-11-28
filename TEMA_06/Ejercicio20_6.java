/**
 * Ejercicio 20 | Tema 6
 * Cuba de agua.
 * @author Lucia Blanco
 */
 
 public class Ejercicio20_6 { // Clase principal
  public static void main(String[] args) {
    final int anchoCuba = 6;
    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidad = Integer.parseInt(System.console().readLine());
    int litros = (int)(Math.random()*capacidad);
    for (int y = 0; y < capacidad; y++){
      for (int x = 0; x < anchoCuba; x++){
        if ((x == 0) || (x == anchoCuba-1)){
          System.out.print("*");
        } else {
          if (y < (capacidad - litros)){
            System.out.print(" ");
          } else {
            System.out.print("=");
          }
        }
      }
      System.out.println();
    }
    for (int i = 0; i < anchoCuba; i++){
      System.out.print("*");
    }
    System.out.println();
    System.out.println("La cuba tiene capacidad de " + capacidad + " litros y contiene " + litros + " litros de agua.");
  }
}
