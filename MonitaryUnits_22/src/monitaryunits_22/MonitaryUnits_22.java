
package monitaryunits_22;

import java.util.Scanner;

public class MonitaryUnits_22 {

    
    public static void main(String[] args) {
        Scanner twoDigets=new Scanner(System.in);
        
        System.out.println("Enter the number :");
        int value = twoDigets.nextInt();
        
        if(value>0 && value<10000){
        int dollars=value/100;
        int cents = value %100;
        
            System.out.println("Dollars :"+dollars);
            System.out.println("cents :"+cents);
        
        }
        else{
            System.out.println("Number is Invalid");
        }
        
    }
    
}
