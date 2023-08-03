
package lottery;

import java.util.Scanner;


public class Lottery {

   
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        int guessnumber=(int)(Math.random()*10);
//        System.out.println("guessnumber :"+guessnumber);
        System.out.println("Plese Enter the guess number :");
       
        for(int i=1; i<=5; i++){
        int input=sc.nextInt();
            if(input<10 ){
            
                if(guessnumber == input){
                    System.out.println("You are Win $1000");
                    break;
                }
                  if(i>4){
                System.out.println("Good luck try next time. your ans is :"+guessnumber);
               }
                else{
                    System.out.println("Plese Enter the guess number again:");
                }
               
            }
            else{
                System.out.println("invalid The number is longer ");
            }
        
         
        }
       
       
        
    }
    
}
