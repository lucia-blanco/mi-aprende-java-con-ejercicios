/**
 * Ejercicio 18 | Tema 5
 * A partir de dos números introducidos por teclado, incrementa de 7 en 7 empezando por el menor hasta llegar al mayor.
 * @author Lucia Blanco
 */
 
 public class Ejercicio18_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce otro número diferente: ");
    int num2 = Integer.parseInt(System.console().readLine());
    if (num1 == num2){
      System.out.print("¡ D I F E R E N T E S !");
    } else {
      int menor = 0;
      int mayor = 0;
      int i = 0;
      if (num1 < num2){
        menor = num1;
        mayor = num2;
      } else {
        menor = num2;
        mayor = num1;
      }
      for(i = 0; menor < mayor; i++){
        menor+= 7;
      }
      System.out.print("El número 7 cabe "+(i-1)+" veces entre el "+num1+" y el "+num2);
    }
  }
}
