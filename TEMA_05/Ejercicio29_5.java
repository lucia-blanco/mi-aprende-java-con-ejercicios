/**
 * Ejercicio 29 | Tema 5
 * Lee un número y muestra todos los positivos menores que no sean divisibles entre otro leído.
 * @author Lucia Blanco
 */
 
 public class Ejercicio29_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce otro número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    boolean ninguno = true;
    System.out.print("Los números positivos menores que "+num1+" que además son divisibles entre "+num2+" son: ");
    for (int i = 1; i <= num1; i++){
      if (i%num2 == 0){
        ninguno = false;
        System.out.print(i+" ");
      }
    }
    if (ninguno){
      System.out.print("ninguno.");
    }
  }
}
