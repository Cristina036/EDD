
package repaso_1_sintaxis;

import java.util.Scanner;

/**
 *
 * @author anacr
 */
public class REPASO_1_SINTAXIS {

    /**
     * @param args the command line arguments
     */
    //FUNCIÓN MAIN
    public static void main(String[] args) {
   
        System.out.println("¿Cuantos años tienes?");
        Scanner input = new Scanner(System.in);
        int iEdad = input.nextInt();
        
        if (iEdad >= 18) {
            System.out.println("MAYOR DE EDAD");
            
        }else{
            System.out.println("MENOR DE EDAD");
        }
    }

}
