/**
 * Ejercicio 18 | Tema 4
 * Primera cifra de un número entero.
 * @author Lucia Blanco
 */
 
 public class Ejercicio18_4 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Por favor, introduce un número entero (max. 5 cifras): ");
    int num = Integer.parseInt(System.console().readLine());
    if (num > 100000){
      System.out.print("La cifra debe tener como máximo 5 cifras.");
      // Divide hasta que num < 10)
    } else {
        num = num/10;
        if (num < 10){
          System.out.print("La primera cifra es " + num);
        } else {
          num = num/10;
          if (num < 10){
            System.out.print("La primera cifra es " + num);
          } else {
            num = num/10;
            if (num < 10){
              System.out.print("La primera cifra es " + num);
            } else {
              num = num/10;
              if (num < 10){
                System.out.print("La primera cifra es " + num);
              } else {
                num = num/10;
                System.out.print("La primera cifra es " + num);
              }
            }
          }
        }
      }
    }
  }

