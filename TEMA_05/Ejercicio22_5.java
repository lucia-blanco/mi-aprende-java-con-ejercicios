/**
 * Ejercicio 22 | Tema 5
 * Muestra los números primos entre el 2 y el 100.
 * @author Lucia Blanco
 */
 
 public class Ejercicio22_5 { // Clase principal
  public static void main(String[] args) {
    boolean primo = false;
    System.out.print("Los números primos entre 2 y 100 son:");
    for (int num = 2; num <= 100; num++) {
      primo = true;
      for (int i = 2; i < num; i++){
        if (num%i == 0){
          primo = false;
        }
      }
      if (primo){
        System.out.print("- "+num+" ");
      }  
    } 
  }
}
