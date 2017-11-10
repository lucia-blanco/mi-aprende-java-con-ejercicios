/**
 * Ejercicio 3
 * 
 * @author Lucia Blanco Salgado
 */
 
 public class Ex03lbs3 { // Clase principal
  public static void main(String[] args) {
    final String uno = "*";
    final String cuatro = "****";
    final String hueco = "   ";
    System.out.print("Introduzca la altura (5 como mínimo): ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
    int espacio = Integer.parseInt(System.console().readLine());
    // Imprime las 3 primeras filas
    for(int fila = 0; fila < 3; fila++){
      // Uno
      if ((fila == 0) || (fila == 2)){
        System.out.print(uno);
        // Cinco
        for (int i = 0; i < 2; i++){
          for(int col = 0; col < espacio; col++){
            System.out.print(" ");
          }
          System.out.print(cuatro);
        }
      } else {
        System.out.print(uno);
        for(int col = 0; col < espacio; col++){
          System.out.print(" ");
        }
        for (int i = 0; i < 2; i++){
          System.out.print(uno);
          for(int col = 0; col < espacio; col++){
            System.out.print(" ");
          }
          System.out.print(hueco);
        }
      }
      System.out.println();
    }
    // Imprime tantas filas en medio como h - primeras filas - última fila
    int medio = h - 4;
    for(int i = 0; i < medio; i++){
      // Uno
      System.out.print(uno);
      for(int col = 0; col < espacio; col++){
        System.out.print(" ");
      }
      // Cinco
      for (int j = 0; j < 2; j++){
        System.out.print(hueco);
        System.out.print(uno);
        for(int col = 0; col < espacio; col++){
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    // Última fila
    // Uno
    System.out.print(uno);
    // Cinco
    for (int i = 0; i < 2; i++){
      for(int col = 0; col < espacio; col++){
        System.out.print(" ");
      }
      System.out.print(cuatro);
    }
  }
}
