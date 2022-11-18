package Besucher;

public class Rentner extends Besucher{

    private static int counterRentner = 0;
    public Rentner(){
        super();
        int preis = 10;
        gesamteEinnahmenBesucher += preis;
        ++counterRentner;
    }

    protected static String getCounts(){
        return "Rentner:\t\t"+ counterRentner;
    }
}
