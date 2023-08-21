
package exceptionerror;

import java.util.Arrays;
import java.util.Scanner;


public class ExceptionError {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int [] array=new int[100];
        
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*100);
        }
        System.out.println("array "+Arrays.toString(array));
        System.out.println("Enter a index of array and your lucky ");
    }
    
}
