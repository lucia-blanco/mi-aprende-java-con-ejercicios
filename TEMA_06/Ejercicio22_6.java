/**
 * Ejercicio 22 | Tema 6
 * Serpiente.
 * @author Lucia Blanco
 */
 
 public class Ejercicio22_6 { // Clase principal
  public static void main(String[] args) {
    final char cabeza = '@';
    final int espInicial = 12;
    int nEsp = 0;
    char caracter = '*';
    System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
    int longitud = Integer.parseInt(System.console().readLine());
    for (int i = 0; i < longitud; i++){
      if (i == 0){
        nEsp = 12;
        caracter = '@';
      } else {
        nEsp += (int)((Math.random()*3)-1);
        caracter = '*';
      }
      for(int j = 0; j < nEsp; j++){
        System.out.print(" ");
      }
      System.out.println(caracter);
    }
  }
}
