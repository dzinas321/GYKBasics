package lt.swedbank.gyk2019.tasks;

import java.util.Scanner;

public class Task6 {
    public static final String red = "\033[0;31m";

    public static final String reset = "\033[0m";

    public static void Time()
    {
        int second = 0;
        int tempSecond = 0;
        int day;
        int hour;
        int minute;
        Scanner seconds = new Scanner(System.in);
        System.out.print("Please enter seconds: ");
        second = seconds.nextInt();
        boolean inputCheck = false;
        while (!inputCheck) {
                if((second >= 0) && (second <= 100000)){
                    inputCheck = true;
                    day = second / 24 / 60 / 60;
                    hour = (second - (day * 24 * 60 * 60)) / 60 /60;
                    minute = (second - (hour * 60 *60)-(day * 24 * 60 * 60))/60;
                    tempSecond = second - ((day * 24 * 60 * 60)+(hour * 60 *60)+(minute*60));
                    System.out.println("Days: " + day);
                    System.out.println("Hours: " + hour);
                    System.out.println("Minutes: " + minute);
                    System.out.println("Seconds: " + tempSecond);
                }
                else {
                    System.out.println(red + "Time should be between 0 and 100000, please write correct grade!" + reset);
                    System.out.print("Please enter seconds: ");
                    second = seconds.nextInt();
                }
        }
    }
}
