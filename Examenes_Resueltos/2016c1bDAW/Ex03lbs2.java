/**
 * Ejercicio 2
 * 
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs2 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Por favor, vaya introduciendo números y pulsando [INTRO]: ");
    int contador = 0;
    boolean primo = true;
    boolean negativo = false;
    int num;
    do{
      num = Integer.parseInt(System.console().readLine());
      if (num < 0){
        negativo = true;
      } else {
        negativo = false;
      }
      if (!negativo){
        int i = 2;
        primo = true;
        while((i < num)){
          if ((num%i) == 0){
            primo = false;
          }
          i++;
        }
        if (primo){
          contador++;
        }
      }
    } while (!negativo);
    System.out.println("Ha introducido "+ contador + " números primos.");
  }
}

