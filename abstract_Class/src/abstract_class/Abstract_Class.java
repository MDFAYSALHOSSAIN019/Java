
package abstract_class;

import geomat.Circle;
import geomat.Geomatric;
import geomat.Ractingle;
import java.util.Scanner;


public class Abstract_Class {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Circle");
        double redius=sc.nextDouble();
        
        System.out.println("enter hight ");
        double hight=sc.nextDouble();
        System.out.println("enter wieght ");
        double wieght=sc.nextDouble();
        
        Geomatric circle=new Circle(redius);
        Geomatric rectangle=new Ractingle(hight, wieght);
       
        System.out.println(circle.getArea()+"   |  "+circle.getperemeter());
        System.out.println("");
        System.out.println(rectangle.getArea()+"   |  "+rectangle.getperemeter());
       
   
        
    }
    
}
