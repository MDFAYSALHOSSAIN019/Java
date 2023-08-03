package range;

import java.util.Scanner;

public class RangePrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        
System.out.println("prime number is");
        for (int i = start; i <= end; i++) {
            int count = 0;
            for (long j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count ++;
                }                
            }
            if(count==2) {                
                    System.out.println(i);
                }
//            else{System.out.println(i);}
        }

    }
}
