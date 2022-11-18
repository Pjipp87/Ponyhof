package Besucher;

import java.util.ArrayList;

public class Besucher {

    public static ArrayList<Besucher> besucherListe = new ArrayList<Besucher>();
    public static int gesamteEinnahmenBesucher = 0;

    protected Besucher(){
        besucherListe.add(this);
    }
}
