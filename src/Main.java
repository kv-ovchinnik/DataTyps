import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        final String delimiter = "\n------------------------------------------------\n";
        System.out.print("Переменная типа Byte занимает ");
        System.out.print(Byte.BYTES);
        System.out.print(" Байт памяти или ");
        System.out.print(Byte.SIZE);
        System.out.print(" Бит памяти, и принимает значение в диапозоне от");
        System.out.print(Byte.MIN_VALUE);
        System.out.print(" до ");
        System.out.println(Byte.MAX_VALUE);
        System.out.print("Переменная типа Short занимает ");
        System.out.print(Short.BYTES);
        System.out.print(" Байт памяти или ");
        System.out.print(Short.SIZE);
        System.out.print(" Бит памяти, и принимает значение в диапозоне от");
        System.out.print(Short.MIN_VALUE);
        System.out.print(" до ");
        System.out.println(Short.MAX_VALUE);
        System.out.print("Переменная типа Int занимает ");
        System.out.print(Long.BYTES);
        System.out.print(" Байт памяти ");
        System.out.print(Long.SIZE);
        System.out.print(" Бит памяти, и принимает значение в диапозоне от");
        System.out.print(Long.MIN_VALUE);
        System.out.print(" до ");
        System.out.print(Long.MAX_VALUE);

        System.out.println(delimiter);

        System.out.println("Переменная типа Byte занимает" + Byte.BYTES  + "Байт памяти" + (Byte.SIZE  + "бит памяти") + "и принимает значения в диапазоне от" + Byte.MIN_VALUE + "до" + Byte.MAX_VALUE );

        System.out.println("Переменная типа %s занимает %d Байт памяти (%d бит памяти), и принимает значения в диапазоне от %d до %d".formatted("Byte", Byte.BYTES, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE ));
        System.out.printf("Переменная типа %s занимает %d Байт памяти (%d бит памяти), и принимает значения в диапазоне от %d до %d", "Byte", Byte.BYTES, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println(delimiter);
        System.out.printf("Переменная типа %s занимает %d Байт памяти (%d бит памяти), и принимает значения в диапазоне от %e до %e \n", "Float", Float.BYTES, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Переменная типа %s занимает %d Байт памяти (%d бит памяти), и принимает значения в диапазоне от %e до %e \n", "Double", Double.BYTES, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.println(38e-4);
    }
}