package tipCalculator;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by andrewlewis on 10/12/16.
 */
public class RemoveItem {

// remove() prompts user to "remove last item".

    public void remove()throws IOException{
        GroceryCalculator grocerycalculator = new GroceryCalculator();
        Scanner input = new Scanner(System.in);
        String delete;
        try {
            System.out.println("Do you want to remove your last price? y/n");
            delete = input.nextLine();

// Switch removes the last item stored in array based on user input.

            switch (delete) {
                case "y":
                    grocerycalculator.groceryPrices.remove(grocerycalculator.groceryPrices.size() - 1);
                    System.out.println("Last price successfully removed!");
                    grocerycalculator.grocerySubMenu();
                    break;
                case "n":
                    grocerycalculator.grocerySubMenu();
                    break;
                default:
                    System.out.println("Incorrect entry, Try again.");
                    remove();
                    break;
            }
        }

// Tri-Catch.

        catch(InputMismatchException ime){
            System.out.println("Incorrect entry, Try again.");
            remove();
        }
    }
}
