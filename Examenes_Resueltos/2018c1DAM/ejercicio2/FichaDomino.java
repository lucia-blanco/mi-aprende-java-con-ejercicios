/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Lúcia
 */
public class FichaDomino {
  private int cara1;
  private int cara2;

  public FichaDomino(int cara1, int cara2) {
    this.cara1 = cara1;
    this.cara2 = cara2;
  }

  public int getCara1() {
    return cara1;
  }

  public void setCara1(int cara1) {
    this.cara1 = cara1;
  }

  public int getCara2() {
    return cara2;
  }

  public void setCara2(int cara2) {
    this.cara2 = cara2;
  }

  @Override
  public String toString() {
    String caracteres = "";
    caracteres += "[";
    if (this.cara1 > 0) {
      caracteres += this.cara1;
    } else {
      caracteres += " ";
    }
    caracteres += "|";
    if (this.cara2 > 0) {
      caracteres += this.cara2;
    } else {
      caracteres += " ";
    }
    caracteres += "]";
    return caracteres;
  }
  
  public FichaDomino voltea(FichaDomino v){
    int aux = v.cara1;
    v.cara1 = v.cara2;
    v.cara2 = aux;
    return v;
  }
  
  public boolean encaja(FichaDomino nuevo){
    boolean encaja = false;
    if ((cara2==nuevo.cara1)||(cara2==nuevo.cara2)){
      encaja = true;
    }
    return encaja;
  } 
}
