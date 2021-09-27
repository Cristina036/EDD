package repaso_6_while;

import java.util.Scanner;

/**
 *
 * @author anacr
 */
public class REPASO_6_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu número(MAYOR A 10 para detener): ");
        int iCont = input.nextInt();

        while (iCont <= 10) {
            System.out.println("Introduce tu número(MAYOR A 10 para detener): ");
            iCont = input.nextInt();
        }

    }

}
