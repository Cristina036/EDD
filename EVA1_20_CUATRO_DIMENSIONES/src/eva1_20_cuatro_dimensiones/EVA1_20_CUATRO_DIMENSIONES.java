package eva1_20_cuatro_dimensiones;

/**
 *
 * @author anacr
 */
public class EVA1_20_CUATRO_DIMENSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][][][] iTese = new int[5][3][2][6]; //ALMACENA 180 ENTEROS
        for (int i = 0; i < iTese.length; i++) {
            for (int j = 0; j < iTese[i].length; j++) {
                for (int k = 0; k < iTese[i][j].length; k++) {
                    for (int l = 0; l < iTese[i][j][k].length; l++) {
                        iTese[i][j][k][l]=100;
                    }
                }
            }
        }
    }
    
}
