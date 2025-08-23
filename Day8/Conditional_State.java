package Day8;

import java.util.Scanner;

public class Conditional_State {
    /*Conditional Statement
     * 1.If Statement
     * 2.If-else Statement
     * 3.Else-If Statement
     * 4.Switch Statement
     */
 public static void main(String[] args) {
    int number = 20;

    // 1.If Statement
    System.out.println("1.If Statement");
    if (number>0) {
        System.out.println("It is a Positive Integer");
    }

    System.out.println("---------------------------------");
    
    //2.If-else Statement
    System.out.println("2.If-else Statement");
    if(number > 0){
        System.out.println("It is a Positive Integer");
    }else{
        System.out.println("It is Negative Integer");
    }
    System.out.println("---------------------------------");

    // 3.Else-If Statement
    System.out.println("3.Else-If Statement");
    int marks = 70;
    if (marks<35) {
        System.out.println("Fail");
    }
    else if(marks>35){
        System.out.println("Pass");
    }
    else{
        System.out.println("Excellent");
    }

    System.out.println("---------------------------------");

    // 4.Switch Statement
    System.out.println("4.Switch Statement");
    System.out.println("Enter a Number 1-7 To get Day = ");
    Scanner scan = new Scanner(System.in);
    int day = scan.nextInt();
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Satrday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
    
        default:
        System.out.println("Invalid Day");
            break;
    }

    System.out.println("---------------------------------");
 }   
}
