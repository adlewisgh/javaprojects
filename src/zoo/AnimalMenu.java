package zoo;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Created by andrewlewis on 10/13/16.
 */
public class AnimalMenu {
    public static ArrayList<String> animals = new ArrayList<>();
    public void animalMenu(){
        employeeMenu employeemenu = new employeeMenu();
        int menuSelection;
        String animal;

// This is the Animal Menu. User will be directed to the following Switch statement based on their input.

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the Animal Sub-MENU\n");
            System.out.println("\n");
            System.out.println("1. Add Animal");
            System.out.println("2. Remove Animal");
            System.out.println("3. View current Animals");
            System.out.println("4. Return to Employee MENU");
            menuSelection = input.nextInt();

// Switch statement directs user to appropriate menu based on user input.

            switch (menuSelection) {
                case 1:
                    System.out.println("Enter the Animal you wish to Add:");
                    animal = input.nextLine();
                    animal = input.nextLine();
                    System.out.println(animal + ", Successfully Added.");
                    animals.add(animal);
                    animalMenu();

                    break;
                case 2:
                    System.out.println("Enter the Animal you wish to Remove:");
                    animal = input.nextLine();
                    animal = input.nextLine();
                    System.out.println(animal + ", Successfully Removed.");
                    animals.remove(animal);
                    animalMenu();
                    break;
                case 3:
                    System.out.println(animals);
                    animalMenu();
                    break;
                case 4:
                    employeemenu.employeeSubMenu();
                    break;
                default:
                    System.out.println("Incorrect entry, Try again.");
                    animalMenu();
                    break;
            }
        }

// Tri-Catch.

        catch(InputMismatchException ime){
            System.out.println("Incorrect entry, Try again.");
            animalMenu();
        }
    }

}
