package Helper;

import java.util.Random;

public class RandomNum {
    Random rand = new Random();
    public int randInt(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }
    public float randFloat(float min, float max) {
        return rand.nextFloat() * (max - min) + min;
    }
    public int[] randIntArray(int min, int max, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = randInt(min, max);
        }
        return arr;
    }
    public float[] randFloatArray(float min, float max, int n) {
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = randFloat(min, max);
        }
        return arr;
    }
}
