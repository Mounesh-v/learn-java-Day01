package Day9;

public class Loops {
    /*
     * Loops In Java
     * 1.For Loop
     * 2.While Loop
     * 3.Do-While Loop--> It Runs Atleast Once
     * 4.for Each Loop
     */

    public static void main(String[] args) {
        // 1.For loop
        System.out.println("------------------------");
        System.out.println("!.For Loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
        System.out.println("------------------------");
        // 2.while Loop
        System.out.println("2.While Loop");
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num++;
        }

        System.out.println("------------------------");
        // 3.do-While Loop
        System.out.println("3.do-while Loop");
        int a = 100;
        do {
            System.out.println(a);
            a++;
        } while (a <= 105);
        System.out.println("------------------------");
        // 4.for Each Loop
        System.out.println("4.for Each Loop");
        int arr[] = { 0, 1, 2, 3, 4, 5 };
        System.out.println("Method1");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("Method2");

        for (int e : arr) {
            System.out.println(e);
        }

        // Nested Loop
        System.out.println("Nested Loops Example:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Labeled Loop
        System.out.println("\nLabelled Loops Example:");

        outer: // label for outer loop
        for (int i = 1; i <= 3; i++) {
            inner: // label for inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Break with Nested Loop
        System.out.println("\nBreak with Nested Loops:");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2)
                    break; // exits inner loop
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        // Continue with Nested Loop
        System.out.println("\nContinue with Nested Loops:");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2)
                    continue; // skips when j=2
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Labeled Break
        System.out.println("\nLabelled Break Example:");

        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2)
                    break outer; // exits outer loop completely
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Labeled Continue
        System.out.println("\nLabelled Continue Example:");

        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2)
                    continue outer; // skips to next iteration of outer loop
                System.out.println("i = " + i + ", j = " + j);
            }
        }

    }
}
