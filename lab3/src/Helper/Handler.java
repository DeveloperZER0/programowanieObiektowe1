package Helper;

import Tasks.RunTask;

public class Handler {
    public void run() {
        RunTask task = new RunTask();
        Input input = new Input();
        System.out.println("Wybierz zadanie (od 1 do 5): ");
        switch(input.readInt()) {
            case 1:
                System.out.printf("Średnia punktów studentów wynosi: %f",task.studentMean(input.readInt()));
                break;
            case 2:
                task.posNegDiff();
                break;
            case 3:
                System.out.println("Podaj długość ciągu: ");
                float[] arr = new float[input.readInt()];
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("Podaj liczbę zmiennoprzecinkową: ");
                    arr[i] = input.readFloat();
                }
                System.out.println(task.sumOfEven(arr));
                break;
            case 4:
                System.out.println("Podaj ilość liczb do losowania: ");
                System.out.println(task.randomNumbers(input.readInt()));
                break;
            case 5:
                System.out.println("Podaj ciąg znaków do sprawdzenia: ");
                System.out.printf("Czy ciąg znaków jest palindromem: %b",task.isPalindrome(input.readString()));
                break;
            default:
                break;
        }
    }

}
