import Attraktionen.Attraktionen;
import Besucher.*;
import Essen.*;

public class Main {
    public static void main(String[] args) {


        new Erwachsene();
        new Kind();
        new Jugendlicher();
        new Rentner();
        new Student();


        Besucher.getBesucher2();
        Attraktionen.getAttraktionÜbersicht();



    }
  }