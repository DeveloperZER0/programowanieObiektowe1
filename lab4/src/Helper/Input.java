package Helper;

import java.util.Scanner;

public class Input {
    Scanner scan = new Scanner(System.in);
    public int readInt() {
        return scan.nextInt();
    }
    public float readFloat() {
        return scan.nextFloat();
    }
    public String readString() {
        return scan.next();
    }
}
