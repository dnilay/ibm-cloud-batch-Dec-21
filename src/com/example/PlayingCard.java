package com.example;

public class PlayingCard {

    /*public static final int SUIT_SPADES = 0;
    public static final int SUIT_HEARTS = 1;
    public static final int SUIT_CLUBS = 2;
    public static final int SUIT_DIAMONDS = 3;
    private int suit;*/
    private Card card;
    private int rank;

    public PlayingCard(Card card, int rank) {
        this.card = card;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    /*public String getSuitName() {
        String name = "";
        switch (suit) {
            case SUIT_SPADES:
                name = "Spades";
                break;
            case SUIT_HEARTS:
                name = "Hearts";
                break;
            case SUIT_CLUBS:
                name = "Clubs";
                break;
            case SUIT_DIAMONDS:
                name = "Diamonds";
                break;
            default:
                System.err.println("Invalid suit.");
        }
        return name;
    }*/

    public static void main(String[] args) {
        PlayingCard card1
                = new PlayingCard(Card.SUIT_SPADES, 2);
        System.out.println("card1 is the " + card1.getRank()
                + "of "+Card.SUIT_SPADES.getSuitName());
// You can create a playing card with a bogus suit.
        PlayingCard card2 = new PlayingCard(Card.SUIT_HEARTS, 1);
        System.out.println("card2 is the " + card2.getRank()
                + "of "+Card.SUIT_HEARTS.getSuitName());
    }
}

