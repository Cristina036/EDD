package eva1_21_arreglo_objetos;

import java.util.Scanner;

/**
 *
 * @author anacr
 */
public class EVA1_21_ARREGLO_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona aPersonas[] = new Persona[10];
        Scanner input= new Scanner(System.in);
        for (int i = 0; i < aPersonas.length; i++) {
            aPersonas[i] = new Persona();//CREAMOS OBJETO DE TIPO PERSONA EN I 
        }
        for (int i = 0; i < aPersonas.length; i++) {
            System.out.println(aPersonas[i].getNombre());
            System.out.println("Introduce un nombre: ");
            String Nombre= input.nextLine();
            aPersonas[i].setNombre(Nombre);
        }
        for (int i = 0; i < aPersonas.length; i++) {
            System.out.println("Nombre: "+ aPersonas[i].getNombre());
        }
    }

}

class Persona {

    String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
