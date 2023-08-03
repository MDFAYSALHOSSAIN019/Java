
package physicsacceleration_9;

import java.util.Scanner;


public class PhysicsAcceleration_9 {

   
    public static void main(String[] args) {

        
        Scanner acceleration=new Scanner(System.in);
        
        System.out.println(" enter your 1st ACCELERATION");
        double v1=acceleration.nextDouble();
        
        System.out.println(" enter your 2nd ACCELERATION");
        double v0=acceleration.nextDouble();
        
        System.out.println(" enter your time ACCELERATION");
        double t=acceleration.nextDouble();
        
        double a=(v1 - v0)/t;
         System.out.println(" The avarage ACCELERATION "+a);
    }
    
}
