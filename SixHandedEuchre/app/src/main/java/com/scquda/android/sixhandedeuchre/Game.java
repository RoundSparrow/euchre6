package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 7/22/2015.
 */
public class Game {
    //This class should be the only thing the GameActivity creates and accesses
    //Function calls here should do all the background logic to get what is needed

    public static final int NUM_PLAYERS = 6;

    private int mScores[];
    private Round mCurrentRound;

    public Game() {
        mScores = new int[NUM_PLAYERS];
        for (int i = 0; i < NUM_PLAYERS; i++) {
            mScores[i] = 0;
        }
    }

    public void playCard(int player, int card) {
        //TODO: implement. Called from Activity
    }

    //TODO: implement other functions for the Activity to access Round and Game info
}
