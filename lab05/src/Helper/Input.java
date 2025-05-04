package Helper;

import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);
    public int getInt() {
        return sc.nextInt();
    }
    public String getString() {
        return sc.next();
    }
    public double getDouble() {
        return sc.nextDouble();
    }
    public float getFloat() {
        return sc.nextFloat();
    }
}
