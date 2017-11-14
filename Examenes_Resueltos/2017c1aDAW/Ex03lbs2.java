/**
 * Ejercicio 2
 * 14/11/2017  |  Turno 1
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs2 { // Clase principal
  public static void main(String[] args) {
     System.out.println("Por favor, introduzca diez números enteros positivos:");
     boolean primo = false;
     int divisor = 0;
     int cont = 0;
     int dividendo = 0;
     // Recoge 10 numeros
     do{
      primo = true;
      int numUs = Integer.parseInt(System.console().readLine());
      // Comprueba si son primos
      int i = 2;
      primo = true;
      while((i < numUs)){
        if (((numUs%i) == 0)&&(numUs != 0)){
          primo = false;
        }
        i++;
      }
      // Si es primo, aumenta el dividendo y divisor
      if (primo){
        dividendo += numUs;
        divisor++;
      }
      cont++;
    } while (cont < 10);
    //  Si hay primos (divisor distinto de 0), se hace la media
    if (divisor != 0){
      double media = (double)(dividendo)/(double)(divisor);
      System.out.print("La media de los primos es: " + media);
    } else {
      System.out.print("No ha introducido ningún número primo, no puedo calcular la media");
    }
  }
}
