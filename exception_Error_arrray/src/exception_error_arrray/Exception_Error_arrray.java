package exception_error_arrray;

import java.util.Arrays;
import java.util.Scanner;

public class Exception_Error_arrray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("array is " + Arrays.toString(array));

        System.out.println("Enter a array Index number and Show your Lucky Number");
        int index = sc.nextInt();
        try {
            int element = array [index];
            System.out.println("Element at index " + index + " is: " + element);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex+" Out of Bound");
        }
    }
}
