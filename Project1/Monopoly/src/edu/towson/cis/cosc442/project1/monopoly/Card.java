package edu.towson.cis.cosc442.project1.monopoly;

public abstract class Card {

    public static int TYPE_CHANCE = 1;
    public static int TYPE_CC = 2;

    /**
     * Returns the label text of the card.
     * @return The label text of the card.
     */
    public abstract String getLabel();
    /**
     * Executes the action defined by the card.
     */
    public abstract void applyAction();
    /**
     * Returns the card type identifier.
     * @return An integer representing the card type, either TYPE_CHANCE or TYPE_CC.
     */
    public abstract int getCardType();
}
