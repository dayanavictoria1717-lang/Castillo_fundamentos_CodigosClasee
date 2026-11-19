public class Contador {

    static int llamadas = 0;

    static void contar() {
        llamadas++;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            contar();
        }

        System.out.println("Llamadas: " + llamadas);
    }
}
