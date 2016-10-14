package zoo;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Created by andrewlewis on 10/13/16.
 */
public class TimeClockMenu {
    public static ArrayList<String> employees = new ArrayList<>();
    public void timeClock(){
        Menu menu = new Menu();
        int timeClock;
        String name;
        Scanner input = new Scanner(System.in);

// This is the Time-Clock Menu. This will direct the user to the following Switch statement based upon the users input.

        try {
            System.out.println("Welcome to the Employee Sub-MENU \n");
            System.out.println("\n");
            System.out.println("1. Clock-In");
            System.out.println("2. Clock-Out");
            System.out.println("3. View Employees Clocked-In");
            System.out.println("4. Return to Employee Menu");
            timeClock = input.nextInt();

// The following Switch statement will Add/Remove/Show Employees, or Return the user to the Employee Menu based upon the users input. The user will then be directed to the appropriate menu.

            switch (timeClock) {
                case 1:
                    System.out.println("To Clock-In please enter your name:");
                    name = input.nextLine();
                    name = input.nextLine();
                    System.out.println(name + ", Successfully Clocked-In.");
                    employees.add(name);
                    timeClock();
                    break;
                case 2:
                    System.out.println("To Clock-Out please enter your name:");
                    name = input.nextLine();
                    name = input.nextLine();
                    System.out.println(name + ", Successfully Clocked-Out.");
                    employees.remove(name);
                    timeClock();
                    break;
                case 3:
                    System.out.println("Employees currently Clocked-In:\n");
                    System.out.println(employees);
                    timeClock();
                    break;
                case 4:
                    menu.zooMenu();
                    break;
                default:
                    System.out.println("Incorrect entry, Try again.");
                    timeClock();
                    break;
            }
        }

// Tri-Catch.

        catch(InputMismatchException ime){
            System.out.println("Incorrect entry, Try again.");
            timeClock();
        }

    }

}
