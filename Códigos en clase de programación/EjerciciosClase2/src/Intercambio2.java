import java.util.Arrays;
public class Intercambio2 {
    public static void intercambiar(int [] v, int i, int j) {
        int temporal = v[i];
        v[i] = v[j];
        v[j] = temporal;
    }
    public static void main(String[] args) {
        int[] v = {5, 10, 15};
        intercambiar(v, 0, 2);
        System.out.println("En main: " + Arrays.toString(v));

    }
}
