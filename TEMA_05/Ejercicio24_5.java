/**
 * Ejercicio 24 | Tema 5
 * Pirámide de números.
 * @author Lucia Blanco
 */
 
 public class Ejercicio24_5 { // Clase principal
  public static void main(String[] args) {
  System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    for (int fil = 0; fil <= h; ++fil) {
      for (int col = 0; col <= h-fil-1; ++col) {
        System.out.print(" ");
      }
      int num = fil-1;
      for (int col = 1; col < 2*fil; ++col) {
        if (col <= fil){
          System.out.print(col);
        }
        if (col > fil){
          System.out.print(num);
          num--;
        }
      }
      System.out.println();
    }
  }
}
