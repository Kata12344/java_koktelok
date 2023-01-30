package modell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Asztal {
    boolean itallap;
    ArrayList<Koktel> koktelok;

    public Asztal() {
        this(false);
    }
    
    public Asztal(boolean itallap) {
        this.itallap = itallap;
        koktelok = new ArrayList<>();
        
    }

    public void felvesz(Koktel koktel){
        koktelok.add(koktel);
    }
    
    public String kimutatas(){
        String a = itallap ? "itallappal" : "itallap nélkül";
        String kim = String.format("Fogyasztás (%s):\n", a);
        kim += tetelek();
        kim += "---------------------\nÖsszesen: ";
        kim += osszFogyasztas();
        kim += "\n";
        return kim;
    }
    
    public String tetelek(){
        String szoveg = "";
        for (Map.Entry<String, Integer> entry : mibolMennyi().entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            szoveg += String.format("%s: %d\n",key, value);
        }
        return szoveg;
    }
    
    public int osszFogyasztas(){
        int db =0;
        for (Koktel koktel : koktelok) {
            db += koktel.getAr();
        }
        return db;
    }
    
    public Map<String, Integer> mibolMennyi(){
        Map<String, Integer> hm = new HashMap<>();
        for (Koktel koktel : koktelok) {
            String kulcs = koktel.getFajta();
            if (hm.containsKey(kulcs)) {
                int db = hm.get(kulcs);
                hm.put(kulcs, ++db);
            }else{
                hm.put(kulcs, 1);
            }
        }
        return hm;
    }
}
