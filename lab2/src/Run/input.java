package Run;

import java.util.Scanner;

public class input {
    Scanner scan = new Scanner(System.in);
    public int iInput(String msg) {
        System.out.println(msg != null ? msg : "");
        return scan.nextInt();
    }
    public float fInput(String msg) {
        System.out.println(msg != null ? msg : "");
        return scan.nextFloat();
    }
    public boolean bInput(String msg) {
        System.out.println(msg != null ? msg : "");
        return scan.nextBoolean();
    }
}
