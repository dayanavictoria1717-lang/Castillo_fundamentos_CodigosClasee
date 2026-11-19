public class Contrasena {

    public static void main(String[] args) {

        String clave = "Hola12345";

        boolean mayuscula = false;
        boolean digito = false;

        for (int i = 0; i < clave.length(); i++) {

            char letra = clave.charAt(i);

            if (Character.isUpperCase(letra)) {
                mayuscula = true;
            }

            if (Character.isDigit(letra)) {
                digito = true;
            }
        }

        if (clave.length() >= 8 && mayuscula && digito) {
            System.out.println("Contrasena valida");
        } else {
            System.out.println("Contrasena no valida");
        }
    }
}
