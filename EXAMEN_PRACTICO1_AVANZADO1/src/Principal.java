/*
 * EXAMEN_PRACTICO1_AVANZADO1 - Este programa tiene cinco palabras almacenadas
 *  guardamos letra por letra en un arreglo, luego en otro que tiene el mismo tamaño
 *  guardamos guiones y los mostramos, le preguntamos al usuario si quiere adivinar la
 *  palabra o no, si si quiere se la preguntamos y si es igual gana, si no pierde
 *  , si no la quiere adivinar le pedimos una letra, esa letra la comparamos con el
 *  arreglo que guarda las letras, si existe cambiamos el arreglo de guiones, 
 *  en la misma posicion sustituimos el guion por la letra, luego volvemos a 
 *  preguntar si quiere adivinar o no, si el usuario adivina todas las letras gana
 */

/**  
 *
 * 
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int numAleatorio = (int) (Math.random()*4);
        String adivina;
        char let;
        int numOportunidades, letAcertadas = 1, noAcertoLetra = -1, conti=0;
        boolean ganaPierde = false;
        int adivinaoNo = 0;
        char[][] letras;
        char[][] extra;
        if (numAleatorio == 0) {
            letras = new char[5][5];
            extra = new char[5][5];
            numOportunidades = letras[numAleatorio].length;
            extra[numAleatorio][0] = '-';
            extra[numAleatorio][1] = '-';
            extra[numAleatorio][2] = '-';
            extra[numAleatorio][3] = '-';
            extra[numAleatorio][4] = '-';

            letras[numAleatorio][0] = 'd';
            letras[numAleatorio][1] = 'a';
            letras[numAleatorio][2] = 'v';
            letras[numAleatorio][3] = 'i';
            letras[numAleatorio][4] = 'd';
            for (int i = 0; i < extra.length; i++) {
                System.out.print("[" + extra[numAleatorio][i] + "]");
            }
            System.out.println("");
            for (int i = 0; i < letras.length; i++) {
                while (ganaPierde != true) {
                    System.out.println("Sabes la palabra? (0 = si o 1 = no) ");
                    adivinaoNo = d.nextInt();
                    d.nextLine();
                    if (adivinaoNo == 0) {
                        System.out.println("Cual es?");
                        adivina = d.nextLine();
                        if ("david".equals(adivina)) {
                            System.out.println("Felicidades Ganaste!");
                            for (int j = 0; j < extra[numAleatorio].length; j++) {
                                System.out.print("[" + letras[numAleatorio][j] + "]");
                            }
                            ganaPierde = true;
                        } else {
                            System.out.println("Perdiste :c");
                            ganaPierde = true;
                        }
                    } else {
                        System.out.println("Introduce la letra");
                        let = d.nextLine().charAt(0);

                        for (int j = 0; j < letras.length; j++) {
                            if (letAcertadas == ((letras[numAleatorio].length)*(letras[numAleatorio].length))-1) {
                                ganaPierde = true;
                                System.out.println("Felicidades, ganaste");
                            }
                            for (int k = 0; k < letras[i].length; k++) {
                                if (let == letras[numAleatorio][k]) {
                                    extra[numAleatorio][k] = let;
                                    letAcertadas++;
                                    conti--;
                                }
                            }
                            if (conti == 0) {
                                noAcertoLetra++;
                            }
                        }
                        conti = 0;

                        for (int k = 0; k < extra.length; k++) {
                            System.out.print("[" + extra[numAleatorio][k] + "]");
                        }
                        System.out.println("");
                    }
                    if (noAcertoLetra > 0) {
                        numOportunidades--;
                        if(numOportunidades > 0)
                        System.out.println("Tienes " + numOportunidades + " oportunidades");
                    }
                    if (numOportunidades == 0) {
                        ganaPierde = true;
                        System.out.println("Ya no tienes intentos");
                    }
                    noAcertoLetra = 0;
                }
            }
        }
        if (numAleatorio == 1) {
            letras = new char[3][3];
            extra = new char[3][3];
            numOportunidades = letras[numAleatorio].length;
            extra[numAleatorio][0] = '-';
            extra[numAleatorio][1] = '-';
            extra[numAleatorio][2] = '-';

            letras[numAleatorio][0] = 'v';
            letras[numAleatorio][1] = 'e';
            letras[numAleatorio][2] = 'r';
            for (int i = 0; i < extra.length; i++) {
                System.out.print("[" + extra[numAleatorio][i] + "]");
            }
            System.out.println("");
            System.out.println("Tienes " + numOportunidades + " oportunidades");
            for (int i = 0; i < letras.length; i++) {
                while (ganaPierde != true) {
                    System.out.println("Sabes la palabra? (0=si o 1=no) ");
                    adivinaoNo = d.nextInt();
                    d.nextLine();
                    if (adivinaoNo == 0) {
                        System.out.println("Cual es?");
                        adivina = d.nextLine();
                        if ("ver".equals(adivina)) {
                            System.out.println("Felicidades Ganaste!");
                            for (int j = 0; j < extra[numAleatorio].length; j++) {
                                System.out.print("[" + letras[numAleatorio][j] + "]");
                            }
                            ganaPierde = true;
                        } else {
                            System.out.println("Perdiste :c");
                            ganaPierde = true;
                        }
                    } else {
                        System.out.println("Introduce la letra");
                        let = d.nextLine().charAt(0);

                        for (int j = 0; j < letras.length; j++) {
                            if (letAcertadas == (letras[numAleatorio].length)*(letras[numAleatorio].length)) {
                                ganaPierde = true;
                                System.out.println("Felicidades, ganaste");
                            }
                            for (int k = 0; k < letras[i].length; k++) {
                                if (let == letras[numAleatorio][k]) {
                                    extra[numAleatorio][k] = let;
                                    letAcertadas++;
                                    conti--;
                                }
                            }
                            if (conti == 0) {
                                noAcertoLetra++;
                            }
                        }
                        conti = 0;

                        for (int k = 0; k < extra.length; k++) {
                            System.out.print("[" + extra[numAleatorio][k] + "]");
                        }
                        System.out.println("");
                    }
                    if (noAcertoLetra > 0) {
                        numOportunidades--;
                        if(numOportunidades > 0)
                        System.out.println("Tienes " + numOportunidades + " oportunidades");
                    }
                    if (numOportunidades == 0) {
                        ganaPierde = true;
                        System.out.println("Ya no tienes intentos");
                    }
                    noAcertoLetra = 0;
                }
            }
        }

        if (numAleatorio == 2) {
            letras = new char[6][6];
            extra = new char[6][6];
            numOportunidades = letras[numAleatorio].length;
            extra[numAleatorio][0] = '-';
            extra[numAleatorio][1] = '-';
            extra[numAleatorio][2] = '-';
            extra[numAleatorio][3] = '-';
            extra[numAleatorio][4] = '-';
            extra[numAleatorio][5] = '-';

            letras[numAleatorio][0] = 'c';
            letras[numAleatorio][1] = 'a';
            letras[numAleatorio][2] = 'r';
            letras[numAleatorio][3] = 't';
            letras[numAleatorio][4] = 'o';
            letras[numAleatorio][5] = 'n';
            for (int i = 0; i < extra.length; i++) {
                System.out.print("[" + extra[numAleatorio][i] + "]");
            }
            System.out.println("");
            System.out.println("Tienes " + numOportunidades + " oportunidades");
            for (int i = 0; i < letras.length; i++) {
                while (ganaPierde != true) {
                    System.out.println("Sabes la palabra? (0=si o 1=no) ");
                    adivinaoNo = d.nextInt();
                    d.nextLine();
                    if (adivinaoNo == 0) {
                        System.out.println("Cual es?");
                        adivina = d.nextLine();
                        if ("carton".equals(adivina)) {
                            System.out.println("Felicidades Ganaste!");
                            for (int j = 0; j < extra[numAleatorio].length; j++) {
                                System.out.print("[" + letras[numAleatorio][j] + "]");
                            }
                            ganaPierde = true;
                        } else {
                            System.out.println("Perdiste :c");
                            ganaPierde = true;
                        }
                    } else {
                        System.out.println("Introduce la letra");
                        let = d.nextLine().charAt(0);

                        for (int j = 0; j < letras.length; j++) {
                            if (letAcertadas == (letras[numAleatorio].length)*(letras[numAleatorio].length)) {
                                ganaPierde = true;
                                System.out.println("Felicidades, ganaste");
                            }
                            for (int k = 0; k < letras[i].length; k++) {
                                if (let == letras[numAleatorio][k]) {
                                    extra[numAleatorio][k] = let;
                                    letAcertadas++;
                                    conti--;
                                }
                            }
                            if (conti == 0) {
                                noAcertoLetra++;
                            }
                        }
                        conti = 0;

                        for (int k = 0; k < extra.length; k++) {
                            System.out.print("[" + extra[numAleatorio][k] + "]");
                        }
                        System.out.println("");
                    }
                    if (noAcertoLetra > 0) {
                        numOportunidades--;
                        if(numOportunidades > 0)
                        System.out.println("Tienes " + numOportunidades + " oportunidades");
                    }
                    if (numOportunidades == 0) {
                        ganaPierde = true;
                        System.out.println("Ya no tienes intentos");
                    }
                    noAcertoLetra = 0;
                }
            }
        }
        if (numAleatorio == 3) {
            letras = new char[7][7];
            extra = new char[7][7];
            numOportunidades = letras[numAleatorio].length;
            extra[numAleatorio][0] = '-';
            extra[numAleatorio][1] = '-';
            extra[numAleatorio][2] = '-';
            extra[numAleatorio][3] = '-';
            extra[numAleatorio][4] = '-';
            extra[numAleatorio][5] = '-';
            extra[numAleatorio][6] = '-';

            letras[numAleatorio][0] = 'h';
            letras[numAleatorio][1] = 'e';
            letras[numAleatorio][2] = 'r';
            letras[numAleatorio][3] = 'r';
            letras[numAleatorio][4] = 'e';
            letras[numAleatorio][5] = 'r';
            letras[numAleatorio][6] = 'a';
            for (int i = 0; i < extra.length; i++) {
                System.out.print("[" + extra[numAleatorio][i] + "]");
            }
            System.out.println("");
            System.out.println("Tienes " + numOportunidades + " oportunidades");
            for (int i = 0; i < letras.length; i++) {
                while (ganaPierde != true) {
                    System.out.println("Sabes la palabra? (0=si o 1=no) ");
                    adivinaoNo = d.nextInt();
                    d.nextLine();
                    if (adivinaoNo == 0) {
                        System.out.println("Cual es?");
                        adivina = d.nextLine();
                        if ("herrera".equals(adivina)) {
                            System.out.println("Felicidades Ganaste!");
                            for (int j = 0; j < extra[numAleatorio].length; j++) {
                                System.out.print("[" + letras[numAleatorio][j] + "]");
                            }
                            ganaPierde = true;
                        } else {
                            System.out.println("Perdiste :c");
                            ganaPierde = true;
                        }
                    } else {
                        System.out.println("Introduce la letra");
                        let = d.nextLine().charAt(0);

                        for (int j = 0; j < letras.length; j++) {
                            if (letAcertadas == (letras[numAleatorio].length)*(letras[numAleatorio].length)) {
                                ganaPierde = true;
                                System.out.println("Felicidades, ganaste");
                            }
                            for (int k = 0; k < letras[i].length; k++) {
                                if (let == letras[numAleatorio][k]) {
                                    extra[numAleatorio][k] = let;
                                    letAcertadas++;
                                    conti--;
                                }
                            }
                            if (conti == 0) {
                                noAcertoLetra++;
                            }
                        }
                        conti = 0;

                        for (int k = 0; k < extra.length; k++) {
                            System.out.print("[" + extra[numAleatorio][k] + "]");
                        }
                        System.out.println("");
                    }
                    if (noAcertoLetra > 0) {
                        numOportunidades--;
                        if(numOportunidades > 0)
                        System.out.println("Tienes " + numOportunidades + " oportunidades");
                    }
                    if (numOportunidades == 0) {
                        ganaPierde = true;
                        System.out.println("Ya no tienes intentos");
                    }
                    noAcertoLetra = 0;
                }
            }
        }

        if (numAleatorio == 4) {
            letras = new char[11][11];
            extra = new char[11][11];
            numOportunidades = letras[numAleatorio].length;
            extra[numAleatorio][0] = '-';
            extra[numAleatorio][1] = '-';
            extra[numAleatorio][2] = '-';
            extra[numAleatorio][3] = '-';
            extra[numAleatorio][4] = '-';
            extra[numAleatorio][5] = '-';
            extra[numAleatorio][6] = '-';
            extra[numAleatorio][7] = '-';
            extra[numAleatorio][8] = '-';
            extra[numAleatorio][9] = '-';
            extra[numAleatorio][10] = '-';

            letras[numAleatorio][0] = 'c';
            letras[numAleatorio][1] = 'o';
            letras[numAleatorio][2] = 'm';
            letras[numAleatorio][3] = 'p';
            letras[numAleatorio][4] = 'u';
            letras[numAleatorio][5] = 't';
            letras[numAleatorio][6] = 'a';
            letras[numAleatorio][7] = 'd';
            letras[numAleatorio][8] = 'o';
            letras[numAleatorio][9] = 'r';
            letras[numAleatorio][10] = 'a';
            for (int i = 0; i < extra.length; i++) {
                System.out.print("[" + extra[numAleatorio][i] + "]");
            }
            System.out.println("");
            System.out.println("Tienes " + numOportunidades + " oportunidades");
            for (int i = 0; i < letras.length; i++) {
                while (ganaPierde != true) {
                    System.out.println("Sabes la palabra? (0=si o 1=no) ");
                    adivinaoNo = d.nextInt();
                    d.nextLine();
                    if (adivinaoNo == 0) {
                        System.out.println("Cual es?");
                        adivina = d.nextLine();
                        if ("computadora".equals(adivina)) {
                            System.out.println("Felicidades Ganaste!");
                            for (int j = 0; j < extra[numAleatorio].length; j++) {
                                System.out.print("[" + letras[numAleatorio][j] + "]");
                            }
                            ganaPierde = true;
                        } else {
                            System.out.println("Perdiste :c");
                            ganaPierde = true;
                        }
                    } else {
                        System.out.println("Introduce la letra");
                        let = d.nextLine().charAt(0);

                        for (int j = 0; j < letras.length; j++) {
                            if (letAcertadas == (letras[numAleatorio].length)*(letras[numAleatorio].length)) {
                                ganaPierde = true;
                                System.out.println("Felicidades, ganaste");
                            }
                            for (int k = 0; k < letras[i].length; k++) {
                                if (let == letras[numAleatorio][k]) {
                                    extra[numAleatorio][k] = let;
                                    letAcertadas++;
                                    conti--;
                                }
                            }
                            if (conti == 0) {
                                noAcertoLetra++;
                            }
                        }
                        conti = 0;

                        for (int k = 0; k < extra.length; k++) {
                            System.out.print("[" + extra[numAleatorio][k] + "]");
                        }
                        System.out.println("");
                    }
                    if (noAcertoLetra > 0) {
                        numOportunidades--;
                        if(numOportunidades > 0)
                        System.out.println("Tienes " + numOportunidades + " oportunidades");
                    }
                    if (numOportunidades == 0) {
                        ganaPierde = true;
                        System.out.println("Ya no tienes intentos");
                    }
                    noAcertoLetra = 0;
                }
            }
        }

    }

}
