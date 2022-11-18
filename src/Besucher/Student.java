package Besucher;

public class Student extends Besucher{

    public Student(){
        super();
        int preis = 9;
        super.gesamteEinnahmenBesucher += preis;
    }
}
