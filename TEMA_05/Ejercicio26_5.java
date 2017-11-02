/**
 * Ejercicio 26 | Tema 5
 * Pide primero un número y a continuación un dígito y da la posición 
 * contando de izquierda a derecha que ocupa ese dígito en el número introducido.
 * @author Lucia Blanco
 */
 
 public class Ejercicio26_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    int numUs = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un dígito de ese número: ");
    int digUs= Integer.parseInt(System.console().readLine());
    boolean esta = false;
    // Lo pone al revés
    int div = 10;
    int numBasura = numUs;
    int reves = 0;
    int numDig = 0;
    while (numBasura > 0){
      reves = ((reves*10) + (numBasura % 10));
      numBasura /=10;
      numDig++;
    }
    System.out.print("El dígito "+digUs+" está en ");
    // Calcula la posición
    int dig;
    int pos;
    for (pos = 1; pos <= numDig ; pos++){
      dig = reves%10;
      if (dig == digUs){
        esta = true;
        System.out.print(pos+"ª ");
      }
      reves /= 10;
    }
    if (esta = false){
      System.out.print("ninguna ");
    }
    System.out.print("posicion en el número "+numUs); 
  }
}
