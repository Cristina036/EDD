
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A();

    }

    public static void A() {
        B();
    }

    public static void B() {
        A();
    }
}
