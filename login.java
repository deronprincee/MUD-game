import java.io.*;
import java.util.*;
  
public class login { 

    //public static final means that the variable will be accessible to all the casses and all the instances of a class. Once initialised, the value will not change
    public static final String FILE_NAME = "User Data.txt";  //to store the name of the file

    public void registration() {  //method to store username and password in the text file
        try {
            FileWriter f1=new FileWriter(FILE_NAME, true);
            BufferedWriter b1=new BufferedWriter(f1);

            Scanner scan=new Scanner(System.in);

            System.out.println("\nSet username");
            String username=scan.next();

            System.out.println("\nSet password");
            String password=scan.next();

            b1.write(username + " " + password);
            b1.newLine();
            b1.close();

            System.out.println("User Registered successfully");
        }
        catch (IOException e) {
            System.out.println("Error!");
        }
    }

    public boolean login () {  //method to compare the entered username and password with the data in the text file
        boolean flag=false;
        try {
            Scanner scan=new Scanner(System.in);
            Scanner fileScan=new Scanner(new File(FILE_NAME));

            System.out.println("\nEnter username");
            String username=scan.nextLine();
            System.out.println("\nEnter password");
            String password=scan.nextLine();

            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                String[] userData = line.split(" ");

                if (userData.length==2 && userData[0].equals(username) && userData[1].equals(password)) {
                    System.out.println("Login Successful!\n");
                    flag=true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Incorrect username or password");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return flag;
    }
}
