
package faysal;

import java.util.Scanner;


public class Fibonakki {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
//        fibonakki 0 1 1 2 3 5 8 13 21....................

       
        int n1=0;
        int n2=1;
        int sum=0;
        int input=sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for(int i=1; i<=input-2; i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            System.out.println(sum);
        }
        
    }
}
