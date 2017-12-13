/**
 * Ejercicio 8 | Tema 7
 * Diagrama de barras con temperatura media.
 * @author Lucia Blanco
 */
  
 public class Ejercicio08_7 { // Clase principal
  public static void main(String[] args) {
    int[] temperatura = new int[12];
    for (int i = 0; i < temperatura.length; i++){
      System.out.print("Introduce la temperatura media del mes "+(i+1)+": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 0; i < temperatura.length; i++){
      System.out.print("Mes "+(i+1)+": ");
      for (int j = 0; j < temperatura[i]; j++){
        System.out.print("|");
      }
      System.out.println();
    }
  }
}
