package Inheritance;

public class Prostokat extends Figura {
	double wys=0, szer=0;
	Punkt punkt = new Punkt(0d,0d);
	String kolor = "Biały";

	public Prostokat(double wys, double szer){
		this.wys = wys;
		this.szer = szer;
	}
	public Prostokat(double wys, double szer, String kolor){
		super(kolor);
		this.wys = wys;
		this.szer = szer;
			
	}

	public double getPowierzchnia() {
        return (szer * wys);
    }
    
    public void przesun(float x, float y) {
		punkt.x = x;
		punkt.y = y;
	}
	public String opis() {
		return super.opis();
	}
}