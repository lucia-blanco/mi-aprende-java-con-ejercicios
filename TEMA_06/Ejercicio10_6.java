/**
 * Ejercicio 10 | Tema 6
 * Pinta por pantalla diez líneas formadas por caracteres de longitud aleatoria ente 1 y 40.
 * @author Lucia Blanco
 */
 
 public class Ejercicio10_6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Pinta por pantalla diez líneas formadas por caracteres de longitud aleatoria ente 1 y 40:");
    final int lineas = 10;
    for (int i = 0; i < lineas; i++){
      int longitud = (int)(Math.random()*40)+1;
      for (int j = 0; j < longitud; j++){
        int c = (int)(Math.random()*6);
        String car = "a";
        switch (c){
          case 0:
            System.out.print("*");
            break;
          case 1:
            System.out.print("-");
            break;
          case 2:
            System.out.print("=");
            break;
          case 3:
            System.out.print(".");
            break;
          case 4:
            System.out.print("|");
            break;
          case 5:
            System.out.print("@");
            break;
        }
      }
      System.out.println();
    }
  }
}
