import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su factura a continuacion:");
        String nombreFactura = teclado.nextLine();

        System.out.println("Ingrese un precio de producto:");
        double precioProducto1 = teclado.nextDouble();

        System.out.println("Ingrese un precio de producto:");
        double precioProducto2 = teclado.nextDouble();

        double precioTotalBruto = (precioProducto1 + precioProducto2);
        double totalImpuesto = precioTotalBruto * 0.19;
        double neto = precioTotalBruto + totalImpuesto;

        System.out.println("La factura "+nombreFactura+" tiene un total bruto de " + precioTotalBruto
                + ", con un impuesto de " + totalImpuesto + " y el monto después de impuesto es de " + neto);

    }

}
