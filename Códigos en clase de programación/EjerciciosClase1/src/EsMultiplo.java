public class EsMultiplo{
    static boolean esMultiplo (int a, int b) {
        return a % b == 0;
        
    }
    public static void main(String[] args) {
        int valor1 = 444;
        int valor2 = 222;
        System.out.println(esMultiplo(valor1,valor2));
    }
}