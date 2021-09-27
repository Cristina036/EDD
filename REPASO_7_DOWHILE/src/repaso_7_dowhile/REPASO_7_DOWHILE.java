package repaso_7_dowhile;

import java.util.Scanner;

/**
 *
 * @author anacr
 */
public class REPASO_7_DOWHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iCont;
        
        do {
            System.out.println("Introduce tu número(MAYOR A 10 para detener): ");
            iCont = input.nextInt();
            
        } while (iCont <= 10);

    }

}
