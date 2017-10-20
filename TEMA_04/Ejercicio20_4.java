/**
 * Ejercicio 20 | Tema 4
 * Dice si un número (de 5 cifras máximo) es palíndromo.
 * @author Lucia Blanco
 */
 
 public class Ejercicio20_4 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Por favor, introduce un número entero (max. 5 cifras): ");
    int num = Integer.parseInt(System.console().readLine());
    if ((num > 100000) || (num < -100000)){
      System.out.print("La cifra debe tener como máximo 5 cifras.");
    } else {
      int ultNum;
      int penNum ;
      ultNum = num%10;
      penNum = ((num - ultNum)/10)%10;
      //Caso 5 cifras
      if (num > 9999){
        int primNum = num/10000;
        int segNum = (num-primNum*10000)/1000;
        if ((primNum == ultNum) && (segNum == penNum)){
          System.out.println("El número es un palíndromo.");
        } else { System.out.println("El número no es un palíndromo.");}
      //Caso 4 cifras
      } else if (num > 999){
      int primNum = num/1000;
        int segNum = (num-primNum*1000)/100;
        if ((primNum == ultNum) && (segNum == penNum)){
          System.out.println("El número es un palíndromo.");
        } else { System.out.println("El número no es un palíndromo.");}
      //Caso 3 cifras
      } else if (num > 99){
        int primNum = num/100;
        if (primNum == ultNum){
          System.out.println("El número es un palíndromo.");
        } else { System.out.println("El número no es un palíndromo.");}
      //Caso 2 cifras
      } else if (num > 9){
        int primNum = num/10;
        if (primNum == ultNum){
          System.out.println("El número es un palíndromo.");
        } else { System.out.println("El número no es un palíndromo.");}
      } else { System.out.println("El número es un palíndromo.");}
    }
  }
}
