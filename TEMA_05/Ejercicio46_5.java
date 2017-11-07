/**
 * Ejercicio 46 | Tema 5
 * Pinta un rectágulo de la altura y anchura indicados.
 * @author Lucia Blanco
 */
 
 public class Ejercicio46_5 { // Clase principal
  public static void main(String[] args) {
    int h = 0;
    int w = 0;
    do{
      System.out.print("Introduce la altura: ");
      h = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce la anchura: ");
      w = Integer.parseInt(System.console().readLine());
      if ((h < 2) || (w < 2)){
        System.out.println("Los datos introducidos son incorrectos, la altura y anchura deben ser mayor que 2.");
      }
    } while ((h < 2) || (w < 2));
    for (int fil = 0; fil < h; fil++){
      for (int col = 0; col < w; col++){
        if ((fil == 0) || (fil == (h-1))){
          System.out.print("* ");
        } else {
          if ((col == 0) || (col == (w-1))){
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        }
      }
      System.out.println();
    }
  }
}
