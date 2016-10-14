package toDoList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by andrewlewis on 10/12/16.
 */
public class AddItems {
    Menu menu = new Menu();
    public static ArrayList<String> items = new ArrayList<>();

// This is the Add additional items menu.

    public void add (){
        String a;
        int b;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter your item");
            a = input.nextLine();
            System.out.println("Set Priority:");
            System.out.println("1. High");
            System.out.println("2. Low");
            b = input.nextInt();

// Switch statement directs the user to the appropriate Sub-Menu based on user input.

            switch(b){
                case 1:
                    System.out.println("Item added successfully");
                    items.add(0, a);
                    addSubMenu();
                    break;
                case 2:
                    items.add(a);
                    addSubMenu();
                    break;
                default:
                    System.out.println("Incorrect entry, Try again.");
                    add();
            }
        }

// Tri-Catch.

        catch(InputMismatchException ime){
            System.out.println("Incorrect entry, Try again.");
            add();
        }
        }
// This is the To-Do List Sub-Menu. Here the user chooses to Add, Remove, Show items, or to return to the Main-Menu.

    public void addSubMenu(){
        RemoveItems removeitems = new RemoveItems();
            Scanner number = new Scanner(System.in);
            int m;
        try {
            System.out.println(" ");
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. Show List");
            System.out.println("4. Return to MENU");
            m = number.nextInt();

// Switch Statement directs user to appropriate Sub-Menu based on user input.

            switch(m){
                case 1:
                    add();
                    break;
                case 2:
                    removeitems.remove();
                    break;
                case 3:
                    System.out.println(items);
                    addSubMenu();
                    break;
                case 4:
                    menu.menuOptions();
                    break;
                default:
                    System.out.println("Incorrect entry, Try again.");
                    addSubMenu();
            }
        }

// Tri-Catch.

        catch(InputMismatchException ime){
            System.out.println("Incorrect entry, Try again.");
            addSubMenu();
        }
        }
    }


