/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

public class SinRepetir {
  public static String[] sinRepetir(String[]a){
    String[] sinRepetidas = new String[9];
    for (int i = 0; i < sinRepetidas.length; i++){
      sinRepetidas[i] = " ";
    }
    int num = 0;
    for (String a1 : a) {
      boolean esIgual = false;
      for (String sinRepetida : sinRepetidas) {
        if (a1 == sinRepetida) { 
          esIgual = true;
        }
      }
      if (!esIgual) {
        sinRepetidas[num] = a1;
        num++;
      }
    }
    return sinRepetidas;
  }
}
