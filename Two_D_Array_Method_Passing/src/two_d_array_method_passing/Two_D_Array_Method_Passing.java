
package two_d_array_method_passing;

import java.util.Arrays;
import java.util.Scanner;


public class Two_D_Array_Method_Passing {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       Method_array newObject=new Method_array();
        
        System.out.println("enter row number ");
                int rowInput=sc.nextInt();
        System.out.println("enter column number ");
                int columnInput=sc.nextInt();
                
                
                int total=0;
                int [][] myArray=new int [rowInput][columnInput];
               
                for (int row = 0; row < myArray.length; row++) {
                    for (int col = 0; col < myArray[row].length; col++) {
                        myArray[row][col]=(int)(Math.random()*100);
                        total +=myArray[row][col];
                       
                    }
                    System.out.println(myArray[][]);
        }
              System.out.println("Total "+total);
             
    }
    
}
