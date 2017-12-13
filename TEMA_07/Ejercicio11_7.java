/**
 * Ejercicio 11 | Tema 7
 * Pide 10 números y los imprime. Pone los primos delante.
 * @author Lucia Blanco
 */
  
 public class Ejercicio11_7 { // Clase principal
  public static void main(String[] args) {
    int[] array = new int[10];
    System.out.print("Introduce 10 números: ");
    /*for (int i = 0; i < array.length; i++){
      array[i] = Integer.parseInt(System.console().readLine());
    }*/
    int cont = 0;
    while (cont < array.length) {
      System.out.print("Introduce un número: ");
      array[cont] = Integer.parseInt(System.console().readLine());
      cont++;
    }
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%4d   │", i);
    }
    System.out.print("  Indices");
    System.out.println("\n┌───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬──────");
    cont = 0;
    System.out.print("  Valores");
    System.out.println("\n├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤");
    System.out.print("│");
    System.out.println("\nArray Inicial: ");
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%4d   │", array[i]);
    }
    System.out.println("\n└───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┘");
    System.out.print("│");
      // Saca los no primos a otro array
    int[] aux = new int[20];
    boolean esPrimo = false;
    int contAux = 0;
    for (int i = 0; i < array.length; i++){
      esPrimo = true;
      for (int j = 2; j < array[i]-1; j++){
        if (array[i]%j == 0){
          esPrimo = false;
        }
        if (!esPrimo){
          aux[contAux] = array[i];
          array[i] = -1;
          contAux++;
        }
      }
    }
    // Quita los huecos entre los pares
    for (int i = 0; i < array.length; i++){
      if (array[i] != -1){
        int trash = array[i];
        for (int j = 0; j < i ; j++){
          if (array[i-j-1] == -1){
            array[i-j-1] = trash;
            array[i-j] = -1;
          }
        }
      }
    }
    // Une los impares e imprime el array
    int j = 0;
    for (int i = 0; i < array.length; i++){
      if (array[i] == -1){
        array[i] = aux[j];
        j++;
      }
    }
    for (int i = 0; i < array.length; i++){
      System.out.print(array[i]+" ");
    }
  }
}
