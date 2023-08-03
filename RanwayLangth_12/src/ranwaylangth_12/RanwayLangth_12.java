
package ranwaylangth_12;

import java.util.Scanner;


public class RanwayLangth_12 {

    
    public static void main(String[] args) {
        
        Scanner ranway=new Scanner (System.in);
        System.out.println(" ENTER THE  TAKE OFF SPEED :");
        double speed=ranway.nextDouble();
        
        System.out.println(" ENTER THE palne acceleration :");
        double acceleration=ranway.nextDouble();
        
        double ranwayLangth=(speed * speed)/ (2*acceleration);
        
        System.out.println(" the  minimume runway length for this airplane :"+ranwayLangth);
        
    }
    
}
