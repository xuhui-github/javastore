public class Card {
    private String rank;
    private String suit;

    public Card(String r, String s) {
        if (r == null || s == null)
            throw new IllegalArgumentException();
        rank = r;
        suit = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Card))
            return false;
        Card c = (Card) obj;
        return c.suit.equals(suit) && c.rank.equals(rank);
    }

    public int hashCode() {
        return rank.hashCode();
    }

    public String toString() {
        return suit + " " + rank;
    }

    public static void main(String[] args) {
        Card c = new Card("cube", "13");
        System.out.println(c);
        System.out.println();

    }
}
