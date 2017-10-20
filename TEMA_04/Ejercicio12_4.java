/**
 * Ejercicio 12 | Tema 4
 * Cuestionario con 10 preguntas sobre las asignaturas.
 * @author Lucia Blanco
 */
 
 public class Ejercicio12_4 { // Clase principal
  public static void main(String[] args) {
    int puntos = 0;
    String r = "\033[31m";
    String v = "\033[32m";
    String c = "\033[36m";
    String b = "\033[37m";
    /* Empieza */
    System.out.println(c+"\n CUESTIONARIO DE 10 PREGUNTAS:\n");
    //Primera
    System.out.println(" 1) ¿Qué etiqueta de HTML usarías para destacar un texto?");
    System.out.println(b+"a) <p>");
    System.out.println("b) <div>");
    System.out.println("c) <strong>");
    String respuesta = System.console().readLine(); 
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println(v+"¡Respuesta correcta!");
    } else {
      System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Segunda
    System.out.println(c+"\n 2) ¿Cuál NO es un tipo de Lenguaje de Programación?");
    System.out.println(b+"a) Alto Nivel");
    System.out.println("b) Medio Nivel");
    System.out.println("c) Bajo Nivel");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println(v+"¡Respuesta correcta!");
    } else {
      System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Tercera
    System.out.println(c+"\n 3) ¿En qué sistema de numeración pondrías un color en CSS?");
    System.out.println(b+"a) Hexadecimal");
    System.out.println("b) Binario");
    System.out.println("c) Duodeno");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println(v+"¡Respuesta correcta!");
    } else {
      System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Cuarta
    System.out.println(c+"\n 4) ¿Qué color sería (240,240,240)?");
    System.out.println(b+"a) Gris claro");
    System.out.println("b) Gris oscuro");
    System.out.println("c) Negro");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")){
      puntos++;
      System.out.println(v+"¡Respuesta correcta!");
    } else {
      System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Quinta
    System.out.println(c+"\n 5) ¿Qué Metodología usa la Administración Púlica Española?");
    System.out.println(b+"a) Scrum");
    System.out.println("b) Métrica v3");
    System.out.println("c) Scrunch");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")){
      puntos++;
      System.out.println(v+"¡Respuesta correcta!");
    } else {
      System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Sexta
    System.out.println(c+"\n 6) ¿Cuál de estas es una organización de ficheros en Base de Datos?");
    System.out.println(b+"a) Aleatoria Secuencial");
    System.out.println("b) Aleatoria Indexada");
    System.out.println("c) Secuencial Indexada");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")){
      puntos++;
      System.out.println(v+"¡Respuesta correcta!");
    } else {
      System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Séptima
    System.out.println(c+"\n 7) ¿A qué distacia del borde de la mesa debe estar el teclado para una correcta posición?");
    System.out.println(b+"a) 5 cm");
    System.out.println("b) 10 cm");
    System.out.println("c) 15 cm");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")){
      puntos++;
      System.out.println(v+"¡Respuesta correcta!");
    } else {
      System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Octava
    System.out.println(c+"\n 8) ¿Te está gustando el cuestionario?");
    System.out.println(b+"a) Sí");
    System.out.println("b) No");
    puntos++;
    respuesta = System.console().readLine();
    if (respuesta.equals("a")){
      System.out.println("¡Muchas gracias, hombre!");
    } else {
      System.out.println("¡A mi cuestionario tampoco le estás gustando tú.");
    }
    //Novena
    System.out.println(c+"\n 9) ¿Es el comando de git instawew inventado?");
    System.out.println(b+"a) Sí");
    System.out.println("b) No");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")){
      puntos++;
      System.out.println(v+"¡Respuesta correcta!");
    } else {
      System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Décima
    System.out.println(c+"\n 10) ¿A cuántos espaciados debería equivaler una tabulación seegún el estándar de Google?");
    System.out.println(b+"a) 1");
    System.out.println("b) 2");
    System.out.println("c) 3");
    
    respuesta = System.console().readLine();
    
    if (respuesta.equals("b")){
      puntos++;
      System.out.println(v+"¡Respuesta correcta!");
    } else {
      System.out.println(r+"¡Oh, no!, la respuesta es incorrecta.");
    }
    //Puntuación
    System.out.println(b+"\n La puntuación que ha sacado en este test es de: " + puntos);
    if (puntos < 5){
      System.out.println("¡Uf!, deberías estudiar un poco más.");
    } else if (puntos < 7){
      System.out.println("Está bastante bien, pero seguro que puedes hacerlo mejor");
    } else if (puntos <= 10){
      System.out.println("¡Genial, sigue así!");
    }
  }
}
