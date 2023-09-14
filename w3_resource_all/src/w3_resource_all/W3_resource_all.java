
package w3_resource_all;

import java.util.Arrays;
import java.util.Scanner;


public class W3_resource_all {

    
    public static void main(String[] args) {
      
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a String");
        
        char[] latters=sc.nextLine().toCharArray();
        
//        System.out.println("Resersc string");
        int letter=0;
        int digit=0;
        int space=0;
        int other=0;
        
//        for (int read : latters) {
//            
//        }
        
        for (int i = latters.length-1; i >= 0; i--) {
            System.out.print(latters[i]);
            if(Character.isLetter(latters[i])){letter++;}
            else if(Character.isDigit(latters[i])){digit++;}
            else if(Character.isSpaceChar(latters[i])){space++;}
             else{other++;}
                    
                    
        }
        System.out.println("\nlatter is:"+letter);
        System.out.println("digit is:"+digit);
        System.out.println("space is:"+space);
        System.out.println("other is:"+other);
    }
    
}
