/*
 * EXAMEN_PRACTICO1_PRINCIPIANTE2 - este programa generara dos arreglos de tamaño diez
 *  que guardaran valores enteros generados al azar, luego comparara si son iguales,
 *  comprobara que el mismo valor este en la misma posicion de ambos arreglos
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
        Scanner s=new Scanner(System.in);
        int numValoresIguales=0;
        int aDatos1[]=new int[10];
        int aDatos2[]=new int[10];
        for (int i = 0; i < aDatos1.length; i++) {
            System.out.println("Deme el valor "+(i+1)+" del arreglo 1");
            aDatos1[i]=s.nextInt();
            s.nextLine();
        }
        for (int i = 0; i < aDatos2.length; i++) {
            System.out.println("Deme el valor "+(i+1)+" del arreglo 2");
            aDatos2[i]=s.nextInt();
            s.nextLine();
        }
        for (int i = 0; i < aDatos1.length; i++) {
            if(aDatos1[i]==aDatos2[i])
                numValoresIguales++;
        }
        for (int i = 0; i < aDatos1.length; i++) {
            System.out.print("["+aDatos1[i]+"]");
        }
        System.out.println("");
        for (int i = 0; i < aDatos2.length; i++) {
            System.out.print("["+aDatos2[i]+"]");
        }
        System.out.println("");
        if(numValoresIguales==aDatos1.length)
            System.out.println("Son iguales");
        else
            System.out.println("Son diferentes");
    }
    
}
