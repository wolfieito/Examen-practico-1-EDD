/*
 * EXAMEN_PRACTICO1_PRINCIPIANTE3 - Este programa generara dos arreglos de tamaño diez
 *  que llenara el usuario con valores enteros, luego los comparara a ver si tienen
 *  valores iguales sin importar en que parte del arreglo esten
 */

/**
 *
 * @author martin
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numValoresIguales=0;
        Scanner s=new Scanner(System.in);
        int aDatos1[]=new int[10];
        int aDatos2[]=new int[10];
        for (int i = 0; i < aDatos1.length; i++) {
            System.out.println("Introduzca el valor "+(i+1)+" del arreglo 1");
            aDatos1[i]=s.nextInt();
            s.nextLine();
        }
        for (int i = 0; i < aDatos2.length; i++) {
            System.out.println("Introduzca el valor "+(i+1)+" del arreglo 2");
            aDatos2[i]=s.nextInt();
            s.nextLine();
        }
        for (int i = 0; i < aDatos1.length; i++) {
            for (int j = 0; j < aDatos1.length; j++) {
                   if(aDatos1[i]==aDatos2[j])
                       numValoresIguales++;
                }
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
        System.out.println("Son similares");
        else
            System.out.println("No son similares");
    }
    
}
