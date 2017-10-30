/**
 * Ejercicio 17 | Tema 5
 * Suma los 100 números siguientes a un número entero y positivo introducido por teclado.
 * @author Lucia Blanco
 */
 
 public class Ejercicio17_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());
    if (num < 0){
      System.out.print("P O S I T I V O   H E   D I C H O");
    } else {
      System.out.print("Los siguientes 100 números a "+num+" son: ");
      for(int i = 0; i < 100; i++){
        System.out.print(num+" ");
        num++;
      }
    }
  }
}
