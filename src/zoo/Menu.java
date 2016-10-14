package zoo;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by andrewlewis on 10/13/16.
 */
public class Menu {
    Scanner input = new Scanner(System.in);
    employeeMenu employeemenu = new employeeMenu();
    VisitorMenu visitormenu = new VisitorMenu();
    int m;
        public void zooMenu(){

// This is the Main-Menu. User input will direct user to the following Switch statement.

            try {
                System.out.println("Welcome to the Zoo Main-MENU \n");
                System.out.println(" \n");
                System.out.println("Please verify your entry selection:\n");
                System.out.println("1. Employee");
                System.out.println("2. Visitor");
                System.out.println("3. Quit");
                m = input.nextInt();

// The following Switch statement will direct the user to the appropriate menu based on the users input.

                switch (m) {
                    case 1:
                        employeemenu.employeeSubMenu();
                        break;
                    case 2:
                        visitormenu.visitorMenu();
                        break;
                    case 3:
                        System.out.println("Exiting the program, Goodbye.");
                        System.exit(3);
                        break;
                    default:
                        System.out.println("Incorrect entry, Try again.");
                        zooMenu();
                        break;
                }
            }

// Tri-Catch.

            catch(InputMismatchException ime){
                System.out.println("Incorrect entry, Try again.");
                zooMenu();
            }
        }



}
