package eva1_11_ejemplo_arrreglos;

import java.util.Scanner;

public class EVA1_11_EJEMPLO_ARRREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Preguntar tamaño del grupo
        Scanner input = new Scanner(System.in);
        System.out.println("Indica el tamaño del grupo: ");
        int iTama = input.nextInt();
        int[] aiEdades = new int[iTama];
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("EDAD: ");
            aiEdades[i] = input.nextInt();
        }
        int iAcum = 0;
        for (int i = 0; i < aiEdades.length; i++) {
            iAcum += aiEdades[i];
            System.out.print("[" + aiEdades[i] + "]");

        }

        System.out.println("\nSuma de las edades : " + iAcum);
        double iProm = (double)iAcum / (double)iTama;
        System.out.println("PROMEDIO: " + iProm);
    }

}
