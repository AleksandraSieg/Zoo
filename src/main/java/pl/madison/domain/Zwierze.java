package pl.madison.domain;

public class Zwierze {
    private String gatunek;
    private int waga;

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public Zwierze(String gatunek, int waga) {
        this.gatunek = gatunek;
        this.waga = waga;
    }
}
