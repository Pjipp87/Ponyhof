package Besucher;


/**
 * Klasse zum Erstellen eines Jugendlichen-Objekts<br>
 *
 * @author Pascal Jipp<br>
 * <br>
 * {@see <a href="http://www.github.com/scarfaceHBC">Pascal Jipp</a>}
 */
public class Jugendlicher extends Besucher{

    /**
     * Zählt die erstellten Jugendlichen
     */
    private static int counterJugendliche = 0;

    /**
     * Konstruktor zum Erstellen eines Jugendlichen-Objekts.<br>
     * Initialisiert den Studenten mit einem gezahlten Eintrittspreis von 7 Euro.<br>
     * Zählt automatisch die {@link Besucher#gesamteEinnahmenBesucher gesamteEinnahmenBesucher} aus der
     * Besucherklassen und die {@link Jugendlicher#counterJugendliche counterJugendliche} hoch.<br>
     *
     */
    public Jugendlicher(){
        super();
        int preis = 7;
        ++counterJugendliche;
        gesamteEinnahmenBesucher += preis;
    }


    /**
     * Gibt die Anzahl der erstellten Jugendlichen-Objekte als String zurück
     * @return - String mit dem Namen der Klasse und der Anzahl der erstellten Objekte
     */
    protected static String getCounts(){
        return "Jugendliche:\t"+ counterJugendliche;
    }
}
