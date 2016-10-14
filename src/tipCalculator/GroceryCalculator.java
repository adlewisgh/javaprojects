package tipCalculator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by andrewlewis on 10/11/16.
 */
public class GroceryCalculator {

   public static ArrayList<Double> groceryPrices = new ArrayList<>();
    Menu menu = new Menu();

// Gathering Grocery item amount based on user input, and sending that info to grocerySubMenu() just below.

    public void groceryCalc()throws IOException{
        double price;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("How much is your Grocery item?");
            price = input.nextDouble();
            groceryPrices.add(price);
            grocerySubMenu();
        }

// Tri-Catch

        catch(InputMismatchException ime){
            System.out.println("Incorrect entry, Try again.");
            grocerySubMenu();
        }
    }

// This is the Grocery Menu. User will choose to Add/Remove/Show Items, or Return to Main-Menu.

    public void grocerySubMenu()throws IOException{
        RemoveItem removeitem = new RemoveItem();
        int price;
        Scanner input = new Scanner(System.in);
        try{
        System.out.println("1. Add an item.");
        System.out.println("2. Remove an item.");
        System.out.println("3. Show Sub-Total.");
        System.out.println("4. Return to MENU");
        price = input.nextInt();

// Switch statement directs user to appropriate menu based on user input from the above menu.

            switch(price){
                case 1:
                    groceryCalc();
                    break;
                case 2:
                    removeitem.remove();
                    break;
                case 3:
                    grocerySubMenuExtension();
                    break;
                case 4:
                    menu.menuOptions();
                    break;
                default:
                    System.out.println("Incorrect entry, Try again.");
                    grocerySubMenu();
            }
        }

// Tri-Catch.

        catch(InputMismatchException ime){
            System.out.println("Incorrect entry, Try again.");
            grocerySubMenu();
        }
        }

// This method is made solely for the purpose of making the above switch statement look cleaner. Case 3 leads to grocerSubMenuExtension() which does the calculations, then returns back to the grocerySubMenu().

        public void grocerySubMenuExtension()throws IOException{
            double sum = 0;
            double val;
            double val2;
            double val3;
            for( Double i : groceryPrices) {
                sum += i;}
            val = sum*100;
            val2 = Math.round(val);
            val3 = val2 /100;
            System.out.println(val3);
            String fileName = "GroceryCalculator.txt";
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
            outFile.println(val3);
            outFile.close();
            grocerySubMenu();
        }

    }


