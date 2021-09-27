package repaso_3_estructuras_condicionales;

import java.util.Scanner;

/**
 *
 * @author anacr
 */
public class REPASO_3_ESTRUCTURAS_CONDICIONALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        //JUBILACIÓN:
        //Mujeres: 60
        //Hombres:65

        //PREGUNTAR
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu género (Hombre --> H, Mujeres -->M): ");
        String SGen = input.nextLine();
        System.out.println("Introduce tu edad:");
        int iEdad = input.nextInt();

        if (SGen.equals("M")) {

            if ((SGen.equals("M")) && (iEdad >= 60)) {
                System.out.println("Te puedes jubilar");

            } else if((SGen.equals("H")) && (iEdad >= 65)){
                System.out.println("Te puedes jubilar");
            }else if((!SGen.equals("M"))&&(!SGen.equals("H"))){
                System.out.println("LETRA INCORRECTA");
            }else{
                System.out.println("No te puedes jubilar");
            }

        }

    }
}
