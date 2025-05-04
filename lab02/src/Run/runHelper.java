package Run;

import Task.tasks;

public class runHelper {
    public void runTasks() {
        tasks task = new tasks();
        input input = new input();
        switch (input.iInput("Podaj numer zadania (1-6)")) {
            case 1:
                // zad 1
                task.quadratic(input.fInput("Podaj współczynnik a:"), input.fInput("Podaj współczynnik b:"), input.fInput("Podaj wyraz wolny c:"));
                break;
            case 2:
                // zad 2
                task.func_a(input.fInput("Podaj liczbę zmiennoprzecinkową dla a(x):"));
                task.func_b(input.fInput("Podaj liczbę zmiennoprzecinkową dla b(x):"));
                task.func_c(input.fInput("Podaj liczbę zmiennoprzecinkową dla c(x):"));
                break;
            case 3:
                // zad 3
                task.sort_num(new float[] { input.fInput("Podaj pierwszą liczbę zmiennoprzecinkową"),
                                            input.fInput("Podaj drugą liczbę zmiennoprzecinkową"),
                                            input.fInput("Podaj trzecią liczbę zmiennoprzecinkową")});
                break;
            case 4:
                // zad 4
                System.out.println(task.scenario1(input.bInput("Czy pada?: "), input.bInput("Czy jest autobus?: ")));
            case 5:
                // zad 5
                System.out.println(task.scenario2(input.bInput("Czy jest zniżka?: "), input.bInput("Czy otrzymałeś/aś premię?: ")));
            case 6:
                System.out.println(task.calculator(input.iInput(
                        "Wybierz typ:\n1 - Dodawanie\n2 - Odejmowanie\n3 - Iloczyn\n4 - Iloraz\n5 - Reszta z dzielenia"),
                        input.fInput("Podaj liczbę a:"),
                        input.fInput("Podaj liczbę b:"))
                );

        }




    }
}
