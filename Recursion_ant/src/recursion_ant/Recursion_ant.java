
package recursion_ant;


import java.util.Arrays;


public class Recursion_ant {

  
    public static void main(String[] args) {
       
        
        int[] array=new int [10];
        for (int i = 0; i <array.length; i++) {
            array[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(array));
    }
    
}
