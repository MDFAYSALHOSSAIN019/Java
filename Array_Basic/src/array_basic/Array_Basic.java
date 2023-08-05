
package array_basic;

import java.util.Arrays;
import java.util.Scanner;


public class Array_Basic {

    
    public static void main(String[] args) {

        
//        String [] myArray=new String[5];
//        
//        myArray[0]="Faysal";
//        myArray[1]="Faysal";
//        myArray[2]="Faysal";
//        myArray[3]="Faysal";
//        myArray[4]="Faysal";
//        System.out.println(Arrays.toString(myArray));
//        
//        int[] newArray=new int[5];
//        
//        newArray[0]=50;
//        newArray[1]=40;
//        newArray[2]=90;
//        newArray[3]=30;
//        newArray[4]=80;
//        
//        System.out.println(Arrays.toString(newArray));
//        
//        for (int i=0; i<myArray.length; i++){
//            System.out.println(myArray[i]+" "+newArray[i]);
//                    
//        }
//        for(int newName:myArray){
//            System.out.println(newName);
//        }

        Scanner sc =new Scanner (System.in);
        System.out.println("Enter array row number");
        int row= sc.nextInt();
        System.out.println("Enter array col number");
        int col= sc.nextInt();


         int[][] name=new int[row][col];

        int   max=0;
        int   min=99999999;
        int   total=0;
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                name[i][j]=(int)(Math.random()*100);
                total += name[i][j];
                if(max<name[i][j]){max=name[i][j];}
                if(min>name[i][j]){min=name[i][j];}
            }
             System.out.println(Arrays.deepToString(name));
             System.out.println("Total number is   "+total);
             System.out.println("max number is   "+max);
             System.out.println("min number is   "+min);
             System.out.println("\n");
        }
                System.out.println(Arrays.deepToString(name));
                System.out.println("Total number is   "+total);
               
        




    }
    
}
