package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 7/22/2015.
 */
public class Deck {

    private Card[] mCards;

    public final static int DECK_SIZE = 48;
    private final static int CARD_COPIES = 2;

    public Deck() {
        mCards = new Card[DECK_SIZE];

        int curCard = 0;
        Card.Rank[] ranks = Card.Rank.values();
        Card.Suit[] suits = Card.Suit.values();

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                for (int k = 0; k < CARD_COPIES; k++) {
                    mCards[curCard] = new Card(ranks[i], suits[j]);
                    curCard++;
                }
            }
        }

        Shuffle();
    }

    private void Shuffle() {
        //TODO: implement
    }

    public void DealCards(Hand[] theHands) {
        //TODO: implement
    }
}
