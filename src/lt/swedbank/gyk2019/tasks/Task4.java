package lt.swedbank.gyk2019.tasks;

import java.util.Scanner;

public class Task4 {

    public static final String red = "\033[0;31m";

    public static final String reset = "\033[0m";

    public static void Rectangle() {

        boolean inputCheck = false;
        double length = 0;
        double width = 0;

        Scanner rectangle = new Scanner(System.in);
        System.out.print("Enter rectangle length: ");
        length = rectangle.nextDouble();

        while (!inputCheck)
        {
            if((length >= 0)&&( length <= 1000)){
                inputCheck = true;
            }
            else {
                System.out.println(red + "Wrong length! Enter number between 0 and 1000!" + reset);
                System.out.print("Enter rectangle length: ");
                length = rectangle.nextDouble();
            }
        }

        inputCheck = false;
        System.out.print("Enter rectangle width: ");
        width = rectangle.nextDouble();

        while (!inputCheck)
        {
            if((width >= 0)&&( width <= 1000)){
                inputCheck = true;
            }
            else {
                System.out.println(red + "Wrong width! Enter number between 0 and 1000!" + reset);
                System.out.print("Enter rectangle width: ");
                width = rectangle.nextDouble();
            }
        }
        System.out.println("Rectangle length and width are: " + length + ", "+ width );
        System.out.println("Rectangle perimeter is: " + ((2*length)+(2*width)));
        System.out.println("Area perimeter is: " + length*width);
    }
}
