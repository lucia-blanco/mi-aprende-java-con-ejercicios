/**
 * Ejercicio 4
 * 
 * @author Lucia Blanco Salgado
 */
 
 public class Ex03lbs4 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero (mayor que cero): ");
    long numUs = Long.parseLong(System.console().readLine());
    // Cuenta los números y calcula el reves
    long aux = numUs;
    int numDig = 0;
    long numReves = 0;
    while (aux > 0){
      numReves = ((numReves*10) + (aux % 10));
      aux /=10;
      numDig++;
    }
    // Revisa los números y lelimina el 8 y el 0
    long gusano = 0;
    for (int i = 1; i <= numDig; i++){
      if ((numReves%10 != 0) && (numReves%10 != 8)){
        gusano = ((gusano*10) + (numReves%10));
      } 
      numReves /=10;
    }
    System.out.print("Después de haber sido comido por el gusano numérico se queda en "+gusano);
  }
}
