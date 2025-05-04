package Handler;

import Classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    Scanner scanner = new Scanner(System.in);
    public void RunMain() {
        List<Pojazd> pojazdy = new ArrayList<>();
        pojazdy.add(new Samochod("S100","Toyota"));
        pojazdy.add(new SamochodElektryczny("TE001","Tesla"));
        pojazdy.add(new RowerElektryczny("RE001","Romet"));


        while(true) {
            System.out.println("\n ----------- Menu -----------");
            System.out.println(" 1. Wyświetl dostępne pojazdy");
            System.out.println(" 2. Wypożycz pojazd");
            System.out.println(" 3. Zwróc pojazd");
            System.out.println(" 4. Naładuj pojazd elektryczny");
            System.out.println(" 5. Wyjście");
            System.out.println(" Wybierz: ");
            int wybor = scanner.nextInt();
            scanner.nextLine();
            switch(wybor) {
                case 1:
                    viewPojazdy(pojazdy);
                    break;
                case 2:
                    wypozyczPojazd(pojazdy);
                    break;
                case 3:
                    zwrocPojazd(pojazdy);
                    break;
                case 4:
                    naladujPojazd(pojazdy);
                    break;
                case 5:
                    closeProgram();
                    break;

                default:
                    System.out.println("Błędne dane");
            }
        }

    }

    private void closeProgram() {
        System.out.println("Dziękuję za skorzystanie z naszej wypożyczalni!");
        scanner.close();
    }

    private void naladujPojazd(List<Pojazd> pojazdy) {
        System.out.println("Podaj ID pojazdu do naładowania: ");
        String idWyp = scanner.nextLine();
        for(Pojazd p : pojazdy) {
            if (p.getId().equals(idWyp) && p instanceof Elektryczny) {
                System.out.println("Poziom naładowania: "+((Elektryczny) p).poziomNaladowania());
                ((Elektryczny) p).naladuj();
                System.out.println("Pojazd został naładowany");
            }
        }
    }

    private void zwrocPojazd(List<Pojazd> pojazdy) {
        System.out.println("Podaj ID pojazdu do zwrócenia: ");
        String idWyp = scanner.nextLine();
        for(Pojazd p : pojazdy) {
            if (p.getId().equals(idWyp) && !p.isCzyDostepny()) {
                p.zwroc();
                System.out.println("Pojazd został zwrócony");
            }
        }
    }

    private void wypozyczPojazd(List<Pojazd> pojazdy) {
        System.out.println("Podaj ID pojazdu do wypożyczenia: ");
        String idWyp = scanner.nextLine();
        for(Pojazd p : pojazdy) {
            if (p.getId().equals(idWyp) && p.isCzyDostepny()) {
                System.out.println("Na ile godzin chcesz wypozyczyć pojazd: ");
                int godziny = scanner.nextInt();
                p.wypozycz();
                System.out.println("Koszt wypozyczenia "+p.obliczKoszt(godziny)+"zł");
            }
        }
    }

    private void viewPojazdy(List<Pojazd> pojazdy) {
        for (Pojazd p : pojazdy) {
            System.out.println("ID: "+p.getId()+", Model: "+p.getModel()+", Dostępność: "+(p.isCzyDostepny() ? "Dostępny" : "Zajęty"));
        }
    }
}
