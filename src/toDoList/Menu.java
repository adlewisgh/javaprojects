package toDoList;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andrewlewis on 10/12/16.
 */
public class Menu {


//Main Menu, first screen the user sees.

    public void menuOptions() {
        AddItems additems = new AddItems();
            String[] menu;
        try {
            menu = new String[3];
            menu[0] = "1. To-Do List";
            menu[1] = "2. Help Menu";
            menu[2] = "3. Quit";

            System.out.printf("Welcome to the MENU, please select a number 1-5 to continue. \n");
            System.out.printf("\n");
            System.out.println(menu[0]);
            System.out.println(menu[1]);
            System.out.println(menu[2]);

            int m;

            Scanner menuSelection = new Scanner(System.in);
            System.out.println("Please enter your Selection:");
            m = menuSelection.nextInt();
            Help help = new Help();

// Switch statement directing to appropriate Sub-Menu.

                switch(m){
                    case 1:
                        additems.addSubMenu();
                        break;
                    case 2:
                        help.help();
                        break;
                    case 3:
                        System.out.println("Exiting the program, Goodbye.");
                        System.exit(3);
                        break;
                    default:
                        System.out.println("Incorrect entry, Try again.");
                        menuOptions();
                }
        }
        //Tri-Catch to prevent errors.
        catch(InputMismatchException ime){
            System.out.println("Incorrect entry, Try again.");
            menuOptions();
        }
        }

    }


