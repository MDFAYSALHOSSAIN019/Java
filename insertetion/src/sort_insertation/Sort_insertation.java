
package sort_insertation;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_insertation {

   
       




////  (1)***  Insertation Sort using forLoop  ******************************
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter arrays index number ");
        int index = sc.nextInt();
        int[] arrays = new int[index];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 100);
        }
        System.out.println("orginal array is " + Arrays.toString(arrays));


        for (int i = 1; i < arrays.length; i++) {
            int temp = arrays[i];
            int j = i - 1;
            for (int k = 1; k < arrays.length - 1; k++) {
                if (j >= 0 && arrays[j] > temp) {
                    arrays[j + 1] = arrays[j];
                    j = j - 1;
                }
                arrays[j + 1] = temp;
            }
        }
         System.out.println("Sorted arrays is " + Arrays.toString(arrays));
    }
        
        
//    (2)***  inserttation sort using while***********************
//     public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter arrays index number ");
//        int index = sc.nextInt();
//        int[] arrays = new int[index];
//
//        for (int i = 0; i < arrays.length; i++) {
//            arrays[i] = (int) (Math.random() * 100);
//        }
//        System.out.println("orginal array is " + Arrays.toString(arrays));
//        for (int i = 1; i < arrays.length; i++) {
//            int temp = arrays[i];
//            int j = i - 1;
//            while (j >= 0 && arrays[j] > temp) {
//                arrays[j + 1] = arrays[j];
//                j = j - 1;
//            }
//            arrays[j + 1] = temp;
//        }
//        System.out.println("Sorted arrays is " + Arrays.toString(arrays));
//    }

//    (3)*** Insertition sort using method+for+while Loop*********************
//    public static void main(String[] args) {
//       Sort_insertation obj=new Sort_insertation();
//        int[] arrays = {7, -5, 3, 2, 1, 0, 45};        
//        System.out.println("orginal arrays");
//        System.out.println(Arrays.toString(arrays));
//        obj.arraysMethod(arrays);
//        System.out.println("Sorted Array");
//        System.out.println(Arrays.toString(arrays));
//    }
//
//    void arraysMethod(int[] newArray) {
//
//        for (int i = 1; i < newArray.length; i++) {
//            int temp = newArray[i];
//               int j = i-1;
//          while(j>=0 && newArray[j]>temp)
//          {
//              newArray[j+1] = newArray[j];
//          
//          j=j-1;
//          }
//        newArray[j+1] = temp;//                }
//
//    }
    
//      (4)*** BOOBLE sort using method+for+while Loop*********************-
    
    //    public static void main(String[] args) {
//        int [] arrays={7, 52,36,156,-657,966,-5, 3, 2, 1, 0, 45};
//        System.out.println("orginal arrays "+Arrays.toString(arrays));
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays.length-1; j++) {
//                if(arrays[j]>arrays[j+1]){
//                int temp = arrays[j];
//                arrays[j] = arrays[j+1];
//                arrays[j+1]=temp;
//                }//                
//            }//          
//        }
//          System.out.println("Sort arrays is "+Arrays.toString(arrays));
//    }
}
    
    

