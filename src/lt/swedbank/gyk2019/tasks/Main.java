package lt.swedbank.gyk2019.tasks;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean checkInput = false;
        int selection;
        String question;
        System.out.println("Hello, please chose which task to run:");
        while(!checkInput){
            System.out.println("Task2 - 2;");
            System.out.println("Task3 - 3;");
            System.out.println("Task4 - 4;");
            System.out.println("Task5 - 5;");
            System.out.println("Task5 - 6.");
            Scanner input = new Scanner(System.in);
            System.out.print("Your selection: ");
            selection = input.nextInt();
            switch (selection){
                case 2:{
                    Task2.Circle();
                    System.out.println("Do you want to select other task (Y/N)?");
                    System.out.print("Selection :");
                    question = input.next();
                    if(question.equalsIgnoreCase("y")){
                        continue;
                    }
                    if(question.equalsIgnoreCase("n")){
                        checkInput = true;
                        System.out.println("Bye!");
                        break;
                    }
                }
                case 3:{
                    Task3.Student();
                    System.out.println("Do you want to select other task (Y/N)?");
                    System.out.print("Selection :");
                    question = input.next();
                    if(question.equalsIgnoreCase("y")){
                        continue;
                    }
                    if(question.equalsIgnoreCase("n")){
                        checkInput = true;
                        System.out.println("Bye!");
                        break;
                    }
                }
                case 4:{
                    Task4.Rectangle();
                    System.out.println("Do you want to select other task (Y/N)?");
                    System.out.print("Selection :");
                    question = input.next();
                    if(question.equalsIgnoreCase("y")){
                        continue;
                    }
                    if(question.equalsIgnoreCase("n")){
                        checkInput = true;
                        System.out.println("Bye!");
                        break;
                    }
                }
                case 5:{
                    Task5.Split();
                    System.out.println("Do you want to select other task (Y/N)?");
                    System.out.print("Selection :");
                    question = input.next();
                    if(question.equalsIgnoreCase("y")){
                        continue;
                    }
                    if(question.equalsIgnoreCase("n")){
                        checkInput = true;
                        System.out.println("Bye!");
                        break;
                    }
                }
                case 6:{
                    Task6.Time();
                    System.out.println("Do you want to select other task (Y/N)?");
                    System.out.print("Selection :");
                    question = input.next();
                    if(question.equalsIgnoreCase("y")){
                        continue;
                    }
                    if(question.equalsIgnoreCase("n")){
                        checkInput = true;
                        System.out.println("Bye!");
                        break;
                    }
                }
            }
        }
    }
}
