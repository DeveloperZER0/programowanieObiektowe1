package RunInput;
import Task.Tasks;
public class Run {

    public void RunTask(){
        Tasks tasks = new Tasks();
        Input input = new Input();

        System.out.println("Laboratorium 1\n");
        System.out.println("Zadanie 1");
        System.out.println("Zadanie 2");
        System.out.println("Zadanie 3");
        System.out.println("Zadanie 4");
        System.out.println("Zadanie 5");
        System.out.println("Zadanie 6");
        System.out.println("Zadanie 7");
        System.out.println("Wybierz zadananie:");

        int wybor = input.InputInt();
        switch (wybor){
            case 1:
                System.out.println(tasks.DataUser());
                break;
            case 2:
                System.out.println("Podaj dwie liczby zmiennoprzecinkowe: ");
                tasks.SumDiffMult(input.InputFloat(), input.InputFloat());
                break;
            case 3:
                System.out.println("Podaj liczbę zmiennoprzecinkową: ");
                System.out.println("Czy liczba jest parzysta: " + tasks.isEven(input.InputFloat()));
                break;
            case 4:
                System.out.println("Podaj liczbę zmiennoprzecinkową: ");
                System.out.println("Czy liczba jest podzielna przez 3 i 5: " + tasks.isDivisible(input.InputFloat()));
                break;
            case 5:
                System.out.println("Podaj liczbę zmiennoprzecinkową: ");
                System.out.println("Sześcian liczby: " + tasks.Cubed(input.InputFloat()));
                break;
            case 6:
                System.out.println("Podaj liczbę zmiennoprzecinkową: ");
                System.out.println("Pierwiastek kwadratowy: " + tasks.Sqrt(input.InputFloat()));
                break;
            case 7:
                System.out.println("Podaj trzy liczby zmiennoprzecinkowe: ");
                System.out.println("Czy tworzą trójkąt prostokątny: "+tasks.isTriangle(input.InputFloat(), input.InputFloat(), input.InputFloat()));
                break;
            default:
                System.out.println("Nie ma takiego zadania");

        }
    }

}
