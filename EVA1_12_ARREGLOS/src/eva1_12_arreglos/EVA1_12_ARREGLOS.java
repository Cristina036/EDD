package eva1_12_arreglos;

public class EVA1_12_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] iArreglo = new int[3]; //12 bytes
        System.out.println("Dirección de iArrgelo = "+ iArreglo);
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
        //iArreglo[3]=3; error: ArrayIndexOutOfBound
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("CUENTA: " + i + " = $" + iArreglo[i]);
        }
        iArreglo = new int[2];
        System.out.println("Dirección de iArrgelo modificado = "+ iArreglo);
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("CUENTA MODIFICADA: " + i + " = $" + iArreglo[i]);
        }
    }

}
