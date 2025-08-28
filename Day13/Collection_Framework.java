package Day13;

import java.util.ArrayList;

public class Collection_Framework {
    /*
     * Collection_Framework is a Set Classes,interface and algorithms that provides
     * unified Architecture for Storing and Manipulation of collection of data
     * or it is like Api
     */
    public static void main(String[] args) {
        // Generic
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        System.out.println(al);
        try {
            System.out.println(1 / 0); // unexpected line
        } catch (Exception e) {
            System.out.println(e);
        }
        al.add(3);
        System.out.println(al);
    }
}
