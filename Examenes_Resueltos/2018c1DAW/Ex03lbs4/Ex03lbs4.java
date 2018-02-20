package Ex03lbs4;

/**
 *
 * @author Lucia Blanco
 */
public class Ex03lbs4 {
  public static void main(String[] args) {
    System.out.println("La matriz generada es:");
    int fil = (int)(Math.random()*6)+1;
    int col = (int)(Math.random()*6)+1;
    int[][] matriz = generaArray(fil, col);
    for (int i = 0; i < fil; i++){
      for (int j = 0; j < col; j++){
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    int [][] nucleo = nucleo(matriz);
    for (int[] nucleo1 : nucleo) {
      for (int j = 0; j < nucleo[0].length; j++) {
        System.out.print(nucleo1[j] + " ");
      }
      System.out.println();
    }
  }
  public static int[][] generaArray(int n, int m) {
    int[][] matriz = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matriz[i][j] = (int) (Math.random()*90)+10;
      }
    }
    return matriz;
  }
  
  public static int [][] nucleo(int[][]m){
    int[][] nucleo = new int[2][2];
    for (int[] nucleo1 : nucleo) {
      for (int j = 0; j < nucleo[0].length; j++) {
        nucleo1[j] = -1;
      }
    }
    if ((m.length == m[0].length)&&(m.length >= 2)&&(m.length%2 == 0)){
      int mitad = m.length/2;
      for (int i = 0; i < nucleo.length; i++){
        for (int j = 0; j < nucleo.length; j++){
          nucleo[i][j] = m[mitad+i-1][mitad+j-1];
        }
      }
    }
    return nucleo;
  }
}
