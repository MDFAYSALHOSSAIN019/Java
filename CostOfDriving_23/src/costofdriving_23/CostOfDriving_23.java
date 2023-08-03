
package costofdriving_23;

import java.util.Scanner;


public class CostOfDriving_23 {

    public static void main(String[] args) {
       
        Scanner  cost=new Scanner (System.in);
        
        System.out.println("Enter the driving distance :");
        double distance = cost.nextDouble();
        
        System.out.println("Enter miles per gallon :");
        double milesPerGallon= cost.nextDouble();
        
        System.out.println("Enter cost per gallon :");
        double pricePerGallon= cost.nextDouble();
        
        double totalGallon= distance / milesPerGallon;
        System.out.println("total gallon is :"+totalGallon);
        
        double totalCost= totalGallon *  pricePerGallon;
        
        System.out.println("The cost of driving is :"+totalCost);
        
    }
    
}
