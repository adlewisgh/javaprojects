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
public class TipCalculator {

    public static ArrayList<Double>tipAmount=new ArrayList<>();

    public void calculateTip()throws IOException{
        Scanner number = new Scanner(System.in);
        double bill;
        int service;
        double tipPercent;
        double answer;
        double val;
        double val2;
        double val3;

// This prompts user for their bill amount, and to rate their service. These values are saved to variables and sent to the below Switch Statement.

    try {
        System.out.println("How much is your bill?");
        bill = number.nextDouble();
        System.out.println("Rate your service on a scale of 1-3");
        service = number.nextInt();

// Switch statement does math based on user input from the above, and calculates answer based on user input from the statement.

        switch (service) {
            case 1: {
                tipPercent = .05;
                answer = bill * tipPercent;
                val = answer * 100;
                val2 = Math.round(val);
                val3 = val2 / 100;
                System.out.println("Your appropriate tip amount is: " + val3);
                tipAmount.add(val3);
                String fileName = "TipCalculator.txt";
                PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
                outFile.println(val3);
                outFile.close();
                subMenu();

                break;
            }
            case 2: {
                tipPercent = .10;
                answer = bill * tipPercent;
                val = answer * 100;
                val2 = Math.round(val);
                val3 = val2 / 100;
                System.out.println("Your appropriate tip amount is: " + val3);
                tipAmount.add(val3);
                String fileName = "TipCalculator.txt";
                PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
                outFile.println(val3);
                outFile.close();
                subMenu();
                break;
            }
            case 3: {
                tipPercent = .15;
                answer = bill * tipPercent;
                val = answer * 100;
                val2 = Math.round(val);
                val3 = val2 / 100;
                System.out.println("Your appropriate tip amount is: " + val3);
                tipAmount.add(val3);
                String fileName = "TipCalculator.txt";
                PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
                outFile.println(val3);
                outFile.close();
                subMenu();
                break;
            }
            default:
                System.out.println("Incorrect entry, Try again.");
                calculateTip();
                break;
        }

    }

// Tri-Catch.

    catch(InputMismatchException ime){
        System.out.println("Incorrect entry, Try again.");
        calculateTip();
    }
            }

            public void subMenu()throws IOException{
                Menu menu = new Menu();
                Scanner number = new Scanner(System.in);
                int m;

// This is the Tip Calculator Sub-Menu.

            try {
                System.out.println(" ");
                System.out.println("1. Continue");
                System.out.println("2. Show Previous Tip Calculations");
                System.out.println("3. Return to MENU");
                m = number.nextInt();

// Switch statement directs user to the appropriate menu based on user input from the above.

                switch (m) {
                    case 1:
                        calculateTip();
                        break;
                    case 2:
                        System.out.println(tipAmount);
                        subMenu();
                        break;
                    case 3:
                        menu.menuOptions();
                        break;
                    default:
                        System.out.println("Incorrect entry, Try again.");
                        subMenu();
                        break;
                }
            }

// Tri-Catch.

            catch(InputMismatchException ime){
                System.out.println("Incorrect entry, Try again.");
                subMenu();
            }
        }
}




