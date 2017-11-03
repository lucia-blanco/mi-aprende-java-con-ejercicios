/**
 * Ejercicio 34 | Tema 5
 * Lee dos números y reordena sus cifras en otros dos números (uno con las cifras pares y otro las impares).
 * @author Lucia Blanco
 */
 
 public class Ejercicio34_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce otro número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    int numpares = 0;
    int numimpares = 0;
    // Cuenta las cifras de los dos números y los pone al revés
    int numBasura = num1;
    int reves1 = 0;
    int numDig1 = 0;
    while (numBasura > 0){
      reves1 = ((reves1*10) + (numBasura % 10));
      numBasura /=10;
      numDig1++;
    }
    numBasura = num2;
    int reves2 = 0;
    int numDig2 = 0;
    while (numBasura > 0){
      reves2 = ((reves2*10) + (numBasura % 10));
      numBasura /=10;
      numDig2++;
    }
    // Los mezcla y clasifica
    int revpar1;
    int revpar2;
    for (int i = 1; i <= numDig1+numDig2; i++){
      revpar1 = (reves1%10)%2;
      revpar2 = (reves2%10)%2;
      if ((revpar1 == 0) && (i%2 != 0)){
        numpares = ((numpares*10) + (reves1 % 10));
        reves1 /=10;
      } else if ((revpar1 != 0) && (i%2 != 0)){
        numimpares = ((numimpares*10) + (reves1 % 10));
        reves1 /=10;
      } else if ((revpar2 == 0) && (i%2 == 0)){
        numpares = ((numpares*10) + (reves2 % 10));
        reves2 /=10;
      } else {
        numimpares = ((numimpares*10) + (reves2 % 10));
        reves2 /=10;
      }
    }
    System.out.println("El número formado por las cifras pares es: "+numpares);
    System.out.println("El número formado por las cifras impares es: "+numimpares);
  }
}
