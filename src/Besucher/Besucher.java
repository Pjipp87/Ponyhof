package Besucher;

import Attraktionen.Attraktionen;
import Essen.Essen;

import java.util.ArrayList;
import java.util.Random;

public class Besucher {

    public static ArrayList<Besucher> besucherListe = new ArrayList<Besucher>();
    public static int gesamteEinnahmenBesucher = 0;

    protected Besucher(int j){
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

    }

    public static void getBesucher(){
        System.out.println("Gesamtzahl Besucher:" + besucherListe.size());
        for (Besucher b: besucherListe) {
            int erwachsene =0;
            int kinder = 0;
            int jugendliche = 0;
            int rentner = 0;
            int student = 0;
            if (b instanceof Erwachsene){
                ++erwachsene;
            } else if(b instanceof Kind){
                ++kinder;
            } else if(b instanceof Jugendlicher) {
                ++jugendliche;
            } else if (b instanceof Rentner){
                ++rentner;
            } else if(b instanceof Student){
                ++student;
            }

        }
    }

    public static void getBesucher2(){

        System.out.println("BESUCHER:");
        System.out.println("Gesamtzahl:\t\t" + besucherListe.size());
        System.out.println(Kind.getCounts());
        System.out.println(Jugendlicher.getCounts());
        System.out.println(Rentner.getCounts());
        System.out.println(Erwachsene.getCounts());
        System.out.println(Student.getCounts());
        System.out.println("==============================");
    }

}
