public class Intercambiar1 {
    public static void main(String[] args) {
        int x = 555;
        int y = 333;
        intercambiar (x, y);
    }
    static void intercambiar(int a, int b) {
        int temporal = a;
        a = b;
        b = temporal;
        System.out.println("Las variables son " + "a = " + a + " b = " +b);
    }
}