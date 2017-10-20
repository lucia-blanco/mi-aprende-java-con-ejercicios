/**
 * Ejercicio 16 | Tema 4
 * Test de Infidelidad
 * @author Lucia Blanco
 */
 
 public class Ejercicio16_4 { // Clase principal
  public static void main(String[] args) {
    int puntos = 30;
    String r = "\033[31m";
    String v = "\033[32m";
    String c = "\033[36m";
    String b = "\033[37m";
    /* Empieza */
    System.out.println(r+"\n ♥ TEST DE INFIDELIDAD ♥\n");
    // Test
    System.out.println(b+ "1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    System.out.println("a) Sí");
    System.out.println("b) No");
    String res = System.console().readLine();
    if (res.equals("b")){
      puntos = puntos-3;
    }
    System.out.println("2. Ha aumentado sus gastos de vestuario");
    System.out.println("a) Sí");
    System.out.println("b) No");
    res = System.console().readLine();
    if (res.equals("b")){
      puntos = puntos-3;
    }
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    System.out.println("a) Sí");
    System.out.println("b) No");
    res = System.console().readLine();
    if (res.equals("b")){
      puntos = puntos-3;
    }
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    System.out.println("a) Sí");
    System.out.println("b) No");
    res = System.console().readLine();
    if (res.equals("b")){
      puntos = puntos-3;
    }
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    System.out.println("a) Sí");
    System.out.println("b) No");
    res = System.console().readLine();
    if (res.equals("b")){
      puntos = puntos-3;
    }
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    System.out.println("a) Sí");
    System.out.println("b) No");
    res = System.console().readLine();
    if (res.equals("b")){
      puntos = puntos-3;
    }
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    System.out.println("a) Sí");
    System.out.println("b) No");
    res = System.console().readLine();
    if (res.equals("b")){
      puntos = puntos-3;
    }
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    System.out.println("a) Sí");
    System.out.println("b) No");
    res = System.console().readLine();
    if (res.equals("b")){
      puntos = puntos-3;
    }
    System.out.println("9. Has notado que últimamente se perfuma más");
    System.out.println("a) Sí");
    System.out.println("b) No");
    res = System.console().readLine();
    if (res.equals("b")){
      puntos = puntos-3;
    }
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.println("a) Sí");
    System.out.println("b) No");
    res = System.console().readLine();
    if (res.equals("b")){
      puntos = puntos-3;
    }
    if (puntos <= 10){
      System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
       System.out.println(r+"No obstante, a ti deberia darte vergüenza poner en duda la fidelidad de tu pareja y, además, buscar la respuesta en un test.");
    } else if (puntos <= 22){
      System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia,");
      System.out.println(r+" tu pareja podría dejarte por alguien que no controle cada paso que da y confíe en ella.");
    } else if (puntos <= 30){
      System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
      System.out.println(r+"También te aconsejamos que dejes de ser tan patético y, si quieres saber algo, le preguntes directamente a tu pareja en vez de hacer test estúpidos que no sirven para nada.");
    } System.out.print(b+ "");
  }
}
