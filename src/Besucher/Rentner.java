package Besucher;


/**
 * Klasse zum Erstellen eines Rentner-Objekts<br>
 *
 * @author Pascal Jipp<br>
 * <br>
 * {@see <a href="http://www.github.com/scarfaceHBC">Pascal Jipp</a>}
 */
public class Rentner extends Besucher{

    /**
     * Zählt die erstellten Rentner
     */
    private static int counterRentner = 0;

    /**
     * Konstruktor zum Erstellen eins Rentner-Objekts.<br>
     * Initialisiert den Rentner mit einem gezahlten Eintrittspreis von 10 Euro.<br>
     * Zählt automatisch die {@link Besucher#gesamteEinnahmenBesucher gesamteEinnahmenBesucher} aus der
     * Besucherklassen und die {@link Rentner#counterRentner counterRentner} hoch.<br>
     *
     */
    public Rentner(){
        super();
        int preis = 10;
        gesamteEinnahmenBesucher += preis;
        ++counterRentner;
    }

    /**
     * Gibt die Anzahl der erstellten Rentner-Objekte als String zurück
     * @return - String mit dem Namen der Klasse und der Anzahl der erstellten Objekte
     */
    protected static String getCounts(){
        return "Rentner:\t\t"+ counterRentner;
    }
}
