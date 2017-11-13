/**
 * Ejercicio 3
 * 
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs3 { // Clase principal
  public static void main(String[] args) {
    // Pide datos
    System.out.print("Por favor, introduzca un número: ");
    long numUs = Long.parseLong(System.console().readLine());
    // Le da la vuelta
    long numReves = 0;
    long numAux = numUs;
    int numDig = 0;
    while (numAux > 0){
    	numReves = ((numReves*10) + (numAux % 10));
    	numAux /=10;
      numDig ++;
    }
    // Lo va separando, clasificando, dislocando y uniendo
    long disloque = 0;
    int cifra;
    for (int i = 0; i < numDig; i++){
      cifra = (int)(numReves%10);
      if (cifra%2 == 0){
        cifra++;
      } else {
        cifra--;
      }
      disloque = (disloque*10) + (long)(cifra);
      numReves /= 10;
    }
    System.out.print("Dislocando el " + numUs + " sale el " + disloque);
  }
}
