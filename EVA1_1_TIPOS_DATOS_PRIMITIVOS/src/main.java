
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int iVal = Integer.MAX_VALUE;
        System.out.println("Valor mas grande: " + iVal);
        
        iVal += 1; //OVERFLOW
        System.out.println("Valor mas grande: " + iVal);
        
        iVal = Integer.MIN_VALUE;
        System.out.println("Valor mas pequeño: " + iVal);
    }

}
