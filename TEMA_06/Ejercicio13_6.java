/**
 * Ejercicio 13 | Tema 6
 * Simula la tirada de dos dados. Continuará tirando los dados hasta que en alguna tirada los dos dados tengan el mismo valor.
 * @author Lucia Blanco
 */
 
 public class Ejercicio13_6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Simula la tirada de dos dados hasta que salgan iguales:");
    boolean iguales = false;
    while (!iguales){
      int dado1 = (int)(Math.random()*6)+1;
      int dado2 = (int)(Math.random()*6)+1;
      System.out.println(dado1 + "  " + dado2);
      if (dado1 == dado2){
        iguales = true;
      }
    }
  }
}
