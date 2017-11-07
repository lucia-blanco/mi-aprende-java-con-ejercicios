/**
 * Ejercicio 37 | Tema 5
 * Sistema palotes
 * @author Lucia Blanco
 */
 
 public class Ejercicio37_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    int numUs = Integer.parseInt(System.console().readLine());
    // Cuenta los números y calcula el reves
    int numBasura = numUs;
    int numDig = 0;
    int numReves = 0;
    while (numBasura > 0){
      numReves = ((numReves*10) + (numBasura % 10));
      numBasura /=10;
      numDig++;
    }
    int cifra = 0;
    // Separa las cifras y escribe los palitos
    for (int i = 0; i < numDig; i++){
      cifra = numReves%10;
      numReves /= 10;
      for (int j = 0; j < cifra; j++){
        System.out.print("|");
      }
      if (i < numDig-1){
        System.out.print("-");
      }
    }
  }
}
