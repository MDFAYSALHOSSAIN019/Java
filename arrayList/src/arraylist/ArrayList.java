package arraylist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayList {

    public static void main(String[] args) {

//       ArrayList<Integer> arrayList=
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Enter an intiger : ");
                int number = input.nextInt();
//                String number = input.next();
                System.out.println("The number entered is " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again.( " + 
                        "Incorrect input : an integer is requried)");
                input.nextInt();
            }
        } while (continueInput);

    }

}
