package Inheritance;

public class Kwadrat extends Prostokat{
    double wys=0, szer=wys;
    Punkt punkt;
    String kolor;

    public Kwadrat(double wys, double szer, String kolor) {
        super(wys, szer, kolor);
    }

    public double getWys() {
        return wys;
    }

    public void setWys(double wys) {
        this.wys = wys;
    }

    public double getSzer() {
        return szer;
    }

    public void setSzer(double szer) {
        this.szer = szer;
    }

    public Punkt getPunkt() {
        return punkt;
    }

    public void setPunkt(Punkt punkt) {
        this.punkt = punkt;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    public String opis() {
        return super.opis();
    }
}
