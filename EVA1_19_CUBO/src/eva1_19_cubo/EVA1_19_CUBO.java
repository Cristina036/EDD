
package eva1_19_cubo;

/**
 *
 * @author anacr
 */
public class EVA1_19_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][][] aiCubo= new int[3][4][2];
        //24 ENTEROS (3X4X2)
        for (int i = 0; i < aiCubo.length; i++) {
            for (int j = 0; j < aiCubo[i].length; j++) {
                for (int k = 0; k <  aiCubo[i][j].length; k++) {
                    aiCubo[i][j][k]=100;
                }
            }
            
        }
    }

}
