package hu.petrik;

public class VisszavalthatoPalack extends Palack {
    private  int palackDij;


    public VisszavalthatoPalack(String nev, int maxUrtartalom, int jelenlegiUrtartalom, int palackDij) {
        super(nev, maxUrtartalom, jelenlegiUrtartalom);
        this.palackDij = palackDij;
    }

    public int getPalackDij() {
        return palackDij;
    }

    @Override
    public String toString() {
        return "visszaváltható " + super.toString();
    }
}
