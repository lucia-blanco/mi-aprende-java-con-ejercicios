/**
 * Ejercicio 1
 * 14/12/2017  |  Turno 1
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs1 { // Clase principal
  public static void main(String[] args) {
    //Crea el array aleatorio entre 1 y 100 y lo imprime
    int[] array = new int[20];
    for (int i = 0; i < array.length; i++){
      array[i] = (int)((Math.random()*100)+1);
    }
    for (int i = 0; i < array.length; i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
    //Saca el máximo y el mínimo y los guarda
    int[] maximo = new int[2];
    int[] minimo = new int[2];
    minimo[0] = 100;
    for (int i = 0; i < array.length; i++){
      if (array[i] < minimo[0]){
        minimo[0] = array[i];
        minimo[1] = i;
      }
      if (array[i] > maximo[0]){
        maximo[0] = array[i];
        maximo[1] = i;
      }
    }
    // Cambia el máximo y mínimo por -1
    array[minimo[1]] = -1;
    array[maximo[1]] = -1;
    //Compacta el array
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
    // Deja un "hueco" en la primera posición
    for (int i = (array.length - 3); i >= 0; i--){
      array[i+1] = array[i];
    }
    // Incluye el máximo y minimo e imprime el array
    array[0] = minimo[0];
    array[19] = maximo[0];
    for (int i = 0; i < array.length; i++){
      System.out.print(array[i]+" ");
    }
  }
}
  
