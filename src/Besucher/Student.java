package Besucher;




/**
 * Klasse zum Erstellen eines Student-Objekts<br>
 *
 * @author Pascal Jipp<br>
 * <br>
 * {@see <a href="http://www.github.com/scarfaceHBC">Pascal Jipp</a>}
 */
public class Student extends Besucher{

    /**
     * Zählt die erstellten Studenten
     */
    private static int counterStudents = 0;

    /**
     * Konstruktor zum Erstellen eines Student-Objekts.<br>
     * Initialisiert den Studenten mit einem gezahlten Eintrittspreis von 9 Euro.<br>
     * Zählt automatisch die {@link Besucher#gesamteEinnahmenBesucher gesamteEinnahmenBesucher} aus der
     * Besucherklassen und die {@link Student#counterStudents counterStudents} hoch.<br>
     *
     */
    public Student(){
        super();
        int preis = 9;
        gesamteEinnahmenBesucher += preis;
        ++counterStudents;
    }


    /**
     * Gibt die Anzahl der erstellten Student-Objekte als String zurück
     * @return - String mit dem Namen der Klasse und der Anzahl der erstellten Objekte
     */
    protected static String getCounts(){
        return "Studenten:\t\t"+ counterStudents;
    }
}
