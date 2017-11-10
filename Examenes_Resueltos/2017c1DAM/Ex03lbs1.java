/**
 * Ejercicio 1
 * 
 * @author Lucia Blanco Salgado
 */
 
 public class Ex03lbs1 { // Clase principal
  public static void main(String[] args) {
    int contador = 0;
    boolean primo = false;
    int num;
    int maxim = 0;
    int minim = 0;
    int dividendo = 0;
    System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
    do{
      num = Integer.parseInt(System.console().readLine());
      int i = 2;
      primo = true;
      while((i < num)){
        if ((num%i) == 0){
          primo = false;
        }
        i++;
      }
      if (!primo){
        if ((num < minim) || (contador == 0)){
          minim = num;
        }
        if (num > maxim){
          maxim = num;
        }
        dividendo += num;
        contador++;
      }
    } while (!primo);
    double media = (double)(dividendo)/(double)(contador);
    System.out.println("Ha introducido "+ contador + " números no primos.");
    System.out.println("Máximo: "+ maxim +".");
    System.out.println("Mínimo: "+ minim +".");
    System.out.println("Media: "+ media +".");
  }
}
