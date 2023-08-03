package circlearea_2;

import java.util.Scanner;

public class CircleArea_2 {

    public static void main(String[] args) {

        Scanner circle = new Scanner(System.in);

        System.out.println("Enter the radius of any circle :");

        double radious = circle.nextDouble();
        final double PI = 3.1416;
        double area = radious * radious * PI;

        System.out.println("THE CIRCLE AREA IS :" + area);

        System.out.println("Enter the length of any object :");
        double length = circle.nextDouble();

        double volume = area * length;
           System.out.println("The volums is :"+volume);
    }

}
