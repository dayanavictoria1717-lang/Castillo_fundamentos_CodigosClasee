import java.util.Arrays;

public class AplicarDescuento {

    public static void main(String[] args) {

        double[] precios = {156, 5, 75};

        System.out.println("Precio Inicial:");
        System.out.println(Arrays.toString(precios));

        aplicarDescuento(precios, 10);

        System.out.println("Precios final con descuento:");
        System.out.println(Arrays.toString(precios));

    }

    static void aplicarDescuento(double[] precios, double pct) {

        for (int i = 0; i < precios.length; i++) {

            precios[i] = precios[i] - (precios[i] * pct / 100);

        }

    }
}
