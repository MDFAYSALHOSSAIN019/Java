
package usdollar;

import java.util.Scanner;


public class UsDollar {

 
    public static void main(String[] args) {
   
        Scanner sc=new Scanner(System.in);
        
//        In the United States, these coins have following values:
//        1 Quarter = 25 cents
//        1 Dime    = 10 cents
//        1 Nickel  =  5 cents
//        1 Penny   =  1 cent

//        1 step: At first we sent a massage to users for collect number.
        System.out.println("Enter an amount in double : ");
        
//        2 step: Then we collect a double number from user.
        double amount = sc.nextDouble();
        
//        3 step: Then we declare a new Variable that will convert the number 
//                into Cents that user gives it. And it will  store itself to
//                covert his datatype into integer.                  
        int reserveCents = (int)(amount * 100);
        
//        4 step: Then WE convert the reserve Cents into Dollars divided 100.
//                And then we calculate how many Cents are remaining 
//                by % 100 and it reserve itself.
        int ConvertDollars = reserveCents /100;
        reserveCents = reserveCents % 100;
                
//       5 step: Then WE convert the reserve Cents into Quarters divided 25.
//               And then we calculate how many Cents are remaining 
//               by % 25 and it reserve itself.
        int ConvertQuarters = reserveCents /25;      
        reserveCents = reserveCents % 25;  
         
        
//       6 step: Then WE convert the reserve Cents into Dimes divided 10.
////             And then we calculate how many Cents are remaining 
////             by % 10 and it reserve itself.
        int ConvertDimes = reserveCents /10;      
        reserveCents = reserveCents % 10;  
         
        
        
//      7 step: Then WE convert the reserve Cents into Nickel divided 5.
////            And then we calculate how many Cents are remaining 
////            by % 5 and it reserve itself.
        int ConvertNickel= reserveCents /5;      
        reserveCents = reserveCents % 5; 
        
//      8 step: Then WE convert the reserve Cents into Penny divided 1.
////            And then we calculate how many Cents are remaining 
////            by % 1 and it reserve itself.
        int ConvertPenny= reserveCents /1;      
        reserveCents = reserveCents % 1;
         
//        9 step: We print All the calculations serially 
//                that we already calculate before.
        System.out.println("Your amonut "+amount+" Consists of");
        System.out.println("    "+ConvertDollars+" Dollars");
        System.out.println("    "+ConvertQuarters+" Quarters");
        System.out.println("    "+ConvertDimes+" Dimes");
        System.out.println("    "+ConvertNickel+" Nickels");
        System.out.println("    "+ConvertPenny+" Pennies");
        
//        10 step: At last we testing our project by deffierent way
//                to check it can work properly.
    }
    
}
