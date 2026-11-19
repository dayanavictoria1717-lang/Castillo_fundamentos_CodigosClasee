public class Operacion {

    static double sumar(double a, double b, double c) {
        return a + b + c;
    }

    static double promedio(double a, double b, double c) {
        return sumar(a, b, c) / 3;
    }

    public static void main(String[] args) {

        double resultado = promedio(8, 9, 10);

        System.out.println("Promedio: " + resultado);
    }
}