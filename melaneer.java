import java.util.*;
public class melaneer {
      
    static int choice;

    melaneer (int x) {   //constructor to initize high score to zero
        choice=x;
    }
    public static void main (String[] args) {

        Scanner scan=new Scanner(System.in);

        settings settings=new settings();  // object to call methods from 'settings' class
        melaneer melaneer=new melaneer(0);  // oblect to initialize values in constructor
        login login=new login();  //object to call methods from 'login' class
        level1 level1=new level1();  //object to call methods from 'level1' class
        level2 level2=new level2(); //oblect to call methods from 'level2' class
        level3 level3=new level3(); //oblect to call methods from 'level3' class

    // login 
        
        System.out.println("Enter your name");
        String name=scan.nextLine(); 

        System.out.println("Hey " + name + "!" );
        System.out.println("Press 1 for Sign Up");
        System.out.println("Press 2 for Log In");
        choice=scan.nextInt();

        switch (choice) {
            case 1:
                login.registration();
                break;
            case 2:
                login.login();
                break;
            default:
                System.out.println("Invalid choice! try again.");
                break;
        }

        if (login.login()==true) {  //game will only proceed if the login is successful
                
            settings.title(name); //method from 'settings' class
            
            level1.intro (name); //method from 'level1' class
    
            level1.trolls(name);  //method from 'level1' class

            level2.spirits();    //method from 'level2' class 
                    
            level2.griffin(name);  //method from the 'level2' class

            level2.map(name);  //method from 'level2' class
                    
            level2.battle(name);  //method from 'level2' class
        
            level3.finalChallenge(name);  //method from 'level3' class

        }
        else {
            System.out.println("Login failed! Try again");
        }
}
}