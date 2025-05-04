package Figury;

public class Kolo {
    private double promien;
    private double pole;
    private double obwod;
    public Kolo(double promien) {
        this.promien = promien;
    }
    private void obliczPole() {
        this.pole = Math.pow(promien,2)*Math.PI;
    }
    private void obliczObwod() {
        this.obwod =  2d*Math.PI*promien;
    }
    public void wyswietlDane() {
        System.out.println("Nazwa: Koło");
        System.out.println("Promień: " + promien);
        obliczPole();
        System.out.println("Pole: " + pole);
        obliczObwod();
        System.out.println("Obwód: " + obwod);
    }
}
