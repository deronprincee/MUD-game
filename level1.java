import java.util.*;

public class level1 {

    settings settings=new settings(); //oblect to call methods from 'settings' class
    
    public void intro (String name) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Hello " + name + ", the King of the Northern Kingdom has chosen you to find the legendary Melaneer.");
        System.out.println("The village of Buksby has been cursed by the gods, a plague is spreading in the village and it will soon cover the whole kingdome if not stopped. Although it is just a legend, the plague can only be stopped");
        System.out.println("by the tears of the Melaneer. It is said that the melaneer is hidden inside the enchanted forest and it only shows itself to those with a pure heart It is the last resort and everyone is depending on you. You ");
        System.out.println("must leave tomorrow to find the legendary Melaneer in the enchanted forest");
        System.out.println("   /|       |\\\n" + //
                                "  `__\\\\       //__'\n" + //
                                "     ||      ||\n" + //
                                "   \\__`\\     |'__/\n" + //
                                "     `_\\\\   //_'\n" + //
                                "     _.,:---;,._\n" + //
                                "     \\_:     :_/\n" + //
                                "       |@. .@|\n" + //
                                "       |     |\n" + //
                                "       ,\\.-./ \\\n" + //
                                "       ;;`-'   `---__________-----.-.\n" + //
                                "       ;;;                         \\_\\\n" + //
                                "       ';;;                         |\n" + //
                                "        ;    |                      ;\n" + //
                                "         \\   \\     \\        |      /\n" + //
                                "          \\_, \\    /        \\     |\\\n" + //
                                "            |';|  |,,,,,,,,/ \\    \\ \\_\n" + //
                                "            |  |  |           \\   /   |\n" + //
                                "            \\  \\  |           |  / \\  |\n" + //
                                "             | || |           | |   | |\n" + //
                                "             | || |           | |   | |\n" + //
                                "             | || |           | |   | |\n" + //
                                "             |_||_|           |_|   |_|\n" + //
                                "            /_//_/           /_/   /_/ \n");
        System.out.println("Press 'b' to begin journey into the forest");

        char command=scan.next().charAt(0);
        scan.nextLine();   //extra scan.nextLine() so that a line is not skipped

        while (command!='b') {  //loop will continue until the user enters the correct command
            
            if (command=='e') { //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }
            else {
                System.out.println("\nOops! Invalid command. Press 'b' to begin\n");
                command=scan.next().charAt(0);

            }
        }
        
        System.out.println("The journey is long, hopefully you have some food and water with you. Enter into the forest and find the valkyrie bridge.");
        System.out.println("The valkyrie bridge is located in the North of the forest and it will lead you to the old ruins of the northern kingdom.");
        System.out.println("Press 'n' to go North\n");

        command=scan.next().charAt(0);
        scan.nextLine();   //extra scan.nextLine() so that a line is not skipped

        while (command!='n') {  //loop will continue until the user enters the correct command
            
            if (command=='e') { //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }
            else {
                System.out.println("\nOops! Invalid command. Press 'n' to go North");
                command=scan.next().charAt(0);
            }
        }
    }
    public void trolls (String name) { //method to describe the first level

        Scanner scan=new Scanner(System.in);

        System.out.println("You're almost there. Beware! the bridge is guarded by trolls and they won't let you cross so easily.\n");
        System.out.println(name + ", you are encountered by trolls in the forest and they won't let you cross the bridge until you solve a riddle.\n");
        System.out.println("       _.------.                        .----.__\n" + //
                        "           /         \\_.       ._           /---.__  \\\n" + //
                        "          |  O    O   |\\\\___  //|          /       `\\ |\n" + //
                        "          |  .vvvvv.  | )   `(/ |         | o     o  \\|\n" + //
                        "          /  |     |  |/      \\ |  /|   ./| .vvvvv.  |\\\n" + //
                        "         /   `^^^^^'  / _   _  `|_ ||  / /| |     |  | \\\n" + //
                        "       ./  /|         | O)  O   ) \\|| //' | `^vvvv'  |/\\\\\n" + //
                        "      /   / |         \\        /  | | ~   \\          |  \\\\\n" + //
                        "      \\  /  |        / \\ Y   /'   | \\     |          |   ~\n" + //
                        "       `'   |  _     |  `._/' |   |  \\     7        /\n" + //
                        "         _.-'-' `-'-'|  |`-._/   /    \\ _ /    .    |\n" + //
                        "    __.-'            \\  \\   .   / \\_.  \\ -|_/\\/ `--.|_\n" + //
                        " --'                  \\  \\ |   /    |  |              `-\n" + //
                        "                       \\uU \\UU/     |  /   :F_P:\n" + //
                        "");
        System.out.println("\nThese creatures protect the bridge from those who are unworthy to pass.\n");
        System.out.println("The riddle is to rearrange a group of symbols to make up a word which is the key into the ruins\nThe symbols are: Ǝ ᴚ ˥ W ∀ Ǝ N Ǝ\n"); 
        System.out.println("You have 4 attempts to solve the riddle");

        int attempts=4; //variable shows how many attempts are left
        final String answer="melaneer"; //the answer is melaneer. This variable can not be changed once initialised.
        
        while (attempts>0) {
            
            String command=scan.nextLine();

            if (command.equalsIgnoreCase("e")) {  //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }
            
            if (command.equalsIgnoreCase(answer)) {  //the code will ignore the case of the word
                System.out.println("\nWelldone! You have solved the riddle. Remember this word for it is the key to the ruins.");
                break;
            }
            else {
                attempts--;
                
                switch (attempts) {
                    case 3:
                        System.out.print("\nUh oh......this is not the answer. You only have " + attempts + " more attempts so choose wisely!\n");
                        System.out.println("\nHere's a hint: The symbols are actually upside down.\n"); // the hints are given automatically after each attempt.
                        break;
                    case 2:
                        System.out.print("\nUh oh......this is not the answer. You only have " + attempts + " more attempts so choose wisely!\n");
                        System.out.println("\nAnother hint: The word starts with 'M'.\n"); // the hint is given automatically after each attempt.
                        break;
                    case 1:
                        System.out.print("\nUh oh......this is not the answer. You only have " + attempts + " more attempts so choose wisely!\n");
                        System.out.println("\nOne last hint: The key is the name of the mystical creature you are looking for.\n"); // the hint is given automatically after each attempt.
                        break;
                    case 0:
                        System.out.println("\n" + name + ", you lost the game. You'll have to start over.\n");
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            }
        }   
    }    
}
