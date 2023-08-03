package countyear;

import java.util.Scanner;

public class CountYear {

    public static void main(String[] args) {

        Scanner time = new Scanner(System.in);
        System.out.println("Enter huge number of Minite :");

        int minut = time.nextInt();
        int remainderminut = minut % 60;
        
        int hour = minut / 60;        
        int remainderhour = hour % 24;

        int day = hour / 24;
        int remainderday = day % 30;

        int months = day / 30;
        int remaindermonths = months % 12;

        int years = months / 12;

        System.out.println(years + " :years");
        System.out.println(remaindermonths + " :months ");

        System.out.println(remainderday + " :day ");
        System.out.println(remainderhour + " :hour ");
        System.out.println(remainderminut + " :minut ");
    }

}
