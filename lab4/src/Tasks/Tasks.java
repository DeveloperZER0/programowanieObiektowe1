package Tasks;

import Helper.Input;
import Helper.RandomNum;

public class Tasks {
    Input input = new Input();
    public void arrSumMean(float[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("For:");
        System.out.printf("Suma: %f\nŚrednia: %f\n",sum,sum / arr.length);
        sum = 0;
        for(float n : arr) {
            sum += n;
        }
        System.out.println("Foreach:");
        System.out.printf("Suma: %f\nŚrednia: %f\n",sum, sum / arr.length);
    }
    public void everySecondElOfArr(float[] arr1, float[] arr2) {
        System.out.println("\nCiąg 1:");
        for (int i = 0; i < arr1.length; i++) {
            if(i%2 == 1) {
                System.out.print(arr1[i]+" ");
            }
        }
        System.out.println("\nCiąg 2:");
        for (int i = 0; i < arr2.length; i++) {
            if(i%2 == 1) {
                System.out.print(arr2[i]+" ");
            }
        }
    }
    public void arrOfString(String[] arr) {
        for (String s : arr) {
            System.out.print(s.toUpperCase()+" ");
        }
    }
    public void reverseStringArray(String[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            String reverse="";
            for(int j=arr[i].length()-1; j>=0; j--) {
                reverse = reverse + arr[i].charAt(j);
            }
            System.out.println(reverse);
        }
    }
    public float[] bubbleSort() {
        float[] arr = new float[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Podaj liczbę zmiennoprzecinkową: ");
            arr[i] = input.readFloat();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public void factorOfArray() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Podaj liczbę zmiennoprzecinkową: ");
            arr[i] = input.readInt();
        }
        for (int n : arr) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Silnia z "+n+" to: "+fact);
        }
    }
    public boolean matchingElInArray(String[] arr1, String[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if(!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
