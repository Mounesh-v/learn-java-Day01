package Day11;

import java.util.Scanner;

public class Array {
    /*
     * Array --> Set Of Similar Type of data , data_Type Arr[] = {value1,value2}
     * 
     */
    public static void main(String[] args) {
        // Types Of Arrays
        int arr[] = { 10, 20, 30, 40, 50 };// Initialization & 1-D array
        int[][] myArr = { { 20, 30 }, { 40, 50 } };// 2-D array
        int[][][] myArr2 = { { { 20, 30, 40 }, { 30, 40, 50 } } };// 3-D array
        System.out.println(arr[0]);
        System.out.println(myArr[0][0]);
        System.out.println(myArr2[0][0][0]);

        // Input & storing Array OR Dynamic Array
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Size of an Array");
        int size = scan.nextInt();
        int dynamicArray[] = new int[size];
        dynamicArray[0] = 10;

        // System.out.println(dynamicArray[0]+","+dynamicArray[1]);

        // Input an Array Using For-loop
        for (int i = 0; i < dynamicArray.length; i++) {
            System.out.print("Enter a value of array");
            dynamicArray[i] = scan.nextInt();
        }

        // Printing an Array Using For-loop
        //   for (int i = 0; i < dynamicArray.length; i++) {
        //   System.out.println(dynamicArray[i]);
        //   }
         
        // OR
        for (int i : dynamicArray) {
            System.out.println(i);
        }

        // Jagged array
        // Rows are fix but column are not fix
        int[][] jaggedArray = new int[2][];
        jaggedArray[0] = new int[]{1,2,3};
        jaggedArray[1] = new int[]{1,2};
    }
}
