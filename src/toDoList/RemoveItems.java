package toDoList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by andrewlewis on 10/12/16.
 */
public class RemoveItems {
// The is the remove last item menu.
    public void remove(){
        AddItems additems = new AddItems();
        String delete;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Remove last item? y/n");
            delete = input.nextLine();

// Switch Statement directs to appropriate Sub-Menu, while choosing to remove/not remove items from array based on user input.

            switch (delete) {
                case "y":
                    additems.items.remove(additems.items.size() - 1);
                    removeSubMenu();
                    break;
                case "n":
                    additems.addSubMenu();
                    break;
                default:
                    System.out.println("Incorrect entry, Try again.");
                    remove();
            }
        }
// Tri-Catch.

        catch(InputMismatchException ime){
            System.out.println("Incorrect entry, Try again.");
            remove();
        }
        }

// Item Removal Sub-Menu.

        public void removeSubMenu(){
            AddItems additems = new AddItems();
            int subMenuChoice;
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("1. Remove item");
                System.out.println("2. Show List");
                System.out.println("3. Return to Sub-Menu");
                subMenuChoice = input.nextInt();

// Switch statement directs user to the correct menu based upon user input from the above menu.

                switch (subMenuChoice) {
                    case 1:
                        remove();
                        break;
                    case 2:
                        System.out.println(additems.items);
                        removeSubMenu();
                        break;
                    case 3:
                        additems.addSubMenu();
                        break;
                    default:
                        System.out.println("Incorrect entry, Try again.");
                        removeSubMenu();
                }
            }

// Tri-Catch.

            catch(InputMismatchException ime){
                System.out.println("Incorrect entry, Try again.");
                removeSubMenu();
            }
        }

    }


