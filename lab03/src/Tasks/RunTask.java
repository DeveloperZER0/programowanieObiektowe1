package Tasks;

import Helper.Input;

import java.util.Random;

public class RunTask {
    Input in = new Input();
    Random rand = new Random();
    public float studentMean(int n) {
        float sum = 0;
        int i = 0;
        while (i < n) {
            sum += in.readFloat();
            i++;
        }
        return sum / n;
    }
    public void posNegDiff() {
        int negCount = 0, posCount = 0;
        float negSum = 0, posSum = 0;
        float num;
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę zmiennoprzecinkową: ");
            num = in.readFloat();
            if (num < 0) {
                negCount++;
                negSum += num;
            } else {
                posCount++;
                posSum += num;
            }
        }
        System.out.printf("Ilość dodatnich: %d\nSuma dodatnich: %f\nIlość ujemnych: %d\nSuma ujemnych: %f",posCount,posSum,negCount,negSum);
    }
    public float sumOfEven(float[] arr) {
        float sum = 0;
        for(float n : arr) {
            if (n % 2 == 0) {
                sum += n;
            }
        }
        return sum;
    }
    public float randomNumbers(int n) {
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(56)-10;
        }
        return sumOfEven(arr);
    }
    public boolean isPalindrome(String str) {
        if (str != null && !str.isEmpty()) {
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
