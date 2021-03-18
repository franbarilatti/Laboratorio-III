package classes;

public class Mazo {
    private String typeDeck;
    private int lengthDeck;

    public Mazo(String typeDeck, int lengthDeck) {
        this.typeDeck = typeDeck;
        this.lengthDeck = lengthDeck;
    }

    public String getTypeDeck() {
        return typeDeck;
    }

    public void setTypeDeck(String typeDeck){
        this.typeDeck = typeDeck;
    }

    public int getlengthDeck() {
        return lengthDeck;
    }

    public void setlengthDeck(int lengthDeck) {
        this.lengthDeck = lengthDeck;
    }
}

