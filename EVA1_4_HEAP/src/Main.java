
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MiClase Obj = new MiClase();
        System.out.println(Obj.getMensaje());
        MiClase Obj2 = new MiClase();
        System.out.println(Obj2.getMensaje());
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
