package eva1_13_arreglos;
public class EVA1_13_ARREGLOS {

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
        //CREMAOS NUEVA VARIABLE TIPO ARRAY
        int[] iCopia = iArreglo;
        System.out.println("Dirección de iCopia = " + iCopia);
        for (int i = 0; i < iCopia.length; i++) {
            System.out.println("CUENTA iCopia: " + i + " = $" + iCopia[i]);
        }
        //ES UN SOLO ARREGLO 
        
        iArreglo = new int[2];
        System.out.println("Dirección de iArrgelo modificado = "+ iArreglo);
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("CUENTA MODIFICADA: " + i + " = $" + iArreglo[i]);
        }
        System.out.println("Dirección de iCopia = " + iCopia);
        for (int i = 0; i < iCopia.length; i++) {
            System.out.println("CUENTA iCopia: " + i + " = $" + iCopia[i]);
        }
    }

}
