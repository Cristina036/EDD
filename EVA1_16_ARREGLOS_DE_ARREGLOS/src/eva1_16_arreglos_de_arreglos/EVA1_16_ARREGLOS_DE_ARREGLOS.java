
package eva1_16_arreglos_de_arreglos;

public class EVA1_16_ARREGLOS_DE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][]iMatriz= new int [3][3];
        System.out.println("Dirección de la matriz: "+ iMatriz);
        System.out.println("Tamaño de la primera dimensión (filas): "+ iMatriz.length);
        for (int i = 0; i < iMatriz.length; i++) {
            System.out.println("iMatriz["+i+"] = "+ iMatriz[i]); //Esto solo da direcciones
            
        }
    }

}
