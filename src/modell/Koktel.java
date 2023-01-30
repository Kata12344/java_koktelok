package modell;

public class Koktel {
int ar;
String fajta;
double alkoholtartalom;

    public Koktel(int ar, String fajta, double alkoholtartalom) {
        this.ar = ar;
        this.fajta = fajta;
        this.alkoholtartalom = alkoholtartalom;
    }

    public int getAr() {
        return ar;
    }

    public String getFajta() {
        return fajta;
    }

    public double getAlkoholtartalom() {
        return alkoholtartalom;
    }


}
