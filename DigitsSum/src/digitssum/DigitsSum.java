                                                                                                                                                                                           
package digitssum;

import java.util.Scanner;


public class DigitsSum {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter your number between 0-1000 :");
        int input=sc.nextInt();
        
        if(input>0 && input<999){
                 
            int first=input/100; 
            int fir=input%100;
            
            int seceond=fir/10;
            int sec=fir%10;
            
            int thard=sec/1;
            int tha=input%1;
            
           int result=first+seceond+thard;
            System.out.println("The sum is :"+result);     
        }
        else{System.out.println("Value is too long"); }
    }
    
}
