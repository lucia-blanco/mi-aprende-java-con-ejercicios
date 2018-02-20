package Ex03lbs3;

/**
 *
 * @author Lucia Blanco
 */
public class Ex03lbs3 {
  public static void main(String[] args) {
     String[] a = {"casa", "coche", "sol", "mesa", "ordenador", "CASA"};
     String[] b = {"zambomba", "coche", "casa", "sol", "mermelada"};
     
     String[] comunes = palabrasComunes(a,b);
     for (String i : comunes) {
      System.out.print(i + " ");
    }
  }
  public static String[] palabrasComunes(String[] a, String[] b){
    String[]p;
    String[]g;
    if (a.length < b.length){
      p = a;
      g = b;
    } else {
      p = b;
      g = a;
    }
    String[] palabrasComunes = new String [p.length];
    for (int i = 0; i < palabrasComunes.length; i++){
      palabrasComunes[i] = " ";
    }
    int num = 0;
    for (int i = 0; i < g.length; i++){
      for (int j = 0; j < p.length; j++){
        if (g[i] == p[j]){
          palabrasComunes[num] = g[i];
          num++;
        }
      }
    }
    return palabrasComunes;
  }
}
