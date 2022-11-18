package Attraktionen;

import java.util.ArrayList;
import java.util.Random;

public class Attraktionen {
    public enum Attractionen {
        PLANWAGENFAHRT(7, 0),
        PONYREITEN(5,0),
        HUEHNER_FUETTERN(2,0),
        BROT_BACKEN(5,0),
        STREICHELZOO(3,0);

        private final int preis;
        private int counter;

        public int getPreis(){
            return preis;
        }
        public int getCounter(){return counter;};
        public void setCounter(){this.counter += 1;};

        Attractionen(int preis, int counter) {
            this.preis = preis;
        }
    }
    public static int gesamtEinnahmenAttraktionen = 0;
    public static ArrayList<Attractionen> attraktionenListe = new ArrayList<>();

    public Attraktionen(){
        Random r = new Random();
        int randomNum = r.nextInt(0, Attractionen.values().length-1);
        attraktionenListe.add(Attraktionen.Attractionen.values()[randomNum]);
        Attraktionen.Attractionen.values()[randomNum].setCounter();
        gesamtEinnahmenAttraktionen += Attraktionen.Attractionen.values()[randomNum].getPreis();
    }
    public static void getAttraktionÜbersicht(){
        System.out.println("Attraktionen: ".toUpperCase());
        System.out.println("Gesamtzahl: "+ Attraktionen.attraktionenListe.size());
        for (Attractionen a: Attractionen.values()) {
            if(a.getCounter()>0){
                StringBuilder sb = new StringBuilder();
                sb.append(a.toString());
                for(int i = a.toString().length(); i <25; i++){
                    sb.append(".");
                }
                if (a.getCounter()>10) {
                    sb.append(".");
                    sb.append(a.getCounter());
                } else{
                    sb.append(a.getCounter());
                }

                System.out.println(sb);
            }

        }
        System.out.println("==============================");
    }

}
