package Day10;

public class Methods {
    /*
     * Types of Methods
     * "Methods are Written in Outside the Main()"
     * 1.Bulit-in Methods --> println(),printf(),print(),main(),formate(),etc....
     * 2.User Defined Methods
     * Syntax:
     * int variable_Name(){}
     * 1.Return Type
     * 2.Non-Return Type
     * 3.Return Type With Parameter
     * 4.Non-Return Type With Parameter
     */

    // Non-Return Type WithOut Parameter
    static void voidMethod() {
        System.out.println("void method is Calling");
    }
    // Non-Return Type With Parameter

    static void voidMethodNew(int a) {
        System.out.println("Void Method With Parameter");
    }

    // Return Type WithOut Parameter
    static String withoutReturnPara() {
        return "Return WithOut Paramter";
    }

    // Return Type With Parameter
    static String withReturnPara(int b){
        return "Return With Parameter";
    }

    public static void main(String[] args) {
        // Calling Method
        Methods.voidMethod();
        Methods.voidMethodNew(5);
        String str = Methods.withoutReturnPara();
        String str2 = Methods.withReturnPara(200);
        System.out.println("Hellow");
        System.out.println(str);
        System.out.println(str2);
    }
}
