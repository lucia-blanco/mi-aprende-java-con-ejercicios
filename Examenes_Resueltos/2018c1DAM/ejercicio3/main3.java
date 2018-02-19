/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import static ejercicio3.SinRepetir.sinRepetir;

/**
 *
 * @author Lúcia
 */
public class main3 {
  public static void main(String[] args) {
    String[] a = {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"};
    String[] resultado = sinRepetir(a);
    
    for (String i : resultado) {
      System.out.print(i + " ");
    }
  }
}
