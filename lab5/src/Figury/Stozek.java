package Figury;

public class Stozek {
    private double promien;
    private double tworzaca;
    private double wysokosc;
    private double pole;
    private double objetosc;

    public Stozek(double promien, double tworzaca, double wysokosc) {
        this.promien = promien;
        this.tworzaca = tworzaca;
        this.wysokosc = wysokosc;
    }
    private void obliczPole() {
        this.pole = Math.PI*promien*(promien+tworzaca);
    }
    private void obliczObjetosc() {
        this.objetosc = 1d/3d*Math.PI*Math.pow(promien, 2)*wysokosc;
    }
    public void wyswietlDane() {
        System.out.println("Nazwa: Stożek");
        System.out.println("Promień: " + promien);
        System.out.println("Tworząca: " + tworzaca);
        System.out.println("Wysokość: " + wysokosc);
        obliczPole();
        System.out.println("Pole: " + pole);
        obliczObjetosc();
        System.out.println("Objętość: " + objetosc);
    }
}
