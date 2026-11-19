public class ImprimirTabla {
    static void imprimirTabla (int n) {
        for (int i= 1; i<=10; i++){
            System.out.println(n * i);
        }
    }
    public static void main(String[] args) {
        imprimirTabla(2);
    }
}
