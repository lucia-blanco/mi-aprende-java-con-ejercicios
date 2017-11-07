/**
 * Ejercicio 42 | Tema 5
 * Muestra los 5 números siguientes al introducido y dice si son o no primos.
 * @author Lucia Blanco
 */
 
 public class Ejercicio42_5 { // Clase principal
  public static void main(String[] args) {
    boolean primo = true;
    System.out.print("Introduce el numero ");
    int num = Integer.parseInt(System.console().readLine());
    int cont = 0;
    while (cont < 5) {
      System.out.print(num);
      primo = true;
      for (int i = 2; i < num; i++){
        if (num%i == 0){
          primo = false;
        }
      }
      if (primo){
        System.out.println(" es primo.");
      } else {
        System.out.println(" no es primo.");
      }
      num++;  
      cont ++;
    } 
  }
}
