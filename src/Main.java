
public class Main {

    public static boolean esPalindromo(String palabra) {

        // Validar que la palabra no sea nula
        if (palabra == null) {
            return false;
        }

        // Convertir a minusculas y quitar espacios
        palabra = palabra.toLowerCase().replace(" ", "");

        return comprobar(palabra, 0, palabra.length() - 1);
    }

    public static boolean comprobar(String palabra, int inicio, int fin) {

        // Caso base: los indices se cruzan o llegan al centro
        if (inicio >= fin) {
            return true;
        }

        // Si los caracteres son diferentes, no es palindromo
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }

        // Llamada recursiva: avanzar hacia el centro
        return comprobar(palabra, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {

        System.out.println("reconocer: " + esPalindromo("reconocer"));
        System.out.println("radar: " + esPalindromo("radar"));
        System.out.println("hola: " + esPalindromo("hola"));
        System.out.println("vacio: " + esPalindromo(""));
        System.out.println("un caracter: " + esPalindromo("a"));
        System.out.println("con espacios: " + esPalindromo("anita lava la tina"));
        System.out.println("nulo: " + esPalindromo(null));
    }
}
