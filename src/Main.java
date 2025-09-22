import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task 1
        int [] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        float [] floatArray = {1.57f, 7.654f, 9.986f};
        boolean [] boolArray = new boolean[6];
        boolArray[0] = true;
        boolArray[2] = true;

        System.out.println("Задача 2");
        for (int index = 0; index < intArray.length - 1; index++) {
            System.out.print(intArray[index] + ", ");
        }
        System.out.print(intArray[intArray.length - 1]);
        System.out.println(" ");

        for (int index = 0; index < floatArray.length - 1; index++) {
            System.out.print(floatArray[index] + ", ");
        }
        System.out.print(floatArray[floatArray.length - 1]);
        System.out.println(" ");

        for (int index = 0; index < boolArray.length - 1; index++) {
            System.out.print(boolArray[index] + ", ");
        }
        System.out.print(boolArray[boolArray.length - 1]);
        System.out.println(" ");

        System.out.println("Задача 3");
        for (int index = intArray.length - 1; index > 0; index--) {
            System.out.print(intArray[index] + ", ");
        }
        System.out.print(intArray[0]);
        System.out.println(" ");

        for (int index = floatArray.length - 1; index > 0; index--) {
            System.out.print(floatArray[index] + ", ");
        }
        System.out.print(floatArray[0]);
        System.out.println(" ");

        for (int index = boolArray.length - 1; index > 0; index--) {
            System.out.print(boolArray[index] + ", ");
        }
        System.out.print(boolArray[0]);
        System.out.println(" ");

        System.out.println("Задача 4");
        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] % 2 != 0) {
                intArray[index]++;
            }
        }
        System.out.print(Arrays.toString(intArray));
    }
}
