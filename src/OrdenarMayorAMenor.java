import javax.swing.JOptionPane;

public class OrdenarMayorAMenor {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Introduce el primer número:");
        String input2 = JOptionPane.showInputDialog("Introduce el segundo número:");

        Integer num1 = Integer.parseInt(input1);
        Integer num2 = Integer.parseInt(input2);

        int mayor = (num1 > num2) ? num1 : num2;
        int menor = (num1 < num2) ? num1 : num2;

        JOptionPane.showMessageDialog(null, "Números ordenados de mayor a menor:\n" + mayor + " - " + menor);

    }
}
