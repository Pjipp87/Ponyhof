package Besucher;

public class Jugendlicher extends Besucher{

    private static int counterJugendliche = 0;
    public Jugendlicher(){
        super();
        int preis = 7;
        ++counterJugendliche;
        gesamteEinnahmenBesucher += preis;
    }

    protected static String getCounts(){
        return "Jugendliche:\t"+ counterJugendliche;
    }
}
