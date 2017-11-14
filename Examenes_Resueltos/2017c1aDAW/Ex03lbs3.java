/**
 * Ejercicio 3
 * 14/11/2017  |  Turno 1
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs3 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca la longitud del lado (5 como mínimo): ");
    int lado = Integer.parseInt(System.console().readLine());
    for (int h = 1; h <= lado; h++){
      for (int w = 1; w <= lado; w++){
        // Imprime asterisco cuando la fila o la colunna son la primera, segunda, penultima y ultima
        if ((h == 1) || (h == 2) || (h == lado) || (h == lado-1) || (w == 1) || (w == 2) || (w == lado) || (w == lado-1)){
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
