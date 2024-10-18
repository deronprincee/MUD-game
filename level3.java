import java.util.Scanner;
  
public class level3 {

    public void finalChallenge (String name) { //method to describe the final part of the game.

        Scanner scan=new Scanner(System.in);

        System.out.println("We used the map to find the location of the Melaneer. This is it!");
        System.out.println("Follow the map to go to the Melaneer. Press 'f'.");
        char command=scan.next().charAt(0);
        scan.nextLine(); 

        while (command!='f') {  //loop will continue until the user enters the correct command
            if (command=='e') { //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }
            else {
                System.out.println("\nOops! Invalid command. Press 'f' to follow the map");
                command=scan.next().charAt(0);
            }
        }
        
        System.out.println("\n" + name + ", you very close to finding the Melaneer. It is on the other side of this wall. Cross the wall of thorns to complete the final challenge.\n");
        System.out.println("X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  \n" + //
                        "/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/\n" + //
                        "\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\\n" + //
                        " X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  \n" + //
                        "/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/\n" + //
                        "\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\\n" + //
                        " X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  \n" + //
                        "/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/\n" + //
                        "\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\\n" + //
                        " X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  \n" + //
                        "/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/\n" + //
                        "\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\\n" + //
                        " X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  \n" + //
                        "/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/\n" + //
                        "\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\\n" + //
                        " X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  \n" + //
                        "/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\/\n" + //
                        "\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\\n" + //
                        " X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  X  ");
        System.out.println("\nIn order to break this wall, you must answer this question and you only have 3 chances:\n");
        System.out.println("I come without being fetched,");
        System.out.println("I disappear without being stolen.");
        System.out.println("I am celebrated with joy and mourned in sorrow,");
        System.out.println("The beginning of existence, the end of tomorrow.");
        System.out.println("What am I?"); //the answer is 'life'.

        final String answer="life"; //the answer is life. This variable can not be changed once initialised.
        int attempts=3;

        while (attempts>0) {

            String key=scan.nextLine();

            if (key.equalsIgnoreCase("e")) {  //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }

            if (key.equalsIgnoreCase(answer)) {  //the function will ignore the case of the word
                System.out.println("Congragulations " + name + ", You have found the melaneer. The melaneer is right infront of you.");
                System.out.println("You can ask the melaneer for it's tears which will heal the village and save the people!\n");
                System.out.println("     /|       |\\\n" + //
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
                                        "            /_//_/           /_/   /_/\n" + //
                                        "\n");
                break;
            }
            else {
                attempts--;

                switch (attempts) {
                    case 2:
                        System.out.print("\nUh oh......this is not the answer. You only have " + attempts + " more attempts so choose wisely!\n");
                        break;
                    case 1:
                        System.out.print("\nUh oh......this is not the answer. You only have " + attempts + " more attempts so choose wisely!\n");
                        System.out.println("\nThe answe is the opposite of death.\n"); // the hint is given automatically after each attempt.
                        break;
                    case 0:
                        System.out.println("\n" + name + ", you lost the game. You'll have to start over.\n");
                        System.exit(0);
                        default:
                        break;
                }
            }
        }
    }    
}
