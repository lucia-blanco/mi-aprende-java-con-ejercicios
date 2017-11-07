/**
 * Ejercicio 38 | Tema 5
 * Reloj de arena con asteriscos.
 * @author Lucia Blanco
 */
 
 public class Ejercicio38_5 { // Clase principal
  public static void main(String[] args) {
  int h = 0;
    do {
      System.out.print("Introduce la altura (debe ser mayor de 3): ");
      h = Integer.parseInt(System.console().readLine());
    } while (h < 3);
    int altura = h;
    // Parte superior
    for (int fil = 1; fil <= (h/2)+1; fil++){
      for (int col = 1; col <= altura; col++){
        if (col <= h-altura){
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      altura --;
      System.out.println();
    }
    for (int fil = (h/2)+2; fil <= (h); ++fil) {
      int col = 1;
      while (col <= h-fil) {
        System.out.print(" ");
        col++;
      }
      int asteriscos = fil-col;
      while (col <= fil) {
        System.out.print("*");
        col++;
      }
      System.out.println();
    }
  }
}
