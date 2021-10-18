package eva1_2_stack;

public class EVA1_2_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicia Main");
        A(); // No se destrutye main solo se queda inactivo o en espera
        System.out.println("Termina Main");
    }

    public static void A() {
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
    }

    public static void B() {
        System.out.println("Inicia B");
      int i=0;
      double d= 0.0;
        System.out.println("Termina B");
    }

}
