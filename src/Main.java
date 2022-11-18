import Attraktionen.Attraktionen;
import Besucher.*;
import Essen.*;

public class Main {

    /**
     * Gibt die gesamten Einnahmen,
     * sowie die Einnahmen durch Besucher, Attraktionen und Nahrungsmittel aus
     */
    static void finanzen(){
        System.out.println("EINNAHMEN");
        System.out.println("Besucher:\t\t"+Besucher.gesamteEinnahmenBesucher);
        System.out.println("Attraktionen:\t"+Attraktionen.gesamtEinnahmenAttraktionen);
        System.out.println("Essen:\t\t\t"+Essen.gesamtEinnahmenEssen);
        System.out.println("______________________________");
        System.out.println("Gesamt:\t\t\t"+(Essen.gesamtEinnahmenEssen+Attraktionen.gesamtEinnahmenAttraktionen+Besucher.gesamteEinnahmenBesucher));
    }
    public static void main(String[] args) {
        Besucher.starteTag();
        Besucher.getBesucher2();
        Attraktionen.attraktionUebersicht();
        Essen.essenUebersicht();
        finanzen();
    }
  }