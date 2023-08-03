
package metterfit_3;

import java.util.Scanner;


public class MetterFit_3 {

   
    public static void main(String[] args) {
        
        
        Scanner metter=new Scanner(System.in);
        
        System.out.println("Enter your value into Foot :");
        double foot=metter.nextDouble();
        
        double resultMetter=foot* 0.305;
        
        System.out.println("the input convert into Metter :"+resultMetter);
    }
    
}
