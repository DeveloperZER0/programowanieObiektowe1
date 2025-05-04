package Figury;

public class Prostopadloscian {
    private double bok_a;
    private double bok_b;
    private double wysokosc;
    private double pole;
    private double objetosc;
    public Prostopadloscian(double bok_a, double bok_b, double wysokosc) {
        this.bok_a = bok_a;
        this.bok_b = bok_b;
        this.wysokosc = wysokosc;
    }
    private void obliczPole() {
        this.pole = 2d*(bok_a*bok_b+bok_a*wysokosc+bok_b*wysokosc);
    }
    private void obliczObjetosc() {
        this.objetosc = bok_a*bok_b*wysokosc;
    }
    public void wyswietlDane() {
        System.out.println("Nazwa: Prostopadłościan");
        System.out.println("Bok A: " + bok_a+", Bok B: " + bok_b+", Wysokość: " + wysokosc);
        obliczPole();
        System.out.println("Pole: " + pole);
        obliczObjetosc();
        System.out.println("Objętość: " + objetosc);
    }
}
