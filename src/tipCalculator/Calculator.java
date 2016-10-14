package tipCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by andrewlewis on 10/10/16.
 */
public class Calculator {
    ArrayList<Double> Answers = new ArrayList<>();
    Menu menu = new Menu();

    // This is the Calculator Menu.

    public void calc() throws IOException {

        boolean isRunning = true;
        while (isRunning) {

            double a;
            double b;
            String c;
            double val;
            double val2;
            double val3;

            try {
                System.out.println("Enter your first number");
                Scanner number = new Scanner(System.in);
                a = number.nextDouble();
                System.out.println("Enter second number");
                b = number.nextDouble();
                System.out.println("Enter operator type");
                c = number.nextLine();
                c = number.nextLine();
                System.out.print("Your answer is: ");

// Switch statement does math based on user input, and returns answer based on operator type.

                switch (c) {
                    case "+": {

                        double Answer = a + b;
                        val = Answer * 100;
                        val2 = Math.round(val);
                        val3 = val2 / 100;
                        System.out.println(val3);
                        Answers.add(val3);
                        String fileName = "Calculator.txt";
                        PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
                        outFile.println(val3);
                        outFile.close();
                        menuTwo();
                        break;
                    }
                    case "-": {
                        double Answer = a - b;
                        val = Answer * 100;
                        val2 = Math.round(val);
                        val3 = val2 / 100;
                        System.out.println(val3);
                        Answers.add(val3);
                        String fileName = "Calculator.txt";
                        PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
                        outFile.println(val3);
                        outFile.close();
                        menuTwo();
                        break;
                    }
                    case "*": {
                        double Answer = a * b;
                        val = Answer * 100;
                        val2 = Math.round(val);
                        val3 = val2 / 100;
                        System.out.println(val3);
                        Answers.add(val3);
                        String fileName = "Calculator.txt";
                        PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
                        outFile.println(val3);
                        outFile.close();
                        menuTwo();
                        break;
                    }
                    case "/": {
                        double Answer = a / b;
                        val = Answer * 100;
                        val2 = Math.round(val);
                        val3 = val2 / 100;
                        System.out.println(val3);
                        Answers.add(val3);
                        String fileName = "Calculator.txt";
                        PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
                        outFile.println(val3);
                        outFile.close();
                        menuTwo();
                        break;
                    }
                    default:
                        System.out.println("Incorrect entry, Try again.");
                        calc();
                        break;
                }
            }

// Tri-Catch.

            catch(InputMismatchException ime){
                System.out.println("Incorrect entry, Try again.");
                calc();
            }
        }
    }

// This is the Calculator Sub-Menu.

            public void menuTwo() throws IOException {
                Scanner number = new Scanner(System.in);
                int m;
                try {
                    System.out.println(" ");
                    System.out.println("1. Continue");
                    System.out.println("2. Show Previous Answers");
                    System.out.println("3. Return to MENU");
                    m = number.nextInt();


                    switch (m) {
                        case 1:
                            calc();
                            break;
                        case 2:
                            pastCalculations();
                            break;
                        case 3:
                            menu.menuOptions();
                            break;
                        default:
                            System.out.println("Incorrect entry, Try again.");
                            break;
                    }

                }

// Tri-Catch.

                catch(InputMismatchException ime){
                    System.out.println("Incorrect entry, Try again.");
                    menuTwo();
                }
        }

// Shows all of the users previous calculations.

            public void pastCalculations()throws IOException{

                System.out.println(Answers);
                menuTwo();
            }
    }








