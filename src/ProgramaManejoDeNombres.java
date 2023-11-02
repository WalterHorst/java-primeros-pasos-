import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el nombre del primer integrante de tu familia:");
        String nombre1 = teclado.nextLine();
        String nombre1a = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length() - 2);

        System.out.println("Ingresa el nombre del segundo integrante de tu familia:");
        String nombre2 = teclado.nextLine();
        String nombre2a = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length() - 2);

        System.out.println("Ingresa el nombre del tercer integrante de tu familia:");
        String nombre3 = teclado.nextLine();
        teclado.close();
        String nombre3a = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length() - 2);

        String retorno = nombre1a + "-" + nombre2a + "-" + nombre3a;

        System.out.println(retorno);

    }

}
