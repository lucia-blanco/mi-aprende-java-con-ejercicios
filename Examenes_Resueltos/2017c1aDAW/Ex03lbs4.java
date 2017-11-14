/**
 * Ejercicio 4
 * 14/11/2017  |  Turno 1
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs4 { // Clase principal
  public static void main(String[] args) {
    boolean par = false;
    boolean donut = false;
    System.out.print("Introduzca un número entero positivo: ");
    int numUs = Integer.parseInt(System.console().readLine());
    // Cuenta los digitos y le da la vuelta
    int numAux = numUs;
    int numDig = 0;
    int numReves = 0;
    while (numAux > 0){
		numAux /=10;
		numDig++;
    }
    numAux = numUs;
    // Si el numero de digitos es par, comprueba las dos posiciones del centro
    if (numDig%2 == 0){
      for (int i = 0; i < (numDig/2)-1; i++){
        numAux /= 10;
      }
      int cifra = numAux%10;
      if (cifra == 0){
        donut = true;
      }
      numAux/=10;
      cifra = numAux%10;
      if (cifra != 0){
        donut = false;
      }
    } else {
      // Si es impar, comprueba solo la del centro
      for (int i = 0; i < (numDig/2); i++){
        numAux /= 10;
      }
      int cifra = numAux%10;
      if (cifra == 0){
        donut = true;
      }
    }
    System.out.print("El " + numUs);
    if (donut){
      System.out.print(" es un número donut");
    } else {
      System.out.print(" no es un número donut");
    }
  }
}
