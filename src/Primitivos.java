public class Primitivos {
    public static void main(String[] args) {
        byte numeroByte = 7;
        System.out.println("numeroByte= " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 3565;
        System.out.println("numeroByte= " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo de un short " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short " + Short.MIN_VALUE);

        int numeroInt = 41234536;
        System.out.println("numeroByte= " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int " + Integer.MIN_VALUE);

        long numeroLong = 154443214134153L; // Siempre finalizar con L ya que la literal es tipo int
        System.out.println("numeroByte= " + numeroLong);
        System.out.println("Tipo Long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo Long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maximo de un Long " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un Long " + Long.MIN_VALUE);

    }
}
