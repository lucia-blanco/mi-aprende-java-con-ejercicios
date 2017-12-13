/**
 * Ejercicio 6 | Tema 7
 * Rota el array hacia la derecha
 * @author Lucia Blanco
 */
  
 public class Ejercicio06_7 { // Clase principal
  public static void main(String[] args) {
    int[] numero = new int[10];
    System.out.print("Introduce 15 números: ");
    for (int i = 0; i < numero.length; i++){
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    //Lo rota hacia la derecha
    int aux = numero[numero.length-1];
    for (int i = (numero.length - 1); i > 0; --i){
      numero[i] = numero[i-1];
    }
    numero[0] = aux;
    //Imprime
    System.out.println();
    for (int i = 0; i < numero.length; i++){
      System.out.print(numero[i]+" ");
    }
  }
}
