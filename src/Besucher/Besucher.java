package Besucher;

import Attraktionen.Attraktionen;
import Essen.Essen;

import java.util.ArrayList;
import java.util.Random;

/**
 * Klasse zum Erstellen und Abrufen von Besucher-Objekten
 * Objekte werden automatisch zu einer ArrayList hinzugefügt<br>
 * {@link Besucher#besucherListe besucherListe}<br>
 * Die Gesamteinnahmen werden automatisch berechnet.<br>
 * {@link Besucher#gesamteEinnahmenBesucher gesamteEinnahmenBesucher}<br>
 * Mit der {@link Besucher#starteTag() starteTag()} Methode, wird die Applikation gestartet<br>
 *
 * @author Pascal Jipp<br>
 * <br>
 * {@see <a href="http://www.github.com/scarfaceHBC">Pascal Jipp</a>}
 */
public class Besucher {

    /**
     * ArrayListe die jedes erstellte Besucher-Objekt aufnimmt
     */
    public static ArrayList<Besucher> besucherListe = new ArrayList<>();

    /**
     * Speichert die Gesamtsumme der Einnahmen durch den Eintritt
     */
    public static int gesamteEinnahmenBesucher = 0;


    /**
     * <p>Erstellt ein Besucher - Objekt. Zu dem Besucher wird zwischen 1-3 zufällige Attraktionen- und 2-3 Essen-Objekte erstellt</p>
     * <p>Fügt die Objekte in die {@link Besucher#besucherListe besucherListe} ein</p>
     *
     * <hr>
     * <p>Mehr Infos:</p>
     * {@link Attraktionen Attraktion}<br>
     * {@link Essen Essen}<br>
     */
    protected Besucher(){
        besucherListe.add(this);
        Random counter = new Random();
        for (int i = 0; i < 3; i++){
            new Attraktionen();
        }
        for(int i = 0; i < counter.nextInt(2,5); i++){
            new Essen();
        }
    }


    /**
     * Ermittelt über die {@link Random Random()} Methode eine Besucheranzahl zwischen 150 und 250.<br>
     * Für jeden der Besucher wird per zufall Objekt einer Subklasse von Besucher erstellt:<br>
     * {@link Kind Kind}<br>
     * {@link Jugendlicher Jugendlicher}<br>
     * {@link Student Student}<br>
     * {@link Erwachsene Erwachsene}<br>
     * {@link Rentner Rentner}<br>
     * <br>
     * Durch aufruf der Methoden {@link Besucher#getBesucher() getBesucher()}, {@link Attraktionen#attraktionUebersicht() atttraktionUebersicht()}, {@link Besucher#finanzen() finanzen()}
     * und {@link Essen#essenUebersicht() essenÜbersicht()} werden alle Informationen zu Besuchern, Attraktionen, Finanzen und Essen ausgegeben.<br>
     * <br>
     *
     */
    public static void starteTag(){

        System.out.println();
        Random r = new Random();
        int counter = r.nextInt(150,251);
        for (int i = 0; i< counter;i++){

            int besucherCase = r.nextInt(1,6);
            switch (besucherCase) {
                case 1 -> new Erwachsene();
                case 2 -> new Kind();
                case 3 -> new Jugendlicher();
                case 4 -> new Student();
                case 5 -> new Rentner();
            }
        }
        getBesucher();
        new Attraktionen().attraktionUebersicht();
        Essen.essenUebersicht();
        finanzen();
    }



    /**
     * Ausgabe sämtlicher Daten zu den Besuchern.<br>
     * Ausserdem eine gruppierte Ausgabe der Besucher-Klasse mit entsprechender Anzahl
     * <hr>
     * <p>Mehr Infos:</p>
     * {@link Kind Kind}<br>
     * {@link Jugendlicher Jugendlicher}<br>
     * {@link Student Student}<br>
     * {@link Erwachsene Erwachsene}<br>
     * {@link Rentner Rentner}<br>
     *
     */
    public static void getBesucher(){

        System.out.println("BESUCHER:");
        System.out.println("Gesamtzahl:\t\t" + besucherListe.size());
        System.out.println(Kind.getCounts());
        System.out.println(Jugendlicher.getCounts());
        System.out.println(Rentner.getCounts());
        System.out.println(Erwachsene.getCounts());
        System.out.println(Student.getCounts());
        System.out.println("==============================");
    }


    /**
     * Gibt die gesamten Einnahmen,
     * sowie die Einnahmen durch Besucher, Attraktionen und Nahrungsmittel einzeln aus
     */
    static void finanzen(){
        System.out.println("EINNAHMEN");
        System.out.println("Besucher:\t\t"+Besucher.gesamteEinnahmenBesucher+" €");
        System.out.println("Attraktionen:\t"+Attraktionen.gesamtEinnahmenAttraktionen+" €");
        System.out.println("Essen:\t\t\t"+Essen.gesamtEinnahmenEssen+ " €");
        System.out.println("______________________________");
        System.out.println("Gesamt:\t\t\t"+(Essen.gesamtEinnahmenEssen+Attraktionen.gesamtEinnahmenAttraktionen+Besucher.gesamteEinnahmenBesucher)+" €");
    }

}
