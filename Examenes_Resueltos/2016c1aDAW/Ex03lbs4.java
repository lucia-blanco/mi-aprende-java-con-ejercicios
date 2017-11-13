/**
 * Ejercicio 4
 * 
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs4 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un número: ");
    long numUs = Long.parseLong(System.console().readLine());
    long numAux = numUs;
    long numReves = 0;
    int numDig = 0;
    while (numAux > 0){
      numReves = ((numReves*10) + (numAux % 10));
      numAux /=10;
      numDig++;
    }
    long complementario = 0;
    for (int i = 0; i < numDig; i++){
      complementario = (complementario*10) + (9 - numReves%10);
      numReves /= 10;
    }
    System.out.print("El complementario es el " + complementario + ".");
  }
}
