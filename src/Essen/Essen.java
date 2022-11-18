package Essen;

import java.util.*;


/**
 * Klasse zum Erstellen und Abrufen von Essen-Objekten
 *
 * @author Pascal Jipp<br>
 * <br>
 * {@see <a href="http://www.github.com/scarfaceHBC">Pascal Jipp</a>}
 */
public class Essen {

    /**
     * Hashmap, die Key-Value-Paare aus Name es Essens und dessen Preis aufnimmt
     */
    public static HashMap<String, Integer> essenMap = new HashMap<>();

    /**
     * ArrayListe, die Namen der Mahlzeiten aufnimmt
     */
    public static ArrayList<String> essenArrayList = new ArrayList<>();

    /**
     * Speichert die Gesamtsumme der verkauften Mahlzeiten
     */
    public static int gesamtEinnahmenEssen;

    /**
     * <p>Erstellt ein Essen - Objekt aus den übergebenen Parameter und speichert dieses in essenListe.</p>
     * <p>Addiert ausserdem den übergebenen Preis auf die gesamtEinnahmenEssen</p>
     * <hr>
     * <p>Mehr Infos:</p>
     * {@link Essen#essenMap essenMap}<br>
     * {@link Essen#gesamtEinnahmenEssen gesamtEinnahmenEssen}
     */
    public Essen(){
        fuelleMap();
        int r = new Random().nextInt(0, 8);
        essenArrayList.add(essenMap.keySet().toArray()[r].toString());
        gesamtEinnahmenEssen += (int) essenMap.values().toArray()[r];
    }


    /**
     * Füllt die essenMap mit Key-Value Paaren aus Name des Essens und dem Preis
     * <hr>
     * <p>Mehr Infos:</p>
     * {@link Essen#essenMap essenMap}
     */
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


    /**
     * Ausgabe sämtlicher Daten zum Essen.
     * Es wird die gesamtzahl der verzehrten Mahlzeiten aufgeführt.
     * Ausserdem wird zu jedem Essen ausgegeben, wie oft es verkauft wurde
     * <hr>
     * <p>Mehr Infos:</p>
     * {@link Essen#essenMap essenMap}<br>
     * {@link Essen#gesamtEinnahmenEssen gesamtEinnahmenEssen}
     */
    public static void essenUebersicht(){
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
