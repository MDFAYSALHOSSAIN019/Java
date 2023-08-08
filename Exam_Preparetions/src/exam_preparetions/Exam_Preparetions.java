
package exam_preparetions;

import java.util.Scanner;
import sub_method.Price;


public class Exam_Preparetions {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Price price=new Price();
        
        System.out.println("pls enter product Quentity ");
        int quentity=sc.nextInt();
        System.out.println("pls enter product Unite price ");
        double unitPrice=sc.nextInt();
        
//        System.out.println("pls enter product Discount rate ");
        
        
        price.setQuentity(quentity);
        price.setUnit_price(unitPrice);
        
        double totalPrice=price.calculateTotalPrice();
        double afterDis=0.0;
        double dis=0.0;
        if(totalPrice<500){ 
            dis=totalPrice*0.05;
            afterDis=totalPrice-dis;}
        else if(totalPrice<1000){
            
            dis=totalPrice*0.1;
            afterDis=totalPrice-dis;}
                else{
            dis=totalPrice*0.2;
            afterDis=totalPrice-dis;}
        
        System.out.println("Total price                  "+totalPrice);
        System.out.println("Total discount               -"+dis);
        System.out.println("___________________________________________");
        System.out.println("Total price after discount   "+afterDis);
    }
    
}
