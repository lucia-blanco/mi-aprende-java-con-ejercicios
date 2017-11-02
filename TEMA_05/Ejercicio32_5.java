/**
 * Ejercicio 32 | Tema 5
 * Dado un número, dice cuáles son y cuánto suman los dígitos pares. 
 * Los dígitos pares se deben mostrar en orden, de izquierda a derecha.
 * @author Lucia Blanco
 */
 
 public class Ejercicio32_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    long numUs = Long.parseLong(System.console().readLine());
    System.out.print("Los dígitos pares son: ");
    // Lo pone al revés
    int div = 10;
    long numBasura = numUs;
    long reves = 0;
    int numDig = 0;
    while (numBasura > 0){
      reves = ((reves*10) + (numBasura % 10));
      numBasura /=10;
      numDig++;
    }
    // Calcula los pares y la suma y los muestra
    long dig;
    long suma = 0;
    for (int i = 0; i < numDig ; i++){
      dig = reves%10;
      if (dig%2 == 0){
        System.out.print(dig+" ");
        suma += dig;
      }
      reves /= 10;
    }
    System.out.print("La suma de los dígitos pares, es: "+suma);
  }
}
