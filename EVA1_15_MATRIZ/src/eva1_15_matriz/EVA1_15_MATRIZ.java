package eva1_15_matriz;

public class EVA1_15_MATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iMatriz[][] = new int[5][3];
        iMatriz[0][0] = 1000;
        iMatriz[4][2] = 2000;
        System.out.println("Tamaño del arreglo: " + iMatriz.length);
        for (int i = 0; i < iMatriz.length; i++) {
            for (int j = 0; j < 3; j++) {
                iMatriz[i][j] = 1000;
            }
        }
        for (int i = 0; i < iMatriz.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" +iMatriz[i][j]+"]");
            }
            System.out.println("");
        }

    }

}
