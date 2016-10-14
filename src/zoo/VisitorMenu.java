package zoo;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Created by andrewlewis on 10/13/16.
 */
public class VisitorMenu {
    public static ArrayList<String> visitors = new ArrayList<>();
    public void visitorMenu(){
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        int menuSelection;
        String name;

// This is the Visitors Menu. The user will be directed to the following Switch statement based upon the users input.

        try{
        System.out.println("Welcome to Visitor Sub-MENu\n");
        System.out.println("\n");
        System.out.println("1. Enter Zoo");
        System.out.println("2. Leave Zoo");
        System.out.println("3. View Visitors Present");
        System.out.println("4. Return to Main-MENU");
        menuSelection = input.nextInt();

// The following Switch statement will Add/Remove/View Visitors, or Return to the Main-Menu based upon the users input. The user will then be directed to the appropriate menu.

            switch (menuSelection) {
                case 1:
                    System.out.println("What is your name?");
                    name = input.nextLine();
                    name = input.nextLine();
                    System.out.println(name + ", successfully Entered the Zoo.");
                    visitors.add(name);
                    visitorMenu();
                    break;
                case 2:
                    System.out.println("What is your name?");
                    name = input.nextLine();
                    name = input.nextLine();
                    System.out.println(name + ", successfully Left the Zoo.");
                    visitors.remove(name);
                    visitorMenu();
                    break;
                case 3:
                    System.out.println(visitors);
                    visitorMenu();
                    break;
                case 4:
                    menu.zooMenu();
                    break;
                default:
                    System.out.println("Incorrect entry, Try again.");
                    visitorMenu();
                    break;
            }

        }

// Tri-Catch.

        catch(InputMismatchException ime){
            System.out.println("Incorrect entry, Try again.");
            visitorMenu();
        }
    }

}
