package Besucher;

import java.util.Random;

public class Kind extends Besucher{

    private static int counterKinder = 0;
    public Kind(){
        super(15);
        Random r = new Random();
        if (r.nextInt(1,3)==1){
            new Erwachsene();
        }else{
            new Rentner();
        }
        int preis = 5;
        gesamteEinnahmenBesucher += preis;
        ++counterKinder;
    }

    protected static String getCounts(){
        return "Kinder:\t\t\t"+ counterKinder;
    }
}
