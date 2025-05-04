import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String text = input.nextLine();

        text = text.toLowerCase().replaceAll("[.,!?;:] "," ");

        String[] words = text.split("\\s++");

        Map<String,Integer> wordMap = new HashMap<>();

        for (String word: words) {
            wordMap.put(word,wordMap.getOrDefault(word,0)+1);
        }
        System.out.println("\nLiczba wystąpień słów: \n");
        for (Map.Entry<String,Integer> entry: wordMap.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}