package Day11;

public class Strings {
    /*
     * Strings
     * 1.str2 != str3 because it is checking the instance (address) ,str2 will be
     * Point to the string in an stringpool & str3 will have create new String
     * Instance(address), That is way Strings are Immutable(we can't modify)
     * 2. (==) didn't compare the content but it will be comapare the
     * Instance(address)
     * 3.For Comparing two Strings We can Using the ".equals" method
     * 4.only Stringbuffer and stringbuilder is Mutable(change/update)
     * 5.String Buffer is supported multithreading(executing multiple tasks
     * (threads) simultaneously within a program)
     */
    public static void main(String[] args) {
        char[] charArr = { 'a', 'b', 'c' };
        System.out.println(charArr);

        int[] arr = { 1, 2, 3 };
        System.out.println(arr);

        String str = "ABC";
        System.out.println(str.charAt(0));

        // Ways To Create an String
        System.out.println("Ways To Create an String");
        char[] str1 = { 'm', 'o', 'o', 'n' };
        String str2 = "Moon";
        String str3 = new String("Sun");// new memory will be allocated using new
        StringBuffer str4 = new StringBuffer("sun");
        StringBuilder str5 = new StringBuilder("Original");
        System.out.println(str1[0] + "," + str2 + "," + str3 + "," + str4 + "," + str5);
        System.out.println(str4.append(" moon"));
        str5.deleteCharAt(0);
        // str5.delete(0, 4);
        System.out.println("deleted Char" + str5);
    }
}
