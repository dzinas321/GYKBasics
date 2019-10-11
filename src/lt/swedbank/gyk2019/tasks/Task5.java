package lt.swedbank.gyk2019.tasks;

import java.util.Scanner;

public class Task5 {
    public static final String red = "\033[0;31m";

    public static final String reset = "\033[0m";

    public static void Split() {
        int number = 0;
        int tempNumber = 0;
        int sum = 0;
        int multiplication = 1;
        boolean inputCheck = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextInt();
        while (!inputCheck){
            if((number>=0)&&(number<=999))
            {
                inputCheck = true;
            }
            else {
                System.out.print(red + "Number must be between 0 and 999! Enter once more: " + reset);
                number = input.nextInt();
            }
        }
            while (number > 0) {
                tempNumber = number % 10;
                number /= 10;
                sum += tempNumber;
                multiplication *= tempNumber;
            }
        System.out.println("Sum of entered number digits is: " + sum);
        System.out.println("Multiplication of entered number digits is: " + multiplication);
    }
}
