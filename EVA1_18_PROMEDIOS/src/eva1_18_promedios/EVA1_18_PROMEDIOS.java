package eva1_18_promedios;

import java.util.Scanner;

/**
 *
 * @author anacr
 */
public class EVA1_18_PROMEDIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] aiGrupos;
        System.out.println("¿Cuántos grupos son?");
        int iNoGrupos = input.nextInt();

        aiGrupos = new int[iNoGrupos][];
        for (int i = 0; i < aiGrupos.length; i++) {
            System.out.println("Para el grupo " + i + " ¿Cuántos estudiantes son?");
            int iNoEstu = input.nextInt();
            aiGrupos[i] = new int[iNoEstu];
        }
        for (int i = 0; i < aiGrupos.length; i++) { //PRIMERA DIMENSIÓN
            for (int j = 0; j < aiGrupos[i].length; j++) { //SEGUNDA DIMENSIÓN
                System.out.print("[ "+ "]");
            }
            System.out.println("");
        }
    }

}
