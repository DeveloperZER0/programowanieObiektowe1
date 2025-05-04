package Classes;

public class SamochodElektryczny extends Pojazd implements  Elektryczny{
    private int poziomBaterii = 100;
    public SamochodElektryczny(String id, String model) {
        super(id, model);
    }

    @Override
    public void naladuj() {
        poziomBaterii = 100;
    }

    @Override
    public int poziomNaladowania() {
        return poziomBaterii;
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return liczbaGodzin * 35.0;
    }
}
