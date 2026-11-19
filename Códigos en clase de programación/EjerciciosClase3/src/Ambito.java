public class Ambito {

    static int contador = 0;

    public static void main(String[] args) {

        int suma = 0;

        for (int i = 1; i <= 3; i++) {

            int numero = i * 2;

            suma = suma + numero;

            contador++;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Contador: " + contador);
    }
}