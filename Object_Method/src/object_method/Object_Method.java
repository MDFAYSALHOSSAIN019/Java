
package object_method;

import java.awt.geom.Area;
import java.util.Scanner;
import method_New.Circle;


public class Object_Method {

   
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//        Object_Method oop=new Object_Method();
Circle oop=new Circle();

        oop.setRedius(-5);
        System.out.println(oop.area());
        System.out.println(oop.perimiter());
        
      
        
        
    }
    
}
