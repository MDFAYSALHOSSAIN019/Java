
package two_d_array_method_passing;

public class Method_array {
 
    public int doSum(int array[][]){
    int total=0;
        for (int row = 0; row <array.length; row++) {
            
            for (int column = 0; column <array[row].length; column++) {
                total= total+array[row][column];
            }
        }
    
    return total;
    }
}
