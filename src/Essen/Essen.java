package Essen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Essen {
    private String name;
    private int preis;
    public static HashMap<String, Integer> essenListe = new HashMap<>();
    public static HashMap<String, Integer> essenMap = new HashMap<>();
    public static ArrayList<String> essenArrayList = new ArrayList<>();
    public static int gesamtEinnahmenEssen;

    protected Essen(String name, int preis){
        essenListe.put(name, preis);
        gesamtEinnahmenEssen += preis;
    }

    public Essen(){
        fuelleMap();
        int r = new Random().nextInt(0, 8);
        essenArrayList.add(essenMap.keySet().toArray()[r].toString());
        gesamtEinnahmenEssen += (int) essenMap.values().toArray()[r];
    }

    private void fuelleMap(){
        essenMap.put("Wasser", 2);
        essenMap.put("Limo", 3);
        essenMap.put("Waffeln", 3);
        essenMap.put("Bratwurst", 2);
        essenMap.put("Salat",6);
        essenMap.put("Currywurst", 4);
        essenMap.put("Pommes", 2);
        essenMap.put("Veganer Wrap", 5);
    }

    public int getPreis() {
        return preis;
    }

    public String getName() {
        return name;
    }
}
