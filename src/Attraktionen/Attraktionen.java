package Attraktionen;

import java.util.ArrayList;
import java.util.Random;

/**
 * Klasse zum Erstellen und Abrufen von Attraktion-Objekten
 * Objekte werden automatisch zu einer ArrayList hinzugefügt<br>
 * {@link Attraktionen#gesamtEinnahmenAttraktionen gemsamtEinnahmenAttraktion}<br>
 * Der Gesamtnpreis wird automatisch berechnet.<br>
 * {@link Attraktionen#attraktionenListe attraktionListe<br>}
 *
 * @author Pascal jipp<br>
 * <br>
 * {@see <a href="http://www.github.com/scarfaceHBC">Pascal Jipp</a>}
 */
public final class Attraktionen {

    /**
     * Speichert die Gesamtsumme der Einnahmen durch die Attraktionen
     */
    public static int gesamtEinnahmenAttraktionen = 0;

    /**
     * ArrayListe die jedes erstelle Attraction-Objekt aufnimmt
     */
    public static ArrayList<Attractionen> attraktionenListe = new ArrayList<>();


    public Attraktionen(){
        Random r = new Random();
        int randomNum = r.nextInt(0, Attractionen.values().length-1);
        attraktionenListe.add(Attractionen.values()[randomNum]);
        Attractionen.values()[randomNum].setCounter();
        gesamtEinnahmenAttraktionen += Attractionen.values()[randomNum].getPreis();

    }
    public void attraktionUebersicht(){
        System.out.println("Attraktionen: ".toUpperCase());
        System.out.println("Gesamtzahl: "+ Attraktionen.attraktionenListe.size());
        for (Attractionen a: Attractionen.values()) {
            if(a.getCounter()>0){
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append(".".repeat(Math.max(0, 25 - a.toString().length())));
                if (a.getCounter()>10) {
                    sb.append(".");
                    sb.append(a.getCounter());
                } else{
                    sb.append(a.getCounter());
                }

                System.out.println(sb);
            }

        }
        System.out.println("==============================");
    }

}
