/**
 * Ejercicio 42 | Tema 5
 * Parte un número por la posicion indicada.
 * @author Lucia Blanco
 */
 
 public class Ejercicio43_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce el numero: ");
    int numUs = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la posicion a partir de la cual quiere partir el número: ");
    int pos = Integer.parseInt(System.console().readLine());
    // Cuenta los números y calcula el reves
    int numBasura = numUs;
    int numDig = 0;
    int numReves = 0;
    while (numBasura > 0){
      numReves = ((numReves*10) + (numBasura % 10));
      numBasura /=10;
      numDig++;
    }
    // Calcula primer número
    int num1 = 0;
    for (int i = 1; i < pos; i++){
      num1 = ((num1*10) + (numReves % 10));
      numReves /=10;
    }
    int num2 = 0;
    for (int i = pos; pos <= numDig; pos++){
      num2 = ((num2*10) + (numReves % 10));
      numReves /=10;
    }
    System.out.print("Los números partidos son el "+num1+" y el "+num2);
  }
}
