package Besucher;

import java.util.Random;


/**
 * Klasse zum Erstellen eines Kind-Objekts<br>
 *
 * @author Pascal Jipp<br>
 * <br>
 * {@see <a href="http://www.github.com/scarfaceHBC">Pascal Jipp</a>}
 */
public class Kind extends Besucher{

    /**
     * Zählt die erstellten Kinder
     */
    private static int counterKinder = 0;

    /**
     * Konstruktor zum Erstellen eines Kind-Objekts.<br>
     * Initialisiert den Studenten mit einem gezahlten Eintrittspreis von 5 Euro.<br>
     * Über eine Random()-Integer, wird ausgelost, ob zu dem Kind ein {@link Erwachsene Erwachsener} oder
     * ein {@link Rentner Rentner} als Begleitperson erstellt wird.<br>
     * Zählt automatisch die {@link Besucher#gesamteEinnahmenBesucher gesamteEinnahmenBesucher} aus der
     * Besucherklassen und die {@link Kind counterKinder} hoch.<br>
     *
     */
    public Kind(){
        super();
        Random r = new Random();
        if (r.nextInt(1,3)==1){
            new Erwachsene();
        }else{
            new Rentner();
        }
        int preis = 5;
        gesamteEinnahmenBesucher += preis;
        ++counterKinder;
    }

    /**
     * Gibt die Anzahl der erstellten Kind-Objekte als String zurück
     * @return - String mit dem Namen der Klasse und der Anzahl der erstellten Objekte
     */
    protected static String getCounts(){
        return "Kinder:\t\t\t"+ counterKinder;
    }
}
