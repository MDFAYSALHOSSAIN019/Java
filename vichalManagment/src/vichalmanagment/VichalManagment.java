
package vichalmanagment;

import vichal.Car;
import vichal.MotorCycle;
import vichal.Vehicle_Class;

public class VichalManagment {

 
    public static void main(String[] args) {
        
        Vehicle_Class car=new Car();
        Vehicle_Class motor=new MotorCycle();
        
        
        System.out.println("Car Driver Say............");
        car.start();
        car.Stop();
        System.out.println(" ");
        System.out.println("MotorCycle Driver Say ................");
        motor.start();
        motor.Stop();
        
    }
    
}
