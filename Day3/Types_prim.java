package Day3;
// primitive datatypes=> 1.boolean 2.Numeric(a.Char b.Integral)

// non-Premitive datatype => 1.user-defined(Array,Linkd list,etc..) 2.Pre-Built (Stack,set,Queue)

public class Types_prim {
    public static void main(String[] args) {
        // Premitive => Starts with small letters like byte,long,int,float,etc..
        byte bvar = 127; // size=>8bits , byte => 1 , Range=>-128e to 127
        short svar = 32767; // size=>16bits , byte => 2 , Range=>-32,768 to 32,767
        long lvar = 20; // size=>64bits , byte => 8 , Range=>-9,223,372,036,854,775,808 to
                        // 9,223,372,036,854,775,807
        int var1 = 15; // size=>32bits , byte => 4 , Range=>-2,147,483,648 to 2,147,483,647
        float var2 = 20.26f; // size=>32bits , byte => 4 , Range=>Upto 7 decimal
        double var3 = 20.587249; // size=>64bits , byte => 8 , Range=>Upto 16 decimal
        char letter = 'A'; // quoets must be single //size=>16bits , byte => 2 , Range=>0 to 255(All Ascii
                           // values)
        boolean bl = true; // size=>1bit , byte => 1/8 , Range=>true to false
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(bvar);
        System.out.println(svar);
        System.out.println(lvar);
        System.out.println(letter);
        System.out.println(bl);

        // Non-Premitive => Starts with Captial Letters like String,ArrayList,etc..
        String name = "Non-primitive";// quoets must be Double
        System.out.println(name);
    }
}
