package Figury;

public class Szescian {
    private double bok;
    private double pole;
    private double objetosc;
    public Szescian(double bok) {
        this.bok = bok;
    }
    private void obliczPole() {
        this.pole = 6d*Math.pow(bok,2);
    }
    private void obliczObjetosc() {
        this.objetosc = Math.pow(bok,3);
    }
    public void wyswietlDane() {
        System.out.println("Nazwa: Sześcian");
        System.out.println("Bok: " + bok);
        obliczPole();
        System.out.println("Pole: " + pole);
        obliczObjetosc();
        System.out.println("Objętość: " + objetosc);
    }
}
