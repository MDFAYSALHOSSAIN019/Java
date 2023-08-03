
package futureinvest_21;

import java.util.Scanner;


public class FutureInvest_21 {

//   future value = present value * (1 + i)n-------------
    
    public static void main(String[] args) {
        Scanner invest = new Scanner (System.in);
        System.out.println("Enter inventment Amount :");
        double investments = invest.nextDouble();
        
        System.out.println("Enter the anual interest Rate :");
         double interestRate = invest.nextDouble();
         
        System.out.println("Enter the number of Years :");
         double years = invest.nextDouble();
         
         double futureValue = investments * (Math.pow((1 + interestRate/100), years));
        
        
        System.out.println("Future valus is :"+futureValue);
        
    }
    
}
