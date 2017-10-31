/**
 * Ejercicio 20 | Tema 5
 * Pirámide vacia.
 * @author Lucia Blanco
 */
 
 public class Ejercicio20_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el caracter: ");
    String car = System.console().readLine();
    for (int fil = 0; fil < h-1; ++fil) {
      for (int col = 0; col < h-fil-1; ++col) {
        System.out.print(" ");
      }
      for (int col = 0; col < 2*fil+1; ++col) {
        if ((col == 0) || (col == 2*fil)){
        System.out.print(car);
        }else { 
        System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int col = 0; col < 2*h-1; ++col) {
      System.out.print(car);
    }
  }
}
