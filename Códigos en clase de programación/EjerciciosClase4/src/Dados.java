import java.util.Random;

public class Dados {

    public static void main(String[] args) {

        Random azar = new Random();

        int contador = 0;

        for (int i = 1; i <= 1000; i++) {

            int dado1 = azar.nextInt(6) + 1;
            int dado2 = azar.nextInt(6) + 1;

            if (dado1 + dado2 == 7) {
                contador++;
            }
        }

        System.out.println("Veces que sumaron 7: " + contador);
    }
}
