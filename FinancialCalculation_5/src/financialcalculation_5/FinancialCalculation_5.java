
package financialcalculation_5;

import java.util.Scanner;

public class FinancialCalculation_5 {

  
    public static void main(String[] args) {
       
        Scanner tax=new Scanner(System.in);
        System.out.println("Enter the parchase value :");
        int parchase=tax.nextInt();
        System.out.println("Enter the tax rate :");
        int taxrate=tax.nextInt();
        double rate=parchase*taxrate/100;
        
        double total=parchase + rate;
        
        System.out.println("total parchase value after tax "+total);
    }
    
}
