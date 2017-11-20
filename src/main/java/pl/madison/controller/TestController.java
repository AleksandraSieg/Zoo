package pl.madison.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.madison.domain.Klatka;
import pl.madison.domain.Zwierze;
import pl.madison.tworzenieSwiata.Create;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    Klatka klatka1 = Create.createKlatka(Create.createZwierzaki(
            Create.createZwierze("Lew", 60),
            Create.createZwierze("Lampart", 70),
            Create.createZwierze("Ryś", 15)
    ), 50);

    Klatka klatka2 = Create.createKlatka(Create.createZwierzaki(
            Create.createZwierze("Paw", 30),
            Create.createZwierze("Kaczka", 20)
    ), 40);

    List<Zwierze> nowaLista = new ArrayList<Zwierze>();

    public int liczSrednia(Klatka klatka1, Klatka klatka2) {
        int dodawanie = 0;
        int licznik = 0;
        for (Zwierze i : klatka1.getZwierzaki()) {
            dodawanie = dodawanie + i.getWaga();
            licznik++;
        }

        for (Zwierze i : klatka2.getZwierzaki()) {
            dodawanie = dodawanie + i.getWaga();
            licznik++;
        }

        int sredniaArytmetyczna = dodawanie / licznik;
        return sredniaArytmetyczna;
    }

    public int zwierzetaWiekszeOdSredniej(Klatka klatka) {
        int licznik = 0;
        int srednia = liczSrednia(klatka1, klatka2);
        for (Zwierze i : klatka.getZwierzaki()) {
            if (i.getWaga() > srednia) {
                licznik++;
            }
        }
        return licznik;
    }

    public void sprawdzamy() {
        int liczba1 = zwierzetaWiekszeOdSredniej(klatka1);
        int liczba2 = zwierzetaWiekszeOdSredniej(klatka2);
        int srednia = liczSrednia(klatka1, klatka2);
        if (liczba1 > liczba2) {
            for (Zwierze i : klatka1.getZwierzaki()) {
                if (i.getWaga() > srednia) {
                    nowaLista.add(i);
                }
            }
        } else {
            for (Zwierze i : klatka2.getZwierzaki()) {
                if (i.getWaga() > srednia) {
                    nowaLista.add(i);
                }
            }
        }
    }

    @RequestMapping(value = "/wyswietl")
    public String wyswietl(Map<String, Object> model) {
        model.put("stronka", nowaLista);
        return "strona";
    }
}
