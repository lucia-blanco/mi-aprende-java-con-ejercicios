/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import static ejercicio4.corteza.corteza;

/**
 *
 * @author Lúcia
 */

public class main4 {
  public static void main(String[] args) {
    final int filas = 4;
    final int columnas = 6;
    int[][] tronco = new int[filas][columnas];
    //Lo llena
    for (int[] tronco1 : tronco) {
      for (int j = 0; j < tronco[0].length; j++) {
        tronco1[j] = (int)(Math.random()*100);
      }
    }
    //Lo imprime
    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++){
        System.out.print (tronco[i][j] + " ");
      }
      System.out.println();
    }
    int[] corteza = corteza(tronco);
    for (int i = 0; i < corteza.length; i++){
      System.out.print (corteza[i] + "  ");
    }
  } 
}
