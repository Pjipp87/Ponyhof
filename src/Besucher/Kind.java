package Besucher;

public class Kind extends Besucher{

    public Kind(){
        super();
        new Erwachsene();
        int preis = 5;
        super.gesamteEinnahmenBesucher += preis;
    }
}
