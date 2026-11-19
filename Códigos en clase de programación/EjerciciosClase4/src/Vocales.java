public class Vocales {

    public static void main(String[] args) {

        String frase = "Hola mundo";
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            char letra = Character.toLowerCase(frase.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                letra == 'o' || letra == 'u') {

                contador++;
            }
        }

        System.out.println("Cantidad de vocales: " + contador);
    }
}