
package mainproject;

import java.util.Scanner;
import pak.DoMath;
import pak.Fibonakki;


public class MainProject {

    
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
//        DoMath math=new DoMath();
        Fibonakki math=new Fibonakki();
        
        System.out.println("Enter Your Number");
        int input =sc.nextInt();        
        
        System.out.println(math.fibo(input));
    }
    
}
