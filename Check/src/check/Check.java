/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

import java.util.Scanner;

public class Check {

    public static void main(String[] args) {

//        Math.ceil(2.1) returns 4.0
//Math.ceil(2.0) returns 2.0
//Math.ceil(-2.0) returns -2.0
//Math.ceil(-2.1) returns -2.0
//Math.floor(2.1) returns 2.0
//Math.floor(2.0) returns 2.0
//Math.floor(-2.0) returns –2.0
//Math.floor(-2.1) returns -4.0
//Math.rint(2.1) returns 2.0
//Math.rint(-2.0) returns –2.0
//Math.rint(-2.1) returns -2.0
//Math.rint(2.5) returns 2.0
//Math.rint(4.5) returns 4.0
//Math.rint(-2.5) returns -2.0
//Math.round(2.6f) returns 3 // Returns int
//Math.round(2.0) returns 2 // Returns long
//Math.round(-2.0f) returns -2 // Returns int
//Math.round(-2.6) returns -3 // Returns long
//Math.round(-2.4) returns -2 // Returns long
//        
//char letter ='A';
//char letter ='\u0050';
//System.out.println(cha);
//char ch = 'a';
//for (int i=1; i<=26; i++){
//System.out.println(ch++);
//}
//System.out.println(++ch);
//
//        System.out.println(letter);
//String massage="Wellcome to java";
//
//        System.out.println(massage.substring(12));
        Scanner sc = new Scanner(System.in);
//       int input=sc.nextInt();
//		for(int i=1; i<=input; i++){
////                    System.out.print("@");
//                    for(int j=1; j<=i ;j++){
////                         for(int j=i; j<=input ;j++){
//                        System.out.print("*");
//                        
//                    }
//                    System.out.println();
//                  
//                    
//                }
//	
//String string="faysal";
//char cha='A';
//int dcmal=1864898071;
//double dec=4.75;
//
//        System.out.println("I am %s hossain. I got %c in ssc exam. my cell numver is %d . ",,char,int);

//int input = sc.nextInt();
//int sum = 0;
//while (input !=0){System.out.println(sum); sum+=input;}
//        int max = 0;
//        int min = 9999999;
//        int avarage = 0;
//        int total = 0;
//
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("please Enter your number " + i);
//            int input = sc.nextInt();
//            total += input;
//
//            if (max < input) {
//                max = input;
//
//            } 
//            else if (min > input) {
//                min = input;
//            }
//        }
//
//        avarage = total / 3;
//
//        System.out.println("max number " + max + " min number " + min + " total value " + total + " avarage number " + avarage);

int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
int max=0;
int min=0;

if (n1>n2 && n1>n3){
   max=n1;    
}
else if(n2>n1 && n2>n3){
 max=n2;
}
else{
max=n3;
}
if(n1<n2 && n1<n3){
    min=n1;
}
else if(n2<n1 && n2<n3){
min=n2;
}
else{min=n3;}

int total=n1+n2+n3;
int avarag=total/3;
        System.out.println("max number "+max);
        System.out.println("min number "+min);
        System.out.println("total number "+total);
        System.out.println("avarag number "+avarag);

    }

}
