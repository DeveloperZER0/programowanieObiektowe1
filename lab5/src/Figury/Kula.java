package Figury;

public class Kula {
    private double promien;
    private double pole;
    private double objetosc;
    public Kula(double promien) {
        this.promien = promien;
    }
    private void obliczPole() {
        this.pole = 4d*Math.pow(promien,2)*Math.PI;
    }
    private void obliczObjetosc() {
        this.objetosc = 4d/3d*Math.pow(promien,3)*Math.PI;
    }
    public void wyswietlDane() {
        System.out.println("Nazwa: Kula");
        System.out.println("Promień: " + promien);
        obliczPole();
        System.out.println("Pole: " + pole);
        obliczObjetosc();
        System.out.println("Objętość: " + objetosc);
    }
}
