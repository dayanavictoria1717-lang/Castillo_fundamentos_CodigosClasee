public class Perimetro {

    static double perimetro(double lado) {
        return lado * 4;
    }

    static double perimetro(double a, double b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {

        System.out.println("Perimetro del cuadrado: " + perimetro(5));

        System.out.println("Perimetro del rectangulo: " + perimetro(4, 6));
    }
}
