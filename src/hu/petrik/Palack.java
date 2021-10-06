package hu.petrik;

public class Palack {
    private String nev;
    private int maxUrtartalom;
    private int jelenlegiUrtartalom;


    public Palack(String nev, int maxUrtartalom, int jelenlegiUrtartalom) {
        this.nev = nev;
        this.maxUrtartalom = maxUrtartalom;
        this.jelenlegiUrtartalom = jelenlegiUrtartalom;
    }

    public Palack(String nev, int maxUrtartalom) {
        this.nev = nev;
        this.maxUrtartalom = maxUrtartalom;
        this.jelenlegiUrtartalom = 1;
    }
    public int getJelenlegiUrtartalom() {
        return jelenlegiUrtartalom;
    }

    public void setJelenlegiUrtartalom(int jelenlegiUrtartalom) {
        if ( jelenlegiUrtartalom > this.maxUrtartalom) {
            this.jelenlegiUrtartalom = this.maxUrtartalom;
        }
        else {
            this.jelenlegiUrtartalom = jelenlegiUrtartalom;
        }

        if (this.jelenlegiUrtartalom == 0) {
            this.nev=null;
        }
    }

    public int suly() {
        return  this.maxUrtartalom/35 + this.jelenlegiUrtartalom;
    }

    public boolean egyeloekE(Palack p) {
        boolean egyeznekE = false;
        if (this.nev.equals(p.nev) && this.maxUrtartalom == p.maxUrtartalom && this.jelenlegiUrtartalom == p.jelenlegiUrtartalom) {
            egyeznekE = true;
        }
        return egyeznekE;
    }

    public void hozzaOnt(Palack p) {
        this.setJelenlegiUrtartalom(this.jelenlegiUrtartalom+p.jelenlegiUrtartalom);
        if (this.nev == null) {
            this.nev = p.nev;
        }
        else if (!this.nev.equals(p.nev)) {
            this.nev = "keverek";
        }
    }

    @Override
    public String toString() {
        return String.format("palack, benne levo ital: %s, jelenleg %d ml van benne, maximum \n " +
        " %s ml fer bele.", this.nev, this.jelenlegiUrtartalom, this.maxUrtartalom);
    }
}
