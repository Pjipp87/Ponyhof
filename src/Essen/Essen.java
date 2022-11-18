package Essen;

import java.util.ArrayList;
import java.util.HashMap;

public class Essen {
    public static HashMap<String, Integer> essenListe = new HashMap<>();
    public static int gesamtEinnahmenEssen;

    protected Essen(String name, int preis){
        essenListe.put(name, preis);
        gesamtEinnahmenEssen += preis;
    }
}
