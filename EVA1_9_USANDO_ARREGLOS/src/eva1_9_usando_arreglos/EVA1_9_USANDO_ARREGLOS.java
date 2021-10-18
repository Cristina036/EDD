package eva1_9_usando_arreglos;

public class EVA1_9_USANDO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Arreglo de enteros 

        int[] aiDatos = new int[10];

        //2. Llenar con valores
        //Arreglo: estructura de acceso aleatorio
        //indice:
        //Primer elemento del arreglo: posicion 0
        //Ultimo elemento del arreglo: posicion N-1 (N-->tamaño de arreglo)
        //Acceso a los valores:
        for (int i = 0; i < 10; i++) { 
            aiDatos[i]=(int)(Math.random()*100);
        }
        //3. Imprimir valores 
                for (int i = 0; i < 10; i++) { 
                    System.out.print("["+aiDatos[i] +"]");
            
        }
        
        

    }

}
