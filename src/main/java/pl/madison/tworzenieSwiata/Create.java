package pl.madison.tworzenieSwiata;

import pl.madison.domain.Klatka;
import pl.madison.domain.Zwierze;

import java.util.ArrayList;
import java.util.List;

public class Create {

    public static Zwierze createZwierze(String gatunek, int waga){
        Zwierze zwierze = new Zwierze(gatunek, waga);
        return zwierze;
    }

    public static Klatka createKlatka(List<Zwierze> zwierzaki, int wymiarKlatkiWMetrachKwadratowych){
        return new Klatka(zwierzaki, wymiarKlatkiWMetrachKwadratowych);
    }

    public static List<Zwierze> createZwierzaki(Zwierze... zwierzes){
        List<Zwierze> zwierzaki = new ArrayList<Zwierze>();
        for (int i = 0; i < zwierzes.length; i++) {
            zwierzaki.add(zwierzes[i]);
        }
        return zwierzaki;
    }
}
