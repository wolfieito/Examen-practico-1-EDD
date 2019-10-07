/*
 * EXAMEN_PRACTICO1_PRINCIPIANTE 1 - Este programa generara un arreglo de tamaño 15
 *  y lo llenara con valores pares al azar entre 1 y 100.
 * 
 */

/**
 * 
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aDatos[]=new int[15];
        for (int i = 0; i < aDatos.length; i++) {
            while(aDatos[i]==0){
                int valorAleatorio=(int)((Math.random()*100)+1);
                    if(valorAleatorio%2==0)
                    aDatos[i]=valorAleatorio;
            }                
        }
        for (int i = 0; i < aDatos.length; i++) {
            System.out.print("["+aDatos[i]+"]");
        }
    }
    
}
