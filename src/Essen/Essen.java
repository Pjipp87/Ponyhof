package Essen;

import java.util.*;

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

    public static void getEssenÜbersicht(){
        HashMap<String, Integer> ausgabeMap = new HashMap<>();
        System.out.println("ESSEN");
        System.out.println("Gesamtzahl: "+Essen.essenArrayList.size());
        for (String s1:essenArrayList) {
            int counter = 0;
            for (String s2: essenArrayList) {
                if (s1.equals(s2)){
                    ++counter;
                }
            }
            ausgabeMap.put(s1, counter);
            //System.out.println(s1+"\t\t"+counter);
        }
        ausgabeMap.forEach((k,v)->{
            StringBuilder sb = new StringBuilder();
            sb.append(k);
            sb.append(".".repeat(Math.max(0, 25 - k.length())));
            if (v<=99){
                sb.append(".").append(v);
            } else {
                sb.append(v);
            }
            System.out.println(sb);
        });
        System.out.println("==============================");
    }
}
