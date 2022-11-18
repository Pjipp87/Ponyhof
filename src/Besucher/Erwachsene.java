package Besucher;

public class Erwachsene extends Besucher{

    private static int counterErwachsene = 0;

    public Erwachsene(){
        super();
        int preis = 15;
        gesamteEinnahmenBesucher += preis;
        ++counterErwachsene;
    }


    protected static String getCounts(){
        return "Erwachsene:\t\t"+counterErwachsene;
    }

}
