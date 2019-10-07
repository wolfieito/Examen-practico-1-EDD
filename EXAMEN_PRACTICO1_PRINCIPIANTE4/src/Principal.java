/*
 * EXAMEN_PRACTICO1_PRINCIPIANTE4 - Este programa generara un arreglo de tamaño 20
 *  que sera llenado con valores enteros al azar entre 1 y 20, luego recorrera el 
 *  arreglo del ultimo valor al primero guardando el valor que se repita primero tres
 *  veces, si ninguno se repite tres veces o mas guardamos -1 y asi sabemos que no
 *  se repite ningun numero
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
        int numRepeticiones=0,numRepTresVeces=0,iteracion=0;
        int aDatos[]=new int[20];
        for (int i = 0; i < aDatos.length; i++) {
            aDatos[i]=(int)((Math.random()*20)+1);
        }
        for (int i = 0; i < aDatos.length; i++) {
            System.out.print("["+aDatos[i]+"]");
        }
        while(numRepTresVeces==0){
        for (int i = aDatos.length; i > 0; i--) {
            for (int j = aDatos.length; j > 0; j--) {
                iteracion++;
                if(aDatos[i-1]==aDatos[j-1])
                    numRepeticiones++;
            }     
            if(numRepeticiones>=3)
                numRepTresVeces=aDatos[i-1];
            else if(iteracion==aDatos.length)
                numRepTresVeces=-1;
            numRepeticiones=0;
        }
        }
        System.out.println("");
        if(numRepTresVeces==-1)
        System.out.println("Ninguno se repite tres veces");
        else
            System.out.println("El ["+numRepTresVeces+"] es el primero en repetirse tres veces o mas");
    }
    
}
