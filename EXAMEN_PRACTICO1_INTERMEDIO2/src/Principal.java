/*
 * EXAMEN_PRACTICO1_INTERMEDIO2 - Este programa genera un arreglo de tamaño quince que 
 *  se llenara con valores enteros al azar, luego lo mostara y le pedira un valor al
 *  usuario para borrar del arreglo, si ese valor esta en el arreglo lo borrara y 
 +  recorrera los demas numeros, haciendo que el ultimo se vuelva cero
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
        Scanner s=new Scanner(System.in);
        // TODO code application logic here
        int aDatos[]=new int[15];
        for (int i = 0; i < aDatos.length; i++) {
            aDatos[i]=(int)((Math.random()*100)+1);
        }
        for (int i = 0; i < aDatos.length; i++) {
            System.out.print("["+aDatos[i]+"]");
        }
        System.out.println("");
        System.out.println("Deme un valor");
        int numPedido=s.nextInt();
        for (int i = 0; i < aDatos.length; i++) {
            if(numPedido==aDatos[i])
                aDatos[i]=0;
        }
        for (int i = 0; i<aDatos.length-1; i++) {
            if(aDatos[i]==0){
                aDatos[i]=aDatos[i+1];
                aDatos[i+1]=0;
            }
        }
        for (int i = 0; i < aDatos.length; i++) {
            System.out.print("["+aDatos[i]+"]");
        }
                
    }
    
}
