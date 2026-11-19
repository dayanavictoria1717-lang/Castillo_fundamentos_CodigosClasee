public class IvaIncluido {
    static double ivaIncluido(double precio) {
        return precio + (precio * 0.15);
    }
    public static void main(String[] args) {
        System.out.println(ivaIncluido(100));
    }
}
