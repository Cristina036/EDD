
package eva1_5_garbage_collector;


public class EVA1_5_GARBAGE_COLLECTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MiClase Obj = new MiClase();
        System.out.println(Obj);
        //ELIMINAMOS EL OBJETO
        Obj=null;
        System.out.println(Obj);
    }
}
class MiClase {

    private String Mensaje;

    public MiClase() {
        Mensaje = "Hola mundo";
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
}
