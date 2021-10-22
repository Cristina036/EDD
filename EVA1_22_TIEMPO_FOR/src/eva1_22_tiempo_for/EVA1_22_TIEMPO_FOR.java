
package eva1_22_tiempo_for;

/**
 *
 * @author anacr
 */
public class EVA1_22_TIEMPO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int [] aiArray= new int[Integer.MAX_VALUE]; //8 GB EN RAM
        int [] aiArray= new int[100000000];//400 MEGAS
        for (int i = 0; i < aiArray.length; i++) {
            aiArray[i]=100;
        }
    }

}
