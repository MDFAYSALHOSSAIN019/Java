
package midexam;

import java.util.Arrays;
import java.util.Scanner;


public class MidExam {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
                                                                                                                                                                                                                                                                                                                                                                                                               
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Question no--6        
        int[][] myArray=new int[3][3];
        for (int i = 0; i <myArray.length ; i++) {
            for (int j = 0; j < myArray.length; j++) {
                myArray[i][j]=(int)(Math.random()*100);
            }
        }
//        int [][] myArray={{58, 82,62},{85,23,135},{89,45,81,6}};
        System.out.println("Orginal matrix   "+Arrays.deepToString(myArray));
        for (int k = 0; k < myArray.length; k++) {
            for (int row = 0; row < myArray.length; row++) {
                for (int col = 0; col < myArray.length-1; col++) {
                    
                  if(myArray[row][col] > myArray[row][col+1]){
                  int temp=myArray[row][col+1];
                  myArray[row][col+1]=myArray[row][col];
                  myArray[row][col]=temp;
                  
                  
                  }
                    
                    
                    
                    
                }
            }
        }
        System.out.println("");
        System.out.println(" matrix          "+Arrays.deepToString(myArray));
        
    }
    
}
