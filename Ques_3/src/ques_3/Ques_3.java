
package ques_3;

import java.util.Scanner;
import vihicle.Truck;
import vihicle.Vahicle;



public class Ques_3 {

    
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner (System.in);
        Vahicle vac=new Vahicle();
        Truck truck=new Truck();
        
       truck.setRegularPrice(20000);
       truck.setWeight(2500);
       
       
        System.out.println(truck.getGetSalsePrice());
        
    }
    
}
