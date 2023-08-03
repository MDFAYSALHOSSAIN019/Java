
package kilogrampound_4;

import java.util.Scanner;


public class KilogramPound_4 {

  
    public static void main(String[] args) {
        
        
        Scanner kilo=new Scanner(System.in);
        System.out.println("Enter your value in Pounds :");
        double pound=kilo.nextDouble();
        
        double result=pound *0.454;
        System.out.println("the output into kilogram :"+result);
    }
    
}
