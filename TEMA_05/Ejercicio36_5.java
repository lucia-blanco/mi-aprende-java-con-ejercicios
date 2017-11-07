/**
 * Ejercicio 36 | Tema 5
 * Capicúa.
 * @author Lucia Blanco
 */
 
 public class Ejercicio36_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    long numUs = Long.parseLong(System.console().readLine());
    boolean palindromo = false;
    // Cuenta los números y calcula el reves
    long numBasura = numUs;
    long numDig = 0;
    long numReves = 0;
    while (numBasura > 0){
      numReves = ((numReves*10) + (numBasura % 10));
      numBasura /=10;
      numDig++;
    }
    // Los compara
    long numDerecho = numUs;
    long cifraDerecho = 0;
    long cifraReves = 0;
    numDig /= 2;
    do{
      cifraDerecho = numDerecho%10;
      cifraReves = numReves%10;
      if (cifraDerecho == cifraReves){
        palindromo = true;
      } else {
        palindromo = false;
      }
      numDerecho /= 10;
      numReves /= 10;
      numDig--;
    } while ((numDig > 0) && (palindromo == true));
    System.out.print("El número "+numUs);
    if (palindromo == true){
      System.out.print(" es un palíndromo.");
    } else {
      System.out.print(" no es un palíndromo.");
    }
  }
}
