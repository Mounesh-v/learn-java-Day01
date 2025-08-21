package Day6;

public class operators {
    /*
     * Operators
     * 1.Assignment Operators(=)
     * 2.Arithematic Operators(+,-,*,/,%)
     * 3.Relational Operators(>,<,>=,<=,==,===)
     * 4.Logical Operators
     * 5.Unary Operators(++,--)
     * 6.Ternary Operators
     * 7.Bitwise Operators
     * 8.Shift Operators
     * << -- Left Shift (num*2^(shift))
     * >> -- Right Shift (num/2^(shift))
     * 9.Instance Of
     */
    public static void main(String[] args) {
        // 1. Assignment Operator
        int a = 2;
        int b = 3;

        // 2. Arithmetic Operators
        System.out.println("1. Arithmetic Operators");
        System.out.println("The a+b = " + (a + b));
        System.out.println("The a-b = " + (a - b));
        System.out.println("The a*b = " + (a * b));
        System.out.println("The a/b = " + (a / b));
        System.out.println("The a%b = " + (a % b));
        System.out.println("-----------------------------");

        // 3. Relational Operators
        System.out.println("2. Relational Operators");
        System.out.println("Equals to: " + (a == b));
        System.out.println("Not Equals to: " + (a != b));
        System.out.println("Greater: " + (a > b));
        System.out.println("Lesser: " + (a < b));
        System.out.println("Greater or Equal: " + (a >= b));
        System.out.println("Lesser or Equal: " + (a <= b));
        System.out.println("-----------------------------");

        // 4. Logical Operators (&&, ||, !)
        boolean andValue = (3 > 2) && (4 > 3);
        boolean orValue = (3 > 2) || (4 < 3);
        boolean notValue = !(2 == 3);

        System.out.println("3. Logical Operators");
        System.out.println("Logical AND: " + andValue);
        System.out.println("Logical OR: " + orValue);
        System.out.println("Logical NOT: " + notValue);
        System.out.println("-----------------------------");

        // 5. Unary Operators (++ , --)
        System.out.println("4. Unary Operators");
        System.out.println("Post Increment (a++): " + (a++)); // prints then increments
        System.out.println("Pre Increment (++b): " + (++b)); // increments then prints
        System.out.println("Post Decrement (a--): " + (a--)); // prints then decrements
        System.out.println("Pre Decrement (--b): " + (--b)); // decrements then prints
        System.out.println("-----------------------------");

        // 6. Ternary Operator
        System.out.println("5. Ternary Operator");
        boolean ternaryResult = (2 < 3) ? true : false;
        System.out.println("Ternary Result: " + ternaryResult);
        System.out.println("-----------------------------");

        // 7. Bitwise Operators
        int x = 5;  // 0101
        int y = 3;  // 0011
        System.out.println("6. Bitwise Operators");
        System.out.println("x & y = " + (x & y));  // AND
        System.out.println("x | y = " + (x | y));  // OR
        System.out.println("x ^ y = " + (x ^ y));  // XOR
        System.out.println("~x = " + (~x));        // NOT
        System.out.println("-----------------------------");

        // 8. Shift Operators
        int num = 8; // 1000 in binary
        System.out.println("7. Shift Operators");
        System.out.println("num << 2 = " + (num << 2)); // Left shift (8*2^2 = 32)
        System.out.println("num >> 2 = " + (num >> 2)); // Right shift (8/2^2 = 2)
        System.out.println("-----------------------------");

        // 9. instanceof Operator
        System.out.println("8. instanceof Operator");
        String text = "Hello";
        System.out.println("Is text an instance of String? " + (text instanceof String));

    }
}
