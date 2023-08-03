package allquestionsolve;

import java.util.Scanner;

public class AllQuestionSolve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1..calculate-----------------------------
            int start=sc.nextInt();
            int end=sc.nextInt();
            for (int i=start; i<=end; i++){
                System.out.println(i);
               
            }
        
//        7..max, min, total, avarag----------------------------------

//        System.out.println("enter item number");
//        int itemnumber = sc.nextInt();
//        int number=itemnumber;
//        int max = 0;
//        int min = 999999999;
//        int total = 0;
//        int avarag = 0;
//
//        while (itemnumber > 0) {
//
//            System.out.println("enter your number");
//            int n = sc.nextInt();
//            total += n;
//            avarag = total + itemnumber;
//            if (max < n) {
//                max = n;
//            }
//            if (min > n) {
//                min = n;
//            }
//
//            itemnumber--;
//
//        }
//        avarag = total / number;
//        System.out.println("max number is " + max);
//        System.out.println("min number is " + min);
//        System.out.println("total number is " + total);
//        System.out.println("avarag number is " + avarag);

//            prime number---------------------------------------------------------------

        System.out.println("plese enter your number");
        int n=sc.nextInt();
        int count=0;
        for(int i=1; i<=n; i++){
            if(n % i == 1){
            count +=1;
            }
     
        }
           if(count==2){
            System.out.println("prime number");
        }
        else{System.out.println("not prime number");}
//          factorial numver -----------------------------------------------------------

//int input=sc.nextInt();
//int sum=1;
//for(int i=input; i>1; i--){
//for(int i=1; i<input+1; i++){
//    sum *=i;
//}
//System.out.println("total factorial numver "+sum);


    }

}
