package windcilltempareture_17;

import java.util.Scanner;

public class WindCillTempareture_17 {

    public static void main(String[] args) {
        Scanner wind = new Scanner(System.in);

        System.out.println("Enter the temparature in Fahrenheit between -58*F and 41*F :");
        double tempareture = wind.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour:");
        double speed = wind.nextDouble();

        double result = 35.74 + (0.06215 * speed) - (35.75 * (Math.pow(tempareture, 0.16))) + (0.4275 * speed * (Math.pow(tempareture, 0.16)));

        System.out.println("The wind chill index is :" + result);
    }

}
