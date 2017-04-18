public class Card {
    private int id;
    private Suit suit;
    private String name;

    public Card(int id, Suit suit, String name) {
        this.id = id;
        this.suit = suit;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
