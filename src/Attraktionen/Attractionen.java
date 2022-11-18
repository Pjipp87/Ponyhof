package Attraktionen;

public enum Attractionen {
    PLANWAGENFAHRT(7, 0),
    PONYREITEN(5,0),
    HUEHNER_FUETTERN(2,0),
    BROT_BACKEN(5,0),
    STREICHELZOO(3,0);

    private final int preis;
    private int counter;

    public int getPreis(){
        return preis;
    }
    public int getCounter(){return counter;}
    public void setCounter(){this.counter += 1;}

    Attractionen(int preis, int counter) {
        this.preis = preis;
        this.counter = counter;
    }
}