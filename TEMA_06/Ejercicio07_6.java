/**
 * Ejercicio 7 | Tema 6
 * Muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince.
 * @author Lucia Blanco
 */
 
 public class Ejercicio07_6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Muestra tres apuestas de la quiniela:");
    int fil = 15;
    int col = 3;
    for (int i = 0; i < fil; i++){
      for (int j = 0; j < col; j++){
        int numApuesta = (int)(Math.random()*3);
        String apuesta = "a";
        if (numApuesta == 0){
          apuesta = "X";
        } else {
          apuesta = String.valueOf(numApuesta);
        }
        System.out.print(apuesta + "  ");
      }
      System.out.println();
    }
  }
}
