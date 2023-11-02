import java.util.Scanner;

public class EncontrarNumeroMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números a comparar (al menos 10): ");
        int cantidadNumeros = teclado.nextInt();

        if (cantidadNumeros < 10) {
            System.out.println("Debes ingresar al menos 10 números.");
        } else {
            int menorNumero = Integer.MAX_VALUE;

            for (int i = 1; i <= cantidadNumeros; i++) {
                System.out.print("Ingresa el número " + i + ": ");
                int numero = teclado.nextInt();

                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }

            System.out.println("El número menor es: " + menorNumero);

            if (menorNumero < 10) {
                System.out.println("El número menor es menor que 10!");
            } else {
                System.out.println("El número menor es igual o mayor que 10!");
            }
        }

        teclado.close();
    }
}
