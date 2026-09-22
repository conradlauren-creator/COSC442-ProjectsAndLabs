package edu.towson.cis.cosc442.project1.monopoly;


public class JailCard extends Card {
    int type;
    
    /**
     * Constructs a JailCard object with the specified card type.
     * @param cardType the type identifier for this JailCard
     */
    public JailCard(int cardType) {
        type = cardType;
    }

    /**
     * Applies the JailCard's effect by sending the current player directly to jail without collecting $200.
     */
    public void applyAction() {
        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		GameMaster.instance().getGameBoard().queryCell("Jail");
		GameMaster.instance().sendToJail(currentPlayer);
    }

    /**
     * Returns the integer value representing this JailCard's type.
     * @return the card type as an integer
     */
    public int getCardType() {
        return type;
    }

    /**
     * Provides a descriptive label for the JailCard's action.
     * @return a string describing the effect of the JailCard
     */
    public String getLabel() {
        return "Go to Jail immediately without collecting" +
        		" $200 when passing the GO cell";
    }
}
