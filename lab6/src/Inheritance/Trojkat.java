package Inheritance;

public class Trojkat extends Figura
{
	double wys=0, podst=0;
	Punkt punkt = new Punkt(0d,0d);
	String kolor = "Biały";

	public Trojkat(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}
	public Trojkat(double wys, double podst, String kolor)
	{
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}
	public String opis() {
		return super.opis();
	}
	
}