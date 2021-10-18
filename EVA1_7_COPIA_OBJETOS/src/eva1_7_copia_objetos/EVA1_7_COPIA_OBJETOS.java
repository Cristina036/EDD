
package eva1_7_copia_objetos;


public class EVA1_7_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prueba obj1= new Prueba();
        System.out.println(obj1);
        Prueba obj2= obj1;
        System.out.println(obj2);
        System.out.println("Valor de x= "+ obj1.x);
        obj2.x++;
        System.out.println("Valor de x= "+ obj1.x);
    }

}
class Prueba{
    int x=10;
}
