
package exphandaling;

import java.util.Arrays;
import java.util.Scanner;


public class ExpHandaling {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arrays=new int[100];
        
        for (int i = 0; i < arrays.length; i++) {
            arrays[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println("Enter a index number and show your number ");
        int index=sc.nextInt();
        
        try{
            
        int value=arrays[index];
            System.out.println("index is "+index+" value is : "+value);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
    }
    
}
