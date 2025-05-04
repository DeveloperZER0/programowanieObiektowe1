import Helper.Input;
import Helper.RandomNum;
import Tasks.Tasks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomNum randomNum = new RandomNum();
        Input input = new Input();
        Tasks tasks = new Tasks();
        while (true) {
            System.out.println("#".repeat(40)+" Menu "+"#".repeat(40));
            System.out.println("1. Program obliczający średnią i sumę tablicy");
            System.out.println("2. Program wypisujący co drugi element dwóch tablic");
            System.out.println("3. Program zamieniający małe litery na duże dla tablicy stringów");
            System.out.println("4. Program odwracający litery w słowie i kolejność słów dla podanej tablicy");
            System.out.println("5. Program sortujący rosnąco 8 podanych liczb");
            System.out.println("6. Program obliczający silnie dla każdego elementu tablicy");
            System.out.println("7. Program porównujący dwie tablice stringów");
            System.out.println("\nWybierz numer zadania: ");
            int n = input.readInt();

            switch (n) {
                case 1:
                    System.out.println("Podaj ilość elementów tablicy: ");
                    tasks.arrSumMean(randomNum.randFloatArray(-1000,1000,input.readInt()));
                    break;
                case 2:
                    float[] arr1 = randomNum.randFloatArray(-1000,1000,10);
                    float[] arr2 = randomNum.randFloatArray(-1000,1000,9);
                    System.out.println("Array1: " + Arrays.toString(arr1));
                    System.out.println("Array2: " + Arrays.toString(arr2));
                    tasks.everySecondElOfArr(arr1, arr2);
                    break;
                case 3:
                    String[] strArr1 = {"ala","ma","kota","a","kot","ma","ale"};
                    tasks.arrOfString(strArr1);
                    break;
                case 4:
                    System.out.println("Podaj 5 słów:");
                    tasks.reverseStringArray(new String[]{input.readString(),input.readString(),input.readString(),input.readString(),input.readString()});
                    break;
                case 5:
                    System.out.println("Posortowany ciąg: "+Arrays.toString(tasks.bubbleSort()));
                    break;
                case 6:
                    tasks.factorOfArray();
                    break;
                case 7:
                    String[] strArr2 = {"ala","ma","kota","a","kot"};
                    String[] strArr3 = {"ala","ma","kota","a","kot"};
                    System.out.println(tasks.matchingElInArray(strArr2, strArr3) ? "Są takie same" : "Są różne");
                    break;
                default:
                    System.out.println("Nie ma takiego numeru");
            }
            System.out.println("Chcesz kontynuować?");
            System.out.println("1 - Tak | 0 - Nie");
            if (input.readInt() != 1) {
                break;
            }
        }
    }
}