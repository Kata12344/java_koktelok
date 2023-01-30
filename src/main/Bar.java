package main;

import java.util.ArrayList;
import modell.Asztal;
import modell.Koktel;

public class Bar {
    ArrayList<Asztal> asztalok;
    
    public Bar(){
        asztalok = new ArrayList<>();
        Asztal a = new Asztal();
        a.felvesz(new Koktel(1250, "Pina Colada", 13.5));
        a.felvesz(new Koktel(2100, "Malibu", 4));
        a.felvesz(new Koktel(2600, "Long Island Ice Tea", 22));
        a.felvesz(new Koktel(8000, "Aperol Spritz", 10));
        a.felvesz(new Koktel(1950, "Bacardi", 14));
        a.felvesz(new Koktel(1250, "Pina Colada", 13.5));
        asztalok.add(a);
        
        a = new Asztal(true);
        a.felvesz(new Koktel(1250, "Pina Colada", 13.5));
        a.felvesz(new Koktel(2100, "Malibu", 4));
        a.felvesz(new Koktel(1250, "Pina Colada", 13.5));
        a.felvesz(new Koktel(2100, "Malibu", 4));
        a.felvesz(new Koktel(1250, "Pina Colada", 13.5));
        a.felvesz(new Koktel(2100, "Malibu", 4));
        a.felvesz(new Koktel(1250, "Pina Colada", 13.5));
        a.felvesz(new Koktel(2100, "Malibu", 4));
        asztalok.add(a);
        
        fizetoAsztalok();
    }
    
    public void fizetoAsztalok(){
        System.out.println("Fizető asztalok: ");
        for (Asztal asztal : asztalok) {
            System.out.println(asztal.kimutatas());
        }
    }
}
