package Besucher;

import java.util.Random;

public class Kind extends Besucher{

    public Kind(){
        super();
        Random r = new Random();
        if (r.nextInt(1,3)==1){
            new Erwachsene();
        }else{
            new Rentner();
        }
        int preis = 5;
        gesamteEinnahmenBesucher += preis;
    }
}
