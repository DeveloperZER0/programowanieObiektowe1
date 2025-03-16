package Helper;

import java.util.Scanner;

public class Input {
    Scanner in = new Scanner(System.in);
    public int readInt() {
        return in.nextInt();
    }
    public float readFloat() {
        return in.nextFloat();
    }
    public String readString() {
        return in.next();
    }
}
