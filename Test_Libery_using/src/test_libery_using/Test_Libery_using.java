package test_libery_using;

import java.util.Scanner;

public class Test_Libery_using {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number +880-018-64898071");
       String convert=sc.next();
       
       String firstsubstring=convert.substring(0, 3);
        String secondsubstring=convert.substring(3);
        
        System.out.println("+880-"+firstsubstring+"-"+secondsubstring);

int n=5;
n=10;
        System.out.println(n);
        
    }

}
