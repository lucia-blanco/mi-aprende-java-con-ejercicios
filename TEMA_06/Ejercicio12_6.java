/**
 * Ejercicio 12 | Tema 6
 * Realiza un programa que llene la pantalla de caracteres aleatorios con el código ascii entre el 32 y el 126.
 * @author Lucia Blanco
 */
 
 public class Ejercicio12_6 { // Clase principal
  public static void main(String[] args) {
    for (int i = 1; i > 0; i++){
      System.out.print((char)((Math.random()*127)+32));
    }
  }
}
