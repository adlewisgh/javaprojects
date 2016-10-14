package zoo;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by andrewlewis on 10/13/16.
 */
public class employeeMenu {

        public void employeeSubMenu(){
            TimeClockMenu timeclockmenu = new TimeClockMenu();
            AnimalMenu animalmenu = new AnimalMenu();
            VisitorMenu visitormenu = new VisitorMenu();
            Menu menu = new Menu();
            Scanner input = new Scanner(System.in);

// This is the Employee Menu. User will be directed to the following Switch statement based on user input.

            try {
                int c;
                System.out.println("Welcome to the Employee Menu \n");
                System.out.println(" \n");
                System.out.println("1. Clock-In, Clock-Out, View Employees Clocked-In");
                System.out.println("2. Add Animal, Remove Animal, View Animals");
                System.out.println("3. Add Visitor, Remove Visitor, View Visitors Present");
                System.out.println("4. Return to Main-MENU");
                c = input.nextInt();

// The following switch statement directs user to the appropriate menu based on the users input.

                switch (c) {
                    case 1:
                        timeclockmenu.timeClock();
                        break;
                    case 2:
                        animalmenu.animalMenu();
                        break;
                    case 3:
                        visitormenu.visitorMenu();
                        break;
                    case 4:
                        menu.zooMenu();
                        break;
                    default:
                        System.out.println("Incorrect entry, Try again.");
                        menu.zooMenu();
                        break;
                }
            }

// Tri-Catch.

            catch(InputMismatchException ime){
                System.out.println("Incorrect entry, Try again.");
                menu.zooMenu();
            }
        }
}
