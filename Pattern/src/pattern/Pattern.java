
package pattern;

import java.util.Scanner;


public class Pattern {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
            int n=sc.nextInt();
            
//      ---------incrising pattern----------------------
//            for(int i=1; i<=n; i++){
//                for (int j=1; j<=i;j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        ------------decresing pattern------------
//        for(int i=1; i<=n; i++){
//            for (int j=i; j<=n; j++){
//                System.out.print("@");
//            }
//            System.out.println();        
//        }
        
//        --------Right Sided Triangle-----------
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=i; j++){
            
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
