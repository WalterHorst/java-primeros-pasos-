import javax.swing.JOptionPane;

public class NombreMasLargo {
    public static void main(String[] args) {
        // Pedir el nombre completo de tres personas
        String input1 = JOptionPane.showInputDialog("Ingresa el nombre completo de la persona 1:");
        String input2 = JOptionPane.showInputDialog("Ingresa el nombre completo de la persona 2:");
        String input3 = JOptionPane.showInputDialog("Ingresa el nombre completo de la persona 3:");

        // Separar nombre y apellido utilizando split
        String[] nombreApellido1 = input1.split(" ");
        String[] nombreApellido2 = input2.split(" ");
        String[] nombreApellido3 = input3.split(" ");

        // Calcular la longitud del nombre de cada persona
        int longitudNombre1 = nombreApellido1[0].length();
        int longitudNombre2 = nombreApellido2[0].length();
        int longitudNombre3 = nombreApellido3[0].length();

        // Encontrar el nombre más largo
        int maxLongitud = Math.max(longitudNombre1, Math.max(longitudNombre2, longitudNombre3));

        // Imprimir el nombre de la persona con el nombre más largo
        if (maxLongitud == longitudNombre1) {
            JOptionPane.showMessageDialog(null,
                    nombreApellido1[0] + " " + nombreApellido1[1] + " tiene el nombre más largo.");
        } else if (maxLongitud == longitudNombre2) {
            JOptionPane.showMessageDialog(null,
                    nombreApellido2[0] + " " + nombreApellido2[1] + " tiene el nombre más largo.");
        } else {
            JOptionPane.showMessageDialog(null,
                    nombreApellido3[0] + " " + nombreApellido3[1] + " tiene el nombre más largo.");
        }
    }

}
