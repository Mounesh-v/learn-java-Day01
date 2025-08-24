package Day9;

public class break_Comment {
    public static void main(String[] args) {
        System.out.println("continue");
        for (int i = 0; i <10; i++) {
            if(i==5) continue; //Skip the Value
            System.out.println(i);
        }
        System.out.println("Break");
        for (int j = 0; j <10; j++) {
            if(j==5) break; //Stop at that value
            System.out.println(j);
        }
    }
}
