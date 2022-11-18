package Besucher;


/**
 * Klasse zum Erstellen eines Erwachsenen-Objekts<br>
 *
 * @author Pascal Jipp<br>
 * <br>
 * {@see <a href="http://www.github.com/scarfaceHBC">Pascal Jipp</a>}
 */
public class Erwachsene extends Besucher{

    /**
     * Zählt die erstellten Erwachsenen
     */
    private static int counterErwachsene = 0;


    /**
     * Konstruktor zum Erstellen eines Erwachsenen-Objekts.<br>
     * Initialisiert den Studenten mit einem gezahlten Eintrittspreis von 15 Euro.<br>
     * Zählt automatisch die {@link Besucher#gesamteEinnahmenBesucher gesamteEinnahmenBesucher} aus der
     * Besucherklassen und die {@link Erwachsene#counterErwachsene counterErwachsene} hoch.<br>
     *
     */
    public Erwachsene(){
        super();
        int preis = 15;
        gesamteEinnahmenBesucher += preis;
        ++counterErwachsene;
    }


    /**
     * Gibt die Anzahl der erstellten Erwachsenen-Objekte als String zurück
     * @return - String mit dem Namen der Klasse und der Anzahl der erstellten Objekte
     */
    protected static String getCounts(){
        return "Erwachsene:\t\t"+counterErwachsene;
    }

}
