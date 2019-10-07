

/*
 * EXAMEN_PRACTICO1_PRINCIPIANTE5 - Este programa generara un arreglo de tamaño 15
 *  lo llenara de manera que en las posiciones pares solo halla pares y en las 
 *  impares cualquier numero(par o impar)
 */

/**
 *
 * @author martin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aDatos[]=new int[15];
        for (int i = 0; i < aDatos.length; i++) {
            if(i%2==0){
                while(aDatos[i]==0){
                  int numAleatorio=(int)((Math.random()*100)+1);
                  if(numAleatorio%2==0)
                      aDatos[i]=numAleatorio;
                } 
            }
            else
                aDatos[i]=(int)((Math.random()*100)+1);
        }
        for (int i = 0; i < aDatos.length; i++) {
            System.out.print("["+aDatos[i]+"]");
        }
        System.out.println("");
    }
}
