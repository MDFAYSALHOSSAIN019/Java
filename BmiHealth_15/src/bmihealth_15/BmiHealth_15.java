
package bmihealth_15;

import java.util.Scanner;


public class BmiHealth_15 {

   
public static void main(String[] args) {
        
//    BMI = weigth(kg) / math.pow(hiegth,2);
    
    Scanner health=new Scanner(System.in);
    System.out.println("Enter weigth in pound :");
    double weigthPound = health.nextDouble();
    
    System.out.println("Enter heigth in inches :");
    double heigthInches = health.nextDouble();
    
    double kilo= weigthPound * 0.45359237;
    double metter= heigthInches * 0.0254;
    
    double healthBmi = kilo / Math.pow(metter, 2);
      System.out.println("BMI is :"+healthBmi);  
        
        
    }
    
}
