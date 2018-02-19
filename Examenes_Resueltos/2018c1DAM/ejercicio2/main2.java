/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.FichaDomino;

/**
 *
 * @author Lúcia
 */
public class main2 {
  public static void main(String[] args) {
    int num = 1;
    FichaDomino [] f = new FichaDomino[8];
    f[0] = new FichaDomino((int)(Math.random()*7), (int)(Math.random()*7));
    System.out.print(f[0]);
    while (num < 8){
      f[num] = new FichaDomino((int)(Math.random()*7), (int)(Math.random()*7));
      if (f[num-1].encaja(f[num])){
        if (f[num].getCara1() == f[num-1].getCara2()){
          System.out.print(f[num]);
          System.out.print(" ");
        } else {
          f[num].voltea(f[num]);
          System.out.print(f[num]);
        }
        num++;
      }
    }
  }
}

