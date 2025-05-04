import Inheritance.*;

public class Main {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt();
        Punkt punkt2 = new Punkt(3.1,8.7);
        Punkt punkt3 = new Punkt(9.7,1.1);

        punkt1.opis();
        punkt1.przesun(3,-3);
        punkt1.opis();

        punkt2.opis();
        punkt2.zeruj();
        punkt2.opis();

        punkt3.opis();

        Figura figura1 = new Figura();
        Figura figura2 = new Figura(punkt3);
        Prostokat prostokat1 = new Prostokat(10d,20d,"Czarny");
        Trojkat trojkat1 = new Trojkat(10d,5d,"Czerwony");
        Okrag okrag1 = new Okrag(punkt3,10d);

        System.out.println(figura2.opis());
        System.out.println("Powierzchnia: "+prostokat1.getPowierzchnia());
        System.out.println("Kolor prostokąta: "+prostokat1.getKolor());
        System.out.println("Kolor trójkąta: "+trojkat1.getKolor());

        prostokat1.przesun(3f,5f);

        Kwadrat kwadrat1 = new Kwadrat(10d,10d,"Różowy");
        System.out.println(kwadrat1.opis());
        System.out.println(prostokat1.opis());
        System.out.println(okrag1.getPromien());
        System.out.println(okrag1.getSrednica());
        System.out.println(okrag1.wSrodku(new Punkt(5d,3d)));
        System.out.println(okrag1.getPowierzchnia());
        System.out.println(okrag1.opis());
    }

}