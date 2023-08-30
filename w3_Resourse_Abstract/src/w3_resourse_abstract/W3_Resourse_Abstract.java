package w3_resourse_abstract;

import java.util.Arrays;
import java.util.Scanner;

public class W3_Resourse_Abstract {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a arrays index number ");
        int input = sc.nextInt();

        int[] arrays = new int[input];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 100);
        }
        System.out.println("Orginal arrays is "+Arrays.toString(arrays));
        
        
        
        
//                    BOBLE SORT ******************************
        
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays.length-1; j++) {
//               if(arrays[j]>arrays[j+1]){
//               int temp=arrays[j+1];
//               arrays[j+1]=arrays[j];
//               arrays[j]=temp;
//               } 
//            }
//        }

//            INSERTION SORT ****************************************

        for (int i = 1; i <arrays.length; i++) {
            int temp=arrays[i];
            int j= i-1;
            
            while(j>=0 && arrays[j]>temp){
            
           arrays[j+1]= arrays[j];
           
           j=j-1;
            
            
            
            }
            arrays[j+1]=temp;
        }



        System.out.println("assind arrays is  "+Arrays.toString(arrays));
    }

}
