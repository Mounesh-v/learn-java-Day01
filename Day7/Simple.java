package Day7;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        // Area of circle
        System.out.println("Area Of Circle");
        float pi = 3.1415929f;
        System.out.println("Enter a Radius Value = ");
        Scanner scan = new Scanner(System.in);
        float radius = scan.nextFloat();
        float Area = pi * radius * radius;
        System.out.println("The Area Of Radius = "+Area);
    }
}
