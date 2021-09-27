package repaso_5_for;

import java.util.Scanner;

/**
 *
 * @author anacr
 */
public class REPASO_5_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu número: ");
        int iCont = input.nextInt();
        for (int i = 0; i <= iCont; i++) {
            System.out.print(i + " - ");
            
        }
        System.out.println(" ");
        for (int i = iCont; i >= 0; i--) {
            System.out.print(i + " - ");
        }
    }

}
