package pl.madison.domain;

import java.util.ArrayList;
import java.util.List;

public class Klatka {
    List<Zwierze> zwierzaki = new ArrayList<Zwierze>();
    int wymiarKlatkiWMetrachKwadratowych;

    public List<Zwierze> getZwierzaki() {
        return zwierzaki;
    }

    public void setZwierzaki(List<Zwierze> zwierzaki) {
        this.zwierzaki = zwierzaki;
    }

    public int getWymiarKlatkiWMetrachKwadratowych() {
        return wymiarKlatkiWMetrachKwadratowych;
    }

    public void setWymiarKlatkiWMetrachKwadratowych(int wymiarKlatkiWMetrachKwadratowych) {
        this.wymiarKlatkiWMetrachKwadratowych = wymiarKlatkiWMetrachKwadratowych;
    }

    public Klatka(List<Zwierze> zwierzaki, int wymiarKlatkiWMetrachKwadratowych) {
        this.zwierzaki = zwierzaki;
        this.wymiarKlatkiWMetrachKwadratowych = wymiarKlatkiWMetrachKwadratowych;
    }
}
