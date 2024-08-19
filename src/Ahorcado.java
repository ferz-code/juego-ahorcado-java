import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // Para que escriba el usuario
        Scanner scanner = new Scanner(System.in);
        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean parabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura interactiva
        while (!parabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " " + palabraSecreta.length()
                    + " letras");

            System.out.println("Introduce la letra por favor");
            // Usamos la clase scanner
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letrasCorrectas = false;

            // estructura de control
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letrasCorrectas = true;
                }
            }
            // Para letras incorrectas
            if (!letrasCorrectas) {
                intentos++;
                System.out.println("Incorrectos! te quedan " + (intentosMaximos - intentos) + " intentos");
            }

            // palabra correcta
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                parabraAdivinada = true;
                System.out.println("Felicidades!! Adivinaste la palabra " + palabraSecreta +" ");

            }
        }
        // Se terminan intentos
        if (!parabraAdivinada) {
            System.out.println("Te has quedado sin intentos. Game Over!");
        }
        scanner.close();
    }
}
