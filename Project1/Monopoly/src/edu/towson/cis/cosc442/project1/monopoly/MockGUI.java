package edu.towson.cis.cosc442.project1.monopoly;

public class MockGUI implements MonopolyGUI {
    private boolean btnDrawCardState, btnEndTurnState, btnGetOutOfJailState;
    private boolean[] btnTradeState = new boolean[2];

    /**
     * Enables the 'End Turn' button for the specified player index.
     * @param playerIndex The index of the player for whom to enable the button
     */
    public void enableEndTurnBtn(int playerIndex) {
    }

    /**
     * Enables the UI elements associated with the specified player's turn.
     * @param playerIndex The index of the player whose turn is being enabled
     */
    public void enablePlayerTurn(int playerIndex) {
    }

    /**
     * Enables the purchase button for the given player index.
     * @param playerIndex The index of the player for whom to enable the purchase button
     */
    public void enablePurchaseBtn(int playerIndex) {
    }
	/**
	 * Returns an array representing the values of the two dice rolled.
	 * @return An integer array of length two containing the dice roll values.
	 */
	public int[] getDiceRoll() {
		int roll[] = new int[2];
		roll[0] = 2;
		roll[1] = 3;
		return roll;
	}

    /**
     * Checks if the draw card button is currently enabled.
     * @return True if the draw card button is enabled; false otherwise.
     */
    public boolean isDrawCardButtonEnabled() {
        return btnDrawCardState;
    }

    /**
     * Checks if the end turn button is currently enabled.
     * @return True if the end turn button is enabled; false otherwise.
     */
    public boolean isEndTurnButtonEnabled() {
        return btnEndTurnState;
    }
	
	/**
	 * Checks if the 'Get Out of Jail' button is currently enabled.
	 * @return True if the 'Get Out of Jail' button is enabled; false otherwise.
	 */
	public boolean isGetOutOfJailButtonEnabled() {
		return btnGetOutOfJailState;
	}

    /**
     * Checks if the trade button is enabled for a specific player index.
     * @param i The index of the player to check the trade button status for
     * @return True if the trade button is enabled for the specified player; false otherwise.
     */
    public boolean isTradeButtonEnabled(int i) {
        return btnTradeState[i];
    }

    /**
     * Moves a player from one position to another on the board.
     * @param index The index of the player to move
     * @param from The starting position index on the board
     * @param to The destination position index on the board
     */
    public void movePlayer(int index, int from, int to) {
    }

    /**
     * Opens a dialog for responding to a trade deal proposal.
     * @param deal The trade deal to respond to
     * @return A RespondDialog instance for handling the trade response.
     */
    public RespondDialog openRespondDialog(TradeDeal deal) {
        RespondDialog dialog = new MockRespondDialog(deal);
        return dialog;
    }

    /**
     * Opens a dialog to initiate a trade between players.
     * @return A TradeDialog instance to manage trade actions.
     */
    public TradeDialog openTradeDialog() {
        TradeDialog dialog = new MockTradeDialog();
        return dialog;
    }

    /**
     * Enables or disables the option to buy houses.
     * @param b True to enable the buy house option; false to disable
     */
    public void setBuyHouseEnabled(boolean b) {
    }

    /**
     * Enables or disables the draw card button.
     * @param b True to enable; false to disable the draw card button
     */
    public void setDrawCardEnabled(boolean b) {
        btnDrawCardState = b;
    }

    /**
     * Enables or disables the end turn button.
     * @param enabled True to enable; false to disable the end turn button
     */
    public void setEndTurnEnabled(boolean enabled) {
        btnEndTurnState = enabled;
    }

    /**
     * Enables or disables the 'Get Out of Jail' button.
     * @param b True to enable; false to disable the 'Get Out of Jail' button
     */
    public void setGetOutOfJailEnabled(boolean b) {
    	this.btnGetOutOfJailState = b;
    }

    /**
     * Enables or disables the purchase property button.
     * @param enabled True to enable; false to disable the purchase property button
     */
    public void setPurchasePropertyEnabled(boolean enabled) {
    }

    /**
     * Enables or disables the roll dice button.
     * @param b True to enable; false to disable the roll dice button
     */
    public void setRollDiceEnabled(boolean b) {
    }

    /**
     * Enables or disables the trade button for a specific player index.
     * @param index The player index to modify the trade button state for
     * @param b True to enable; false to disable the trade button
     */
    public void setTradeEnabled(int index, boolean b) {
        this.btnTradeState[index] = b;
    }

    /**
     * Displays the dialog window for buying houses to the specified player.
     * @param currentPlayer The player who is offered the option to buy houses
     */
    public void showBuyHouseDialog(Player currentPlayer) {
    }

    /**
     * Displays a message to the user.
     * @param string The message text to show
     */
    public void showMessage(String string) {
    }

	/**
	 * Displays the dice roll specific to utilities and returns the roll sum.
	 * @return The total value of the dice roll for utility calculations.
	 */
	public int showUtilDiceRoll() {
//		int[] diceValues = GameMaster.instance().rollDice();
//		return diceValues[0] + diceValues[1];
		return 10;
	}

    /**
     * Begins the Monopoly game session and initializes necessary components.
     */
    public void startGame() {
    }

	/**
	 * Updates the user interface to reflect the current game state.
	 */
	public void update() {
	}
}
