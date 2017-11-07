/**
 * Ejercicio 44 | Tema 5
 * Inserta un número dentro de un número indicando la posición.
 * @author Lucia Blanco
 */
 
 public class Ejercicio44_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce el numero: ");
    int numUs = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la posicion a en la cual quiere introducir el dígito: ");
    int pos = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el dígito: ");
    int dig = Integer.parseInt(System.console().readLine());
    // Cuenta los números y calcula el reves
    int numBasura = numUs;
    int numDig = 0;
    int numReves = 0;
    while (numBasura > 0){
      numReves = ((numReves*10) + (numBasura % 10));
      numBasura /=10;
      numDig++;
    }
    // Primera parte
    int num1 = 0;
    for (int i = 1; i < pos; i++){
      num1 = ((num1*10) + (numReves % 10));
      numReves /=10;
    }
    // Introduce el dígito
    num1 = ((num1*10) + dig);
    // Parte del final
    while (pos < numDig){
      num1 = ((num1*10) + (numReves % 10));
      numReves /=10;
      pos++;
    }
    System.out.print("El número resultante es "+num1);
  }
}
