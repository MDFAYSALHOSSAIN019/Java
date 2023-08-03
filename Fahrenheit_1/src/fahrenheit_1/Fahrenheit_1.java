
package fahrenheit_1;

import java.util.Scanner;


public class Fahrenheit_1 {

 
    public static void main(String[] args) {
      
        Scanner degree=new Scanner(System.in);
        
        System.out.println("Enter a degree in Celsious :");
        
        int celcias=degree.nextInt();
        
        double farhanheit=celcias*9/5+32;
        
        System.out.println("Your Result is(fahrenheit) :"+farhanheit);
        
    }
    
}
