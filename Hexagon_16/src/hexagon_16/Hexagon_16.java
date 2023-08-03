
package hexagon_16;

import java.util.Scanner;


public class Hexagon_16 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the side :");
        double side = sc.nextDouble();
        
        double area = ((3*Math.sqrt(3))/2)*Math.pow(side, 2);
        System.out.println("The area of the hexagon is :"+area);
        
    }
    
}
