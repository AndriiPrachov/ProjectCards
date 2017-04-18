import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static List<Suit> suits = new ArrayList<>();

    public static void main(String[] args) {
        init();

        List<Card> playingCards = initCards();
        playingCards = shuffleCards(playingCards);

        int numberInDeck = 0;
        for (Card card : playingCards) {
            System.out.println(++numberInDeck + ") " + card.getName() + " of " + card.getSuit());
        }
    }

    static void init() {
        initSuits();
    }

    static void initSuits() {
        suits.add(Suit.General);
        suits.add(Suit.Clubs);
        suits.add(Suit.Diamonts);
        suits.add(Suit.Hearts);
        suits.add(Suit.Spades);
    }

    static List<Card> initCards() {
        List<Card> cards = new ArrayList<>();

        for (int i = 1; i < suits.size(); i++) {
            cards.add(new Card(1,  suits.get(i), "Ace"));
            for (int j = 2; j <= 10; j++) {
                cards.add(new Card(j, suits.get(i), "" + j));
            }
            cards.add(new Card(11, suits.get(i), "Jack"));
            cards.add(new Card(12, suits.get(i), "Queen"));
            cards.add(new Card(13, suits.get(i), "King"));
        }

        cards.add(new Card(0,  suits.get(0), "Jocker1"));
        cards.add(new Card(0,  suits.get(0), "Jocker2"));

        return cards;
    }

    static List<Card> shuffleCards(List<Card> cards) {
        for (int i = 0; i < 999; i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(cards.size());
            cards.add(cards.remove(randomIndex));
        }

        return cards;
    }
}
