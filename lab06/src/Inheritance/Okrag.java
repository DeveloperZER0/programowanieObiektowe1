package Inheritance;

public class Okrag extends Figura{
    Punkt srodek;
    double promien;
    public Okrag() {
        srodek = new Punkt(0d,0d);
        promien = 0d;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = super.punkt;
        this.promien = promien;
    }
    public double getPowierzchnia() {
        return Math.PI*(promien*promien);
    }
    public double getSrednica() {
        return 2*promien;
    }
    public double getPromien() {
        return promien;
    }
    public void setPromien(double p) {
        this.promien = p;
    }
    public boolean wSrodku(Punkt punkt) {
        if(Math.pow((punkt.x-srodek.x),2)+Math.pow((punkt.y-srodek.y),2) <= promien*promien) {
            return true;
        }
        return false;
    }


}
