package lt.swedbank.gyk2019.tasks;

import java.util.Scanner;

public class Task3 {
    public static final String red = "\033[0;31m";

    public static final String reset = "\033[0m";

    public static void Student()
    {
        double grade[] = new double[3];
        String name[] = {"first","second","third"};
        double average = 0;
        Scanner student = new Scanner(System.in);
           for (int i = 0; i <= 2; i++) {
               boolean inputCheck = false;
               System.out.print("Please enter " + name[i] + " grade: ");
                grade[i] = student.nextDouble();
                while (!inputCheck) {
                    if((grade[i] >= 0) && (grade[i] <= 10)){
                        inputCheck = true;
                        average += grade[i];
                    }
                    else {
                        System.out.println(red + "Grade should be between 0 and 10, please write correct grade!" + reset);
                        System.out.print("Please enter " + name[i] + " grade: ");
                        grade[i] = student.nextDouble();
                    }
                }
           }
        System.out.println("Average of student grades: "+ average/grade.length);
    }
}
