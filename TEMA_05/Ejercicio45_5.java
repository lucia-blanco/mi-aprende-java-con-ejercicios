/**
 * Ejercicio 45 | Tema 5
 * Cambia un dígito en un número por el dígito indicado.
 * @author Lucia Blanco
 */
 
 public class Ejercicio45_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce el numero: ");
    int numUs = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la posicion de dígito que quiere cambiar: ");
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
    // Calcula la primera parte
    int num1 = 0;
    for (int i = 1; i < pos; i++){
      num1 = ((num1*10) + (numReves % 10));
      numReves /=10;
    }
    // Introduce el digito nuevo
    num1 = ((num1*10) + dig);
    // Se salta la posición del viejo y añade el resto
    numReves /=10;
    while (pos < numDig){
      num1 = ((num1*10) + (numReves % 10));
      numReves /=10;
      pos++;
    }
    System.out.print("El número resultante es "+num1);
  }
}
