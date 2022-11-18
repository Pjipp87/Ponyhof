import Attraktionen.Attraktionen;
import Besucher.*;
import Essen.*;

public class Main {
    public static void main(String[] args) {


        new Erwachsene();
        new Kind();
        new Jugendlicher();
        new Rentner();
        new Student();
        System.out.println(Besucher.gesamteEinnahmenBesucher);

        new Wasser();
        new Limo();
        new Waffeln();
        new Bratwurst();
        new Salat();
        new Currywurst();
        new Pommes();
        new Wrap();

        //Essen.essenListe.forEach((key, value)-> System.out.println(key+": "+value));
        System.out.println(Essen.gesamtEinnahmenEssen);

        System.out.println();
        new Attraktionen();
        new Attraktionen();
        new Attraktionen();
        new Attraktionen();
        new Attraktionen();

        for (Attraktionen.Attractionen e: Attraktionen.attraktionenListe) {
            System.out.println(e.toString()+": "+ e.getPreis());
        }
        System.out.println(Attraktionen.gesamtEinnahmenAttraktionen);
    }
}