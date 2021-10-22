
package eva1_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author anacr
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.println("Introduce el número: ");
        int iVal= input.nextInt();
        boolean esPrimo=true;
        for (int i = 2; i < iVal; i++) {
            int iMod= iVal%i;
            
            if(iMod ==0){
                esPrimo=false;
                break;
                //continue; Detiene la iteración actual                
            }
        }
            if(esPrimo)
                System.out.println("El numero es primo");
            else
                System.out.println("El numero no es primo");
            }
        }
    

