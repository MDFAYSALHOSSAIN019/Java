
package ques_2;


public class Ques_2 {

 
    public static void main(String[] args) {
      
        int input =5;
        int sum =1;        
        for (int i = input; i >1; i--) {           
            sum *=i;            
        }        
        System.out.println("Factorial number is "+sum);
    }
    
}
