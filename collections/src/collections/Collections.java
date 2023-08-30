
package collections;

import java.util.ArrayList;


public class Collections {

   
    public static void main(String[] args) {
        
        
        ArrayList<Employees> employes= new ArrayList<Employees>();
        
        employes.add(new Employees(1, "Faysal", "Dhaka", "01864838071"));
        employes.add(new Employees(1, "Robiul ISlam", "MohammadPur", "0198574521"));
        
        System.out.println(employes);
    }
    
}
