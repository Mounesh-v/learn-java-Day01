package Day7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        // System.out.println(args[0]);//Command line args
        // Using Scanner 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Integer Number");
        int a = scan.nextInt();
        System.out.println("Enter a Floating Number");
        float b = scan.nextFloat();
        System.out.println("Entered Number = "+a);
        System.out.println("Entered Floating Number = "+b);

        System.out.println("--------------------");
        System.out.print("Enter a String ");
        String str = scan.next(); //Take only First token after space it will not including string
        String full_str = scan.nextLine(); //Take only Second token after space it will not including string
        System.out.println("Output - "+str);  
        System.out.println("Output - "+full_str);  
        
        System.out.println("--------------------");
        System.out.println("Enter a Character");
        char ch = scan.next().charAt(0);
        System.out.println("Character = "+ch);
        

        /*  Using BufferedReader Classes
         * This will be Used in Files Reading
        */

        /*Using GUI
         * This will be used in Client side 
         */

         System.out.println(new Date());//For Printing Current Date
    }
}
