
package recursion_01;

import java.util.Scanner;

public class Recursion_01 {
  
    public static void main(String[] args) {
       
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a Number for Factonial ");
          
          int input=sc.nextInt();
          System.out.println("input is "+input+" factorial is "+recursion_factolial(input));        
        
    }    
    public static int recursion_factolial(int n){
    
        if(n==0){
        return 1;
        }
        else{        
        return n*recursion_factolial(n-1);
        }    
    }    
}
