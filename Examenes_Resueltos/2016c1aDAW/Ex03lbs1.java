/**
 * Ejercicio 1
 * 
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs1 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Por favor, vaya introduciendo números y pulsando [INTRO]: ");
    boolean negativo = false;
    int contador = 0;
    boolean palindromo = false;
    do{
      negativo = false;
      int num = Integer.parseInt(System.console().readLine());
      //Comprueba si es negativo
      if (num < 0){
        negativo = true;
      }
      //Si no es negativo, continúa
      if (!negativo){
        // Cuenta los números y calcula el reves
        long aux = num;
        long numDig = 0;
        long numReves = 0;
        while (aux > 0){
          numReves = ((numReves*10) + (aux % 10));
          aux /=10;
          numDig++;
        }
        // Los compara
        long numDerecho = num;
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
        if (palindromo){
          contador++;
        }
      }
    } while (!negativo);
    System.out.print("Ha introducido "+contador+" números capicúa.");
  }
}
