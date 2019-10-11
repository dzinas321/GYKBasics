package lt.swedbank.gyk2019.tasks;

import java.util.Scanner;

public class Task2 {

    public static final String red = "\033[0;31m";

    public static final String reset = "\033[0m";

    public static void Circle() {
        boolean inputCheck = false;
        while (!inputCheck){
            System.out.print("Enter circle radius: ");
            Scanner circle = new Scanner(System.in);
            double radius = circle.nextDouble();
            if ((radius >= 0)&&( radius <= 1000))
            {
                double area = Math.PI*Math.pow(radius,2);
                double diameter =2*radius;
                double perimeter = Math.PI*diameter;
                System.out.println("Circle diameter is: " + diameter);
                System.out.println("Circle perimeter is: " + perimeter);
                System.out.println("Circle area is: " + area);
                inputCheck=true;
            }
            else System.out.println(red + "Wrong radius enter number between 0 and 1000!" + reset);
        }
    }
}
