package eva1_14_copia_arreglos;

public class EVA1_14_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] iArreglo = new int[3]; //12 bytes
        System.out.println("Dirección de iArrgelo = " + iArreglo);
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
        //iArreglo[3]=3; error: ArrayIndexOutOfBound
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("CUENTA: " + i + " = $" + iArreglo[i]);
        }
        int[] iCopia = new int[3]; //ARRREGLO Y COPIA DEBE DE SER DEL MISMO TAMAÑO
        System.out.println("Dirección de iCopia= " + iCopia);
        for (int i = 0; i < iArreglo.length; i++) {
            iCopia[i] = iArreglo[i];
        }
        iCopia[0] = 1000000;
        for (int i = 0; i < iCopia.length; i++) {
            System.out.println("CUENTA: " + i + " = $" + iCopia[i]);

        }
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("CUENTA: " + i + " = $" + iArreglo[i]);

        }

        //Duplicado de iCopia 
    }

}
