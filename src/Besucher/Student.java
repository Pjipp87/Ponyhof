package Besucher;

public class Student extends Besucher{

    private static int counterStudents = 0;
    public Student(){
        super(15);
        int preis = 9;
        gesamteEinnahmenBesucher += preis;
        ++counterStudents;
    }


    protected static String getCounts(){
        return "Studenten:\t\t"+ counterStudents;
    }
}
