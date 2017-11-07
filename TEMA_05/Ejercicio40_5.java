/**
 * Ejercicio 40 | Tema 5
 * Rombo hueco.
 * @author Lucia Blanco
 */
 
 public class Ejercicio40_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    int h1 = (h/2)+1;
    int h2 = h/2;
    // Primera mitad
    for (int fil = 0; fil < h1; ++fil) {
      for (int col = 0; col < h1-fil-1; ++col) {
        System.out.print(" ");
      }
      for (int col = 0; col < 2*fil+1; ++col) {
        if ((col == 0) || (col == 2*fil)){
        System.out.print("*");
        }else { 
        System.out.print(" ");
        }
      }
      System.out.println();
    }
    // Segunda mitad
    int col = 0;
    for (int fil = 1; fil <= h2; ++fil) {
      col = 1;
      while (col <= fil){
        System.out.print(" ");
        col++;
      }
      int rombo = (h - fil*2);
      for (int i = 1; i <= rombo; i++){
        if ((i == 1) || (i == rombo)){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
