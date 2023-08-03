
package anualintarest_20;

import java.util.Scanner;


public class AnualIntarest_20 {

    
    public static void main(String[] args) {
       
        Scanner interest = new Scanner (System.in);
        System.out.println("Enter the balance :");
        double balance = interest.nextDouble();
        
        System.out.println("Enter the Anual interest Rate :");
        double anualRate = interest.nextDouble();
        
        double interestRate = balance * (anualRate/1200);
        System.out.println("The interest rate is :"+interestRate);
    }
    
}
