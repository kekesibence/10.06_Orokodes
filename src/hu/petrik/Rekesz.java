package hu.petrik;

import java.util.ArrayList;

public class Rekesz {
    private int maxTeherbiras;
    private ArrayList<Palack> palackok;

    public Rekesz(int maxTeherbiras) {
        this.maxTeherbiras = maxTeherbiras;
        palackok = new ArrayList<>();
    }

    public int suly() {
        int ossz = 0;
        for (Palack item: palackok) {
            ossz += item.suly();
        }
        return ossz;
    }

    public boolean ujPalack(Palack p) {
        boolean l = false;
        if (p.suly() + this.suly() <= this.maxTeherbiras ){
            palackok.add(p);
            l = true;
        }
        return l;
    }

    public int osszesPenz() {
        int osszesPenz = 0;
        for (Palack item: palackok) {
            if (item instanceof VisszavalthatoPalack){
                osszesPenz +=  ((VisszavalthatoPalack) item).getPalackDij();
            }
        }
        return osszesPenz;
    }

    @Override
    public String toString() {
        String s = "";
        for (Palack item: palackok) {
            s+= item +"\n";
        }
        return s;
    }
}
