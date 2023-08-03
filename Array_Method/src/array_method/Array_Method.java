
package array_method;

import java.util.Arrays;
import java.util.Scanner;


public class Array_Method {

  
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        System.out.println("enter row number  ");
        int rowSize =sc.nextInt();
        
        System.out.println("enter col number  ");
        int colSize =sc.nextInt();
        
        int [][] matrix = new int[rowSize ][colSize ];
        
        for(int row=0; row<rowSize; row++){ //for loop row
            int total=0;
            for(int col=0; col<colSize; col++){
                
            matrix [row][col] = (int)(Math.random()*10);
             
            total +=   matrix [row][col];
                System.out.print(matrix [row][col]+"  ");
            } 
            
            System.out.println(" ");
            System.out.println(row+" row total number is "+total);
        }
    }
    
}
