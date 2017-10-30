/**
 * Ejercicio 8 | Tema 5
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 * @author Lucia Blanco
 */
 
 public class Ejercicio08_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("Tabla de multiplicar del "+num+"\n");
    for (int i = 1; i<= 10; i++){
      System.out.println(num+" x "+i+" = "+num*i);
    }
  }
}
