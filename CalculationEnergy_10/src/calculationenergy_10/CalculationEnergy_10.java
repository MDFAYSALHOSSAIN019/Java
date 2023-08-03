
package calculationenergy_10;

import java.util.Scanner;


public class CalculationEnergy_10 {

    public static void main(String[] args) {
       
        Scanner enargy=new Scanner(System.in);
        
          System.out.println(" enter the amonut of water in kilogram :");
        double M=enargy.nextDouble();
        
        System.out.println(" enter the initial Temparature :");
        double initialtempareture=enargy.nextDouble();
        
        System.out.println(" enter the final Temparature :");
        double finaltempareture=enargy.nextDouble();
        
        double result=M * (finaltempareture  - initialtempareture ) * 4184;
         System.out.println(" The avarage ACCELERATION "+result);
    }
    
}
