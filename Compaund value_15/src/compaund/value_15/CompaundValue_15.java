
package compaund.value_15;

import java.util.Scanner;

public class CompaundValue_15 {

   
    public static void main(String[] args) {
        
        Scanner Save=new Scanner(System.in);
        
        System.out.println("Enter the monthly saving amount :");
        int monthlySaveP =Save.nextInt();
        
        System.out.println("Enter the Anual rate of interest :");
        double anualnterest= Save.nextDouble();
        
        System.out.println("Enter the months number :");
        int monthN=Save.nextInt();
        
        double monthlyInterestR = anualnterest/100/12;
        
        double totalValue= 0;
                
       for (int i = 1; i <= monthN; i++){
                double afterInterest = monthlySaveP * (1 + monthlyInterestR);
                totalValue += afterInterest; 
                
    }
        System.out.println("after "+monthN+" month the account value is :"+ totalValue);

}
    
}
