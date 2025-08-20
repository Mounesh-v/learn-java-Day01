package Day5;

public class AdvanceCasting {

    /*
     * Advance Typecasting
     * 
     * 1. Primitive To Non-Primitive
     *    int, float, long, double ---> String
     * 
     * 2. Non-Primitive To Primitive
     *    String ---> int, float, long, double (e.g., via parsing)
     */
    public static void main(String[] args) {
        // Primitive to Non-Primitive
        int a = 2;
        float f1 = 22.4f;

        String str = String.valueOf(a);   // int -> String
        String str1 = String.valueOf(f1); // float -> String

        // Output with concatenation (default behavior)
        System.out.println("This Is an Integer " + a + a);       // Concatenates → 22
        System.out.println("This Is a String " + str + str);     // Concatenates → 22
        System.out.println("This is a Floating value " + f1 + f1); // Concatenates → 22.422.4
        System.out.println("This is a String value " + str1 + str1); // Concatenates → 22.422.4

        // Output with arithmetic (correct calculation)
        System.out.println("This Is an Integer (Sum) " + (a + a));      // 4
        System.out.println("This is a Floating value (Sum) " + (f1 + f1)); // 44.8

        // Non-Primitive to Primitive
        String myStr = "20";
        int num = Integer.parseInt(myStr);// Wrapper Classes
        float fnum = Float.parseFloat(myStr);
        double dnum = Double.parseDouble(myStr);
        long lnum = Long.parseLong(myStr);
        byte bnum = Byte.parseByte(myStr);
        System.out.println("This is a String "+ (myStr+myStr));
        System.out.println("This is a Integer "+ (num+num));
        System.out.println("This is a Floating "+ (fnum+fnum));
        System.out.println("This is a Double "+ (dnum+dnum));
        System.out.println("This is a Long "+ (lnum+lnum));
        System.out.println("This is a Byte "+ (bnum+bnum));
    }
}
