package Figury;

public class Kwadrat {
    private double bok;
    private double pole;
    private double obwod;

    public Kwadrat(double bok) {
        this.bok = bok;
    }
    private void obliczPole() {
        this.pole = Math.pow(bok, 2);
    }
    private void obliczObwod() {
        this.obwod = 4d*bok;
    }
    public void wyswietlDane() {
        System.out.println("Nazwa: Kwadrat");
        System.out.println("Bok: " + bok);
        obliczPole();
        System.out.println("Pole: " + pole);
        obliczObwod();
        System.out.println("Obwód: " + obwod);
    }
}
