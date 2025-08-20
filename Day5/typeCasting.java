package Day5;

/*TypeCasting Order
 *
 * 1.DownCasting or ManualCasting or NarrowCasting
 * Here Data loss Will happen
 * double->float->long->int->char->short->byte
 * 
 * 2.UpCasting or Automatic Casting or WideCasting
 * Here No Data loss Will happen
 * double<-float<-long<-int<-char<-short<-byte
*/

public class typeCasting {
    public static void main(String[] args) {
        System.out.println("Hi");
        // Automatic Casting
        float fvar = 23.24f;
        double dvar = fvar;
        System.out.println("Automatic Casting");
        System.out.println(fvar);
        System.out.println(dvar);
        // ManualCasting
        // float fvar = 23.24f;
        // double dvar = fvar;
        long lvar =(long) fvar;
        System.out.println("Manual Casting");
        System.out.println(fvar);
        System.out.println(lvar);
    }

}