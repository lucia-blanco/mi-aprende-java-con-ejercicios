/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Lúcia
 */
public class corteza {
  public static int [] corteza(int[][]a){
    int[]corteza = new int[16];
    int num = 0;
    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < a[0].length; j++){
        if ((i == 0)||(j == 0)||(i == a.length-1)||(j == a[0].length-1)){
          corteza[num] = a[i][j];
          num++;
        }
      }
    }
    return corteza;
  }
}
