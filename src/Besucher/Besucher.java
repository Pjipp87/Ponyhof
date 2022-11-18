package Besucher;

import Attraktionen.Attraktionen;
import Essen.Essen;

import java.util.ArrayList;
import java.util.Random;


public class Besucher {

    public static ArrayList<Besucher> besucherListe = new ArrayList<>();
    public static int gesamteEinnahmenBesucher = 0;

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
     * sowie die Einnahmen durch Besucher, Attraktionen und Nahrungsmittel aus
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
