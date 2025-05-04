package Figury;

public class Prostokat {
    private double bok_a;
    private double bok_b;
    private double pole;
    private double obwod;
    public Prostokat(double bok_a, double bok_b) {
        this.bok_a = bok_a;
        this.bok_b = bok_b;
    }
    private void obliczPole() {
        this.pole = bok_a * bok_b;
    }
    private void obliczObwod() {
        this.obwod = 2d*bok_a + 2d*bok_b;
    }
    public void wyswietlDane() {
        System.out.println("Nazwa: Prostokąt");
        System.out.println("Bok A: " + bok_a + ", Bok B: " + bok_b);
        obliczPole();
        System.out.println("Pole: " + pole);
        obliczObwod();
        System.out.println("Obwód: " + obwod);
    }
}
