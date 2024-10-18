import java.io.*;
import java.util.*;
public class settings {
    
    //public static final means that the variable will be accessible to all the casses and all the instances of a class. Once initialised, the value will not change
    public static final String ANSI_RESET = "\u001B[0m";   //set text colour of the game title 
    public static final String ANSI_PURPLE = "\u001B[35m";   //Geeks fro Geeks. Available at: https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/ 
    public static final String FILE_NAME = "High Score.txt";  //to store the name of the file

    public void title (String name) { //method to display the title of the game and introduce to the game

        Scanner scan=new Scanner(System.in);

        // ASCII Art Archives. Available at: https://www.asciiart.eu/text-to-ascii-art 
        System.out.println(ANSI_PURPLE + "  ███        ▄█    █▄       ▄████████       ▄█          ▄████████    ▄██████▄     ▄████████ ███▄▄▄▄   ████████▄           \n" + //
                            "▀█████████▄   ███    ███     ███    ███      ███         ███    ███   ███    ███   ███    ███ ███▀▀▀██▄ ███   ▀███          \n" + //
                            "   ▀███▀▀██   ███    ███     ███    █▀       ███         ███    █▀    ███    █▀    ███    █▀  ███   ███ ███    ███          \n" + //
                            "    ███   ▀  ▄███▄▄▄▄███▄▄  ▄███▄▄▄          ███        ▄███▄▄▄      ▄███         ▄███▄▄▄     ███   ███ ███    ███          \n" + //
                            "    ███     ▀▀███▀▀▀▀███▀  ▀▀███▀▀▀          ███       ▀▀███▀▀▀     ▀▀███ ████▄  ▀▀███▀▀▀     ███   ███ ███    ███          \n" + //
                            "    ███       ███    ███     ███    █▄       ███         ███    █▄    ███    ███   ███    █▄  ███   ███ ███    ███          \n" + //
                            "    ███       ███    ███     ███    ███      ███▌    ▄   ███    ███   ███    ███   ███    ███ ███   ███ ███   ▄███          \n" + //
                            "   ▄████▀     ███    █▀      ██████████      █████▄▄██   ██████████   ████████▀    ██████████  ▀█   █▀  ████████▀           \n" + //
                            "                                             ▀                                                                              \n" + //
                            " ▄██████▄     ▄████████          ███        ▄█    █▄       ▄████████                                                        \n" + //
                            "███    ███   ███    ███      ▀█████████▄   ███    ███     ███    ███                                                        \n" + //
                            "███    ███   ███    █▀          ▀███▀▀██   ███    ███     ███    █▀                                                         \n" + //
                            "███    ███  ▄███▄▄▄              ███   ▀  ▄███▄▄▄▄███▄▄  ▄███▄▄▄                                                            \n" + //
                            "███    ███ ▀▀███▀▀▀              ███     ▀▀███▀▀▀▀███▀  ▀▀███▀▀▀                                                            \n" + //
                            "███    ███   ███                 ███       ███    ███     ███    █▄                                                         \n" + //
                            "███    ███   ███                 ███       ███    ███     ███    ███                                                        \n" + //
                            " ▀██████▀    ███                ▄████▀     ███    █▀      ██████████                                                        \n" + //
                            "                                                                                                                            \n" + //
                            "   ▄▄▄▄███▄▄▄▄      ▄████████  ▄█          ▄████████ ███▄▄▄▄      ▄████████    ▄████████    ▄████████                       \n" + //
                            " ▄██▀▀▀███▀▀▀██▄   ███    ███ ███         ███    ███ ███▀▀▀██▄   ███    ███   ███    ███   ███    ███                       \n" + //
                            " ███   ███   ███   ███    █▀  ███         ███    ███ ███   ███   ███    █▀    ███    █▀    ███    ███                       \n" + //
                            " ███   ███   ███  ▄███▄▄▄     ███         ███    ███ ███   ███  ▄███▄▄▄      ▄███▄▄▄      ▄███▄▄▄▄██▀                       \n" + //
                            " ███   ███   ███ ▀▀███▀▀▀     ███       ▀███████████ ███   ███ ▀▀███▀▀▀     ▀▀███▀▀▀     ▀▀███▀▀▀▀▀                         \n" + //
                            " ███   ███   ███   ███    █▄  ███         ███    ███ ███   ███   ███    █▄    ███    █▄  ▀███████████                       \n" + //
                            " ███   ███   ███   ███    ███ ███▌    ▄   ███    ███ ███   ███   ███    ███   ███    ███   ███    ███                       \n" + //
                            "  ▀█   ███   █▀    ██████████ █████▄▄██   ███    █▀   ▀█   █▀    ██████████   ██████████   ███    ███                       \n" + //
                            "                              ▀                                                            ███    ███                       \n" + //
                            "" + ANSI_RESET);
    
        System.out.println("Welcome to the Legend of the Melaneer " + name + ". This game will take you to midgard, through the enchanted forests of Nordskogen.");
        System.out.println("Get ready to meet mystical creatures and fight them. The journey is not easy, but the reward is worth it.");
        System.out.println("You can exit the game at any point. Just press 'e' to exit the game.\n");
        System.out.println("Press 's' to open settinds menu.\n");

        char command=scan.next().charAt(0);
            scan.nextLine();   //extra scan.nextLine() so that a line is not skipped

            while (command!='s') {  //loop will continue until the user enters the correct command
                System.out.println("\nOops! Invalid command. Press 's' to open settings menu");
                command=scan.next().charAt(0);
            }
            if (command=='s') {
                settingsMenu();
            }
    }
    
