/**
 * Ejercicio 8 | Tema 6
 * Muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince.
 * @author Lucia Blanco
 */
 
 public class Ejercicio08_6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Muestra tres apuestas de la quiniela:");
    int fil = 15;
    int col = 3;
    for (int i = 0; i < fil; i++){
      for (int j = 0; j < col; j++){
        int numApuesta = (int)(Math.random()*6);
        String apuesta = "a";
        switch (numApuesta){
          case 0:
          case 1:
          case 2:
            apuesta = "1";
            break;
          case 3:
            apuesta = "X";
            break;
          case 4:
          case 5:
            apuesta = "2";
            break;
        }
        System.out.print(apuesta + "  ");
      }
      System.out.println();
    }
  }
}
