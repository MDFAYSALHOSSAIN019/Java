
package array_basic;

import java.util.Arrays;


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
System.out.println("enter array ");
int[] name=new int[10];
        System.out.println("enter your array number");
//int name[]={52,62,50,92,85,589,2};
int   max=0;
int   min=99999999;
int   total=0;

for (int i=0; i<name.length; i++){
    name[i]=(int)(Math.random()*100);
    total +=name[i];
    if(max<name[i]){max=name[i];}
    if(min>name[i]){min=name[i];}
    }
//for(int number = name[]){
//max= number > max ? number : max;
//}
System.out.println(Arrays.toString(name));
        System.out.println("Max   number is   "+max);
        System.out.println("Min   number is   "+min);
        System.out.println("Total number is   "+total);
        


//for(int number :name){   
//        name[number]=(int)(Math.random()*100);
//     System.out.print(number);
//}

    }
    
}
