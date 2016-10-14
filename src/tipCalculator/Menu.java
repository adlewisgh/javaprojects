package tipCalculator;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andrewlewis on 10/10/16.
 */
public class Menu {

// This is the Main Menu.

    TipCalculator tipcalculator = new TipCalculator();
    public void menuOptions()throws IOException {
        GroceryCalculator grocerycalculator = new GroceryCalculator();
        Calculator calculator = new Calculator();
        try {
            String[] menu;
            menu = new String[5];
            menu[0] = "1. Basic Math";
            menu[1] = "2. Tip Calculator";
            menu[2] = "3. Groceries";
            menu[3] = "4. Help";
            menu[4] = "5. Quit";

            System.out.printf("Welcome to the MENU, please select a number 1-6 to continue. \n");
            System.out.printf("\n");
            System.out.println(menu[0]);
            System.out.println(menu[1]);
            System.out.println(menu[2]);
            System.out.println(menu[3]);
            System.out.println(menu[4]);


            int m;
            Help help = new Help();
            Scanner menuSelection = new Scanner(System.in);
            System.out.println("Please enter your Selection:");
            m = menuSelection.nextInt();

// Switch statement directs user to the appropriate menu based on user input.

            switch (m) {
                case 1:
                    calculator.calc();
                    break;
                case 2:
                    tipcalculator.calculateTip();
                    break;
                case 3:
                    grocerycalculator.grocerySubMenu();
                    break;
                case 4:
                    help.help();
                    break;
                case 5:
                    System.out.println("Exiting the program, Goodbye.");
                    System.exit(5);
                    break;
                default:
                    System.out.println("Incorrect entry, Try again.");
                    menuOptions();
                    break;
            }
        }

// Tri-Catch.

        catch(InputMismatchException ime){
            System.out.println("Incorrect entry, Try again.");
            menuOptions();
        }
        }

    }



