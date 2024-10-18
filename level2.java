import java.util.Scanner;

public class level2 {

    settings settings=new settings(); //oblect to call methods from 'settings' class

    public void spirits () { //method to fight the spirits
        
        Scanner scan=new Scanner(System.in);

        System.out.print("\nYou can now cross the bridge. On the other side, you might find spirits of the forest who will try to take away your soul.");
        System.out.print("You must avoid them at all costs!");
        System.out.print("\nPress 'c' to cross the bridge.\n");
        char command=scan.next().charAt(0);
        scan.nextLine(); //extra scan.nextLine() so that a line is not skipped
        
        while (command!='c') {  //loop will continue until the user enters the correct command  
            if (command=='e') { //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }
            else {
                System.out.println("\nOops! Invalid command. Press 'c' to cross");
                command=scan.next().charAt(0);
            }
        }
        
        System.out.print("\nKeep going north and whenever you hear whispers, cover your ears. That is how the spirits will trap you. ");
        System.out.println("Press 'n' to go North.\n");
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

        System.out.print("Can you hear the whispers? cover your ears immediately. Press 'c'!!\n");
        System.out.println("          ,\n" + //
                                "        .--')\n" + //
                                "       /    /\n" + //
                                "      |    /\n" + //
                                "   /`.\\   (_.'\\\n" + //
                                "   \\          /\n" + //
                                "    '--. .---'\n" + //
                                "jgs   ( \" )\n" + //
                                "       '-'\n" + //
                                "                ,           \n" + //
                                "                 \\`-,      ,     =-\n" + //
                                "             .-._/   \\_____)\\\n" + //
                                "            (\"              / =-\n" + //
                                "             '-;   ,_____.-'       =-\n" + //
                                "  jgs         /__.'\n" + //
                                "\n" + //
                                "\n" + //
                                "       .-.\n" + //
                                "      ( \" )\n" + //
                                "   /\\_.' '._/\\\n" + //
                                "   |         |\n" + //
                                "    \\       /\n" + //
                                "     \\    /`\n" + //
                                "   (__)  /\n" + //
                                "jgs`.__.'");
            
        command=scan.next().charAt(0);
        scan.nextLine();   //extra scan.nextLine() so that a line is not skipped

        while (command!='c') {  //loop will continue until the user enters the correct command
            if (command=='e') { //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }
            else {
                System.out.println("\nOops! Invalid command. Press 'c' to cover your ears");
                command=scan.next().charAt(0);
            }
        }

        System.out.print("\nKeep your ears cover and run. Press 'r'.\n");
        command=scan.next().charAt(0);
        scan.nextLine();   //extra scan.nextLine() so that a line is not skipped
        
        while (command!='r') {  //loop will continue until the user enters the correct command
            if (command=='e') { //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }
            else {
                System.out.println("\nOops! Invalid command. Press 'r' to run");
                command=scan.next().charAt(0);
            }
        }
    }
    
    public void griffin (String name) { //method to enter the ruins
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("\nThat was close, you're almost there. Keep walking straight. ");
        System.out.println( "There it is, the old ruins." + name + ", enter the ruins, you need to find a map hidden in the there. The map will lead you to the Melaneer.");
        System.out.println("The ruins used to be a castle of the norther kingdom but it was abandoned when the spirits of the forests became furious.\n");
        System.out.println("   ,             ,\n" + //
                        "   :===.     .===:\n" + //
                        "   |/V\\|     |/V\\|\n" + //
                        "   ||||;  |  |||||\n" + //
                        "   |||||__T__|||||\n" + //
                        "   |;:;|.,.,.|;:;|\n" + //
                        "   |:;:|;:;:;|:;:|\n" + //
                        "   |.o.| ,=. |,o.|\n" + //
                        "   |/V\\|({o})|/V\\|\n" + //
                        "   ||||| `=' |||||\n" + //
                        "   |;:;|:;;;:|:::|\n" + //
                        "   |,\".|,:::.|,\".|\n" + //
                        "l42||:|||:::|||:||\n" + //
                        "---''\"'-'\"\"\"'-'\"''---");
        System.out.println("\nThere is something inside the ruins, some kind of flying creature lurking in the shadows.");
        System.out.println("It is a griffin, an ancient creature which has been guarding the ruins for hundreds of years.\n");
        System.out.println("                           _\n" + //
                        "                          _)\\.-.\n" + //
                        "         .-.__,___,_.-=-. )\\`  a`\\_\n" + //
                        "     .-.__\\__,__,__.-=-. `/  \\     `\\\n" + //
                        "     {~,-~-,-~.-~,-,;;;;\\ |   '--;`)/\n" + //
                        "      \\-,~_-~_-,~-,(_(_(;\\/   ,;/\n" + //
                        "       \",-.~_,-~,-~,)_)_)'.  ;;(\n" + //
                        "         `~-,_-~,-~(_(_(_(_\\  `;\\\n" + //
                        "   ,          `\"~~--,)_)_)_)\\_   \\\n" + //
                        "   |\\              (_(_/_(_,   \\  ;\n" + //
                        "   \\ '-.       _.--'  /_/_/_)   | |\n" + //
                        "    '--.\\    .'          /_/    | |\n" + //
                        "        ))  /       \\      |   /.'\n" + //
                        "       //  /,        | __.'|  ||\n" + //
                        "      //   ||        /`    (  ||\n" + //
                        "     ||    ||      .'       \\ \\\\\n" + //
                        "     ||    ||    .'_         \\ \\\\\n" + //
                        "      \\\\   //   / _ `\\        \\ \\\\__\n" + //
                        "jgs    \\'-'/(   _  `\\,;        \\ '--:,\n" + //
                        "        `\"`  `\"` `-,,;         `\"`\",,;");
        System.out.println("\nThe griffin asks for the key in order to proceed into the ruins. Enter the key which was revealed by the trolls.\n");

        boolean flag=false;
        final String answer="melaneer"; //the answer is melaneer. This variable can not be changed once initialised.

        while (!flag) {
            String command=scan.nextLine();
            
            if (command.equalsIgnoreCase("e")) { //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }
            
            if (command.equalsIgnoreCase(answer)) { //this method will ignore the case of the answer
                System.out.println("\nCorrect!");
                flag=true;
            }
            else {
                System.out.println("\nOops! wrong key. The trolls gave you a key, what is it?");
            }
        }
    }

    public void map (String name) { //method to find the map

        Scanner scan=new Scanner(System.in);

        System.out.println("The griffen has allowed you to enter the ruins, you must find the map ");
        System.out.println("The griffen must not know why you are here, it will not let you take the map.");
        System.out.println("Keep moving forward into the ruins. Press 'f' to find the map.");

        char command=scan.next().charAt(0);
        scan.nextLine();   //extra scan.nextLine() so that a line is not skipped

        while (command!='f') {  //loop will continue until the user enters the correct command
            
            if (command=='e') { //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }
            else {
                System.out.println("\nOops! Invalid command. Press 'f' to find the map");
                command=scan.next().charAt(0);
            }
            
        }
        
        System.out.println("You did it, you found the map " + name);
        System.out.println("Let's leave before the griffin finds out\n");

    }

    public void battle (String name) {  //method to fight the griffin

        Scanner scan=new Scanner(System.in);

        System.out.println("Ohh no! it found out. It will attack you...");

        System.out.println("Press 'd' to defend yourself from the claws of the griffin using your sword");
        System.out.println("       _____,    _..-=-=-=-=-====--,\n" + //
                    "     _.'a   /  .-',___,..=--=--==-'`\n" + //
                    "    ( _     \\ /  //___/-=---=----'\n" + //
                    "     ` `\\    /  //---/--==----=-'\n" + //
                    "  ,-.    | / \\_//-_.'==-==---='\n" + //
                    " (.-.`\\  | |'../-'=-=-=-=--'\n" + //
                    "  (' `\\`\\| //_|-\\.`;-~````~,        _\n" + //
                    "       \\ | \\_,_,_\\.'        \\     .'_`\\\n" + //
                    "        `\\            ,    , \\    || `\\\\\n" + //
                    "          \\    /   _.--\\    \\ '._.'/  / |\n" + //
                    "          /  /`---'   \\ \\   |`'---'   \\/\n" + //
                    "         / /'          \\ ;-. \\\n" + //
                    "jgs   __/ /           __) \\ ) `|\n" + //
                    "    ((='--;)         (,___/(,_/");

        char command=scan.next().charAt(0);
        scan.nextLine();   //extra scan.nextLine() so that a line is not skipped

        while (command!='d') {  //loop will continue until the user enters the correct command  
            if (command=='e') { //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }
            else {
                System.out.println("\nOops! Invalid command. Press 'd' to defend");
                command=scan.next().charAt(0);
            }
        }

        System.out.println("A griffin's power lies within its tail. The only way to survive is to cut the tail with your sword. Press 'a' to attack.");

        command=scan.next().charAt(0);
        scan.nextLine();   //extra scan.nextLine() so that a line is not skipped

        while (command!='a') {  //loop will continue until the user enters the correct command
            if (command=='e') { //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye."); 
                System.exit(0);
            }
            else {
                System.out.println("\nOops! Invalid command. Press 'a' to attack");
                command=scan.next().charAt(0);
            }
        }
        
        System.out.println("So close, the griffin dodged it." + name + ", you need to use all your strength to defeat the Griffin. Press 'a' to attack again.");
        command=scan.next().charAt(0);
        scan.nextLine();   //extra scan.nextLine() so that a line is not skipped

        while (command!='a') {  //loop will continue until the user enters the correct command
            if (command=='e') { //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }
            else {
                System.out.println("\nOops! Invalid command. Press 'a' to attack again");
                command=scan.next().charAt(0);
            }
        }

        System.out.println("Welldone! The giffen's tail is now cut, it is defeated. But the tail will grow back soon. Hurry up and leave.\n");
        System.out.println("Its okay, we are safe now. We are far from the ruins. Read the map and find the location of the  Press 'r'");
        command=scan.next().charAt(0);
        scan.nextLine();   //extra scan.nextLine() so that a line is not skipped

        while (command!='r') {  //loop will continue until the user enters the correct command
            if (command=='e') { //command to exit game when user presses e
                System.out.print("\nLogging Out! Good Bye.");
                System.exit(0);
            }
            else {
                System.out.println("\nOops! Invalid command. Press 'r' to read the map");
                command=scan.next().charAt(0);
            }
        }
    }
}  

