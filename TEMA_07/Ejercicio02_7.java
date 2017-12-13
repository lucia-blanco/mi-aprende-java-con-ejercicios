/**
 * Ejercicio 2 | Tema 7
 * Define un array de 12 chars enteros con nombre simbolo y asigna los valores 
 * según la tabla. Muestra el contenido de todos los elementos del array.
 * @author Lucia Blanco
 */
 
 public class Ejercicio02_7 { // Clase principal
  public static void main(String[] args) {
    char[] simbolo = new char[10];
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[8] = '+';
    simbolo[9] = 'Q';
    for (int i = 0; i < 10; i++){
      System.out.print(simbolo[i]+" ");
    }
  }
}
