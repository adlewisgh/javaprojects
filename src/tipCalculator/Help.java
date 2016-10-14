package tipCalculator;

import java.io.IOException;

/**
 * Created by andrewlewis on 10/13/16.
 */
public class Help {

// This is the Help menu.

    public void help()throws IOException{
        Menu menu = new Menu();
        System.out.println
                ("WELCOME TO THE HELP MENU \n" +
                        "  \n" +
                        "To Troubleshoot simply say: \n" +
                        " \n" +
                        "'' Help me Top Cruise, I'M ON FIRE!!! '' \n");
        menu.menuOptions();
    }
}
