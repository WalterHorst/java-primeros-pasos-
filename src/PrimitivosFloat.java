public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 0.15f; // Float siempre lleva una f al final ya que la primitiva es de tipo int
        System.out.println("realFloat= " + realFloat);
        System.out.println("Tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor maximo de un float " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float " + Float.MIN_VALUE);
    }
}
