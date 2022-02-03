package com.example;

public enum Card {
    SUIT_SPADES("Spades"),
    SUIT_HEARTS("Hearts"),
    SUIT_CLUBS("Clubs"),
    SUIT_DIAMONDS("Diamond"),
    ;

    private String suitName;

   private Card(String suitName) {
        this.suitName = suitName;
    }

    public String getSuitName() {
        return suitName;
    }
}
