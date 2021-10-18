package eva1_6_heap_2;

public class EVA1_6_PASOXVAL_PASOXREF_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valOG = 5;
        System.out.println("Valor original en main= " + valOG);
        incrementa(valOG);
        //valOG= incrementaChido(valOG);
        System.out.println("Valor despues de incrementar: " + valOG);

        //Demostración de paso por referencia
        Prueba objPrueba = new Prueba();
        System.out.println("Valor de x: " + objPrueba.x);
        System.out.println(objPrueba);
        System.out.println("Obj prueba en main= " + objPrueba);
        incrementaObj(objPrueba);
        System.out.println("Valor de x depsues : " + objPrueba.x);
    }

    //Paso por valor--> Pasamos una copia del valor en una variable(variables locales o primitivas)
    //Nunca estuvimos modificando la original siempre fue la copia(val)
    public static void incrementa(int val) {
        val++; //val+=1; val= val+1;
        System.out.println("Valor incrementa= " + val);
    }

    public static int incrementaChido(int val) {
        val++;
        return val;
    }

    //Paso por refernecia--> Paamos la dirección en memoria del objeto(objetos)
    public static void incrementaObj(Prueba val) {
        System.out.println("Obj en icrementa obj= " + val);
        val.x++;
    }

}

class Prueba {

    public int x = 10;
}