    public boolean settingsMenu() {  //method to display settings menu everytime user presses s

        Scanner scan=new Scanner(System.in);

        boolean play=false;

        while (!play) {  //loop will keep displaying settings until user starts.
                
            System.out.println("\nPress 1 to Change Weapon");
            System.out.println("Press 2 to Change Armour");
            System.out.println("Press 3 to Start the Game");
            System.out.println("Press 4 to Logout and Exit");

            int choice=scan.nextInt();

            switch (choice) {
                case 1:
                    weapon(); 
                    break;
                case 2:
                    armour();
                    break;
                case 3:
                    play=true;
                    break;
                case 4:
                    System.out.print("\nLogging out! Good Bye.");
                    System.exit(0);
                default:
                    System.out.println("\nSorry! invalid choice.");
                    break;
            }
        }
        return play; //when the boolean becomes, true the loop will break and the game proceeds
    }
    
    public void weapon () {   //method for display the chosen weapon

        Scanner scan=new Scanner(System.in);

        System.out.print("\nChoose your weapon:");
        System.out.print("\n1: knight sword");
        System.out.print("\n2: silver sword");
        System.out.print("\n3: black sword");
                    
        int command=scan.nextInt();
        
        switch (command) {
            case 1:
                System.out.println("\nYou have equipped the Knight sword\n");
                System.out.print("            _\n" + //
                                            " _         | |\n" + //
                                            "| | _______| |---------------------------------------------\\\n" + //
                                            "|:-)_______|==[]============================================>\n" + //
                                            "|_|        | |---------------------------------------------/\n" + //
                                            "           |_|");
                System.out.println("\nDescription: this sword is used by the king's soldiers.\n");
                break;
            case 2:
                System.out.println("\nYou have equipped the Silver sword\n");
                System.out.print("              />\n" + //
                                            " ()          //---------------------------------------------------------(\n" + //
                                            "(*)OXOXOXOXO(*>                                                          \\\n" + //
                                            " ()          \\\\-----------------------------------------------------------)\n" + //
                                            "              \\>");
                System.out.println("\nDescription: this sword is made of a special silver found in the mystic forest.\n");
                break;
            case 3: 
                System.out.println("\nYou have equipped the Black sword\n");
                System.out.print("                   /}\n" + //
                                            "                  //\n" + //
                                            "                 /{     />\n" + //
                                            "  ,_____________///----/{____________________________________________________\n" + //
                                            "/|=============|/\\|-----/____________________________________________________\\\n" + //
                                            "\\|=============|\\/|-----\\____________________________________________________/\n" + //
                                            "  '~~~~~~~~~~~~~\\\\\\----\\{\n" + //
                                            "                 \\{     \\>\n" + //
                                            "                  \\\\\n" + //
                                            "                   \\}");
                System.out.println("\nDescription: this sword is made of a rare metal which can only be found in the mystic forest\n");
                break;
            default:
                System.out.println("Invalid command");
                break;
        }
    }
    public void armour () {   //method for selecting avatar

        Scanner scan=new Scanner(System.in);

        System.out.print("\nChoose your armour:");
        System.out.print("\n1: knight armour");
        System.out.print("\n2: silver armour");
        System.out.print("\n3: black armour");
    
        int command=scan.nextInt(); //variable to store user's choice

        switch (command) {
            case 1:
                System.out.println("\nYou have equipped Knight Armour\n");
                System.out.print("|\\             //\n" + //
                                            " \\\\           _!_\n" + //
                                            "  \\\\         /___\\\n" + //
                                            "   \\\\        [+++]\n" + //
                                            "    \\\\    _ _\\^^^/_ _\n" + //
                                            "     \\\\/ (    '-'  ( )\n" + //
                                            "     /( \\/ | {&}   /\\ \\\n" + //
                                            "       \\  / \\     / _> )\n" + //
                                            "        \"`   >:::;-'`\"\"'-.\n" + //
                                            "            /:::/         \\\n" + //
                                            "           /  /||   {&}   |\n" + //
                                            "          (  / (\\         /\n" + //
                                            "          / /   \\'-.___.-'\n" + //
                                            "    jgs _/ /     \\ \\\n" + //
                                            "       /___|    /___|");
                break;
            case 2:
                System.out.println("\nYou have equipped Silver Armour\n");
                System.out.print("  {}\n" + //
                                            "         .--.\n" + //
                                            "        /.--.\\\n" + //
                                            "        |====|\n" + //
                                            "        |`::`|\n" + //
                                            "    .-;`\\..../`;-.\n" + //
                                            "   /  |...::...|  \\\n" + //
                                            "  |   /'''::'''\\   |\n" + //
                                            "  ;--'\\   ::   /\\--;\n" + //
                                            "  <__>,>._::_.<,<__>\n" + //
                                            "  |  |/   ^^   \\|  |\n" + //
                                            "  \\::/|        |\\::/\n" + //
                                            "  |||\\|        |/|||\n" + //
                                            "  ''' |___/\\___| '''\n" + //
                                            "       \\_ || _/\n" + //
                                            "       <_ >< _>\n" + //
                                            "       |  ||  |\n" + //
                                            "       |  ||  |\n" + //
                                            "      _\\.:||:./_\n" + //
                                            "jgs  /____/\\____\\");
                break;
            case 3: 
                System.out.println("\nYou have equipped Black Armour\n");
                System.out.print("  / \\\n" + //
                                            "  | |\n" + //
                                            "  |.|\n" + //
                                            "  |.|\n" + //
                                            "  |:|      __\n" + //
                                            ",_|:|_,   /  )\n" + //
                                            "  (Oo    / _I_\n" + //
                                            "   +\\ \\  || __|\n" + //
                                            "      \\ \\||___|\n" + //
                                            "        \\ /.:.\\-\\\n" + //
                                            "         |.:. /-----\\\n" + //
                                            "         |___|::oOo::|\n" + //
                                            "         /   |:<_T_>:|\n" + //
                                            "        |_____\\ ::: /\n" + //
                                            "         | |  \\ \\:/\n" + //
                                            "         | |   | |\n" + //
                                            "         \\ /   | \\___\n" + //
                                            "         / |   \\_____\\\n" + //
                                            "         `-'");
            default:
                System.out.println("\nInvalid command\n");
                break;
        }
    }  
}