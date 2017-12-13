/**
 * Ejercicio 10 | Tema 7
 * Ordena los numeros de un array poniendo primero los pares y luego los impares
 * @author Lucia Blanco
 */
  
 public class Ejercicio10_7 { // Clase principal
  public static void main(String[] args) {
    int[] array = new int[20];
    for (int i = 0; i < array.length; i++){
      array[i] = (int)(Math.random()*101);
    }
    for (int i = 0; i < array.length; i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
    // Saca los impares a otro array
    int[] aux = new int[20];
    int contAux = 0;
    for (int i = 0; i < array.length; i++){
      if (array[i]%2 != 0){
        aux[contAux] = array[i];
        array[i] = -1;
        contAux++;
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
