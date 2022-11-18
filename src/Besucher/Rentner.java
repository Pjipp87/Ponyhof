package Besucher;

public class Rentner extends Besucher{

    public Rentner(){
        super();
        int preis = 10;
        super.gesamteEinnahmenBesucher += preis;
    }
}
