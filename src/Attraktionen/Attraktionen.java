package Attraktionen;

import java.util.ArrayList;
import java.util.Random;

public class Attraktionen {
    public enum Attractionen {
        PLANWAGENFAHRT(7),
        PONYREITEN(5),
        HUEHNER_FUETTERN(2),
        BROT_BACKEN(5),
        STREICHELZOO(3);

        private final int preis;

        public int getPreis(){
            return preis;
        }

        Attractionen(int preis) {
            this.preis = preis;
        }
    }
    public static int gesamtEinnahmenAttraktionen = 0;
    public static ArrayList<Attractionen> attraktionenListe = new ArrayList<>();

    public Attraktionen(){
        Random r = new Random();
        int randomNum = r.nextInt(0, Attractionen.values().length-1);
        attraktionenListe.add(Attraktionen.Attractionen.values()[randomNum]);
        gesamtEinnahmenAttraktionen += Attraktionen.Attractionen.values()[randomNum].getPreis();
    }

}
