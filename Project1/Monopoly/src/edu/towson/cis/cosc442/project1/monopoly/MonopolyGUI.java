package edu.towson.cis.cosc442.project1.monopoly;

public interface MonopolyGUI {
	/**
	 * Enables or activates the 'End Turn' button for the specified player.
	 * @param playerIndex The index identifying the player for whom to enable the button
	 */
	public void enableEndTurnBtn(int playerIndex);
	/**
	 * Activates the UI elements and controls to indicate it is the specified player's turn.
	 * @param playerIndex The index of the player whose turn is to be enabled
	 */
	public void enablePlayerTurn(int playerIndex);
	/**
	 * Enables the purchase button for the specified player, allowing them to buy properties.
	 * @param playerIndex The index of the player for whom the purchase button is enabled
	 */
	public void enablePurchaseBtn(int playerIndex);
	/**
	 * Returns the current dice roll values as an array of two integers.
	 * @return An int array representing the dice roll results
	 */
	public int[] getDiceRoll();
    /**
     * Checks if the 'Draw Card' button is currently enabled and clickable.
     * @return True if the Draw Card button is enabled; false otherwise
     */
    public boolean isDrawCardButtonEnabled();
    /**
     * Determines whether the 'End Turn' button is currently enabled.
     * @return True if the End Turn button is enabled; false otherwise
     */
    public boolean isEndTurnButtonEnabled();
	/**
	 * Indicates if the 'Get Out of Jail' button is enabled for the player.
	 * @return True if the button to get out of jail is enabled; false otherwise
	 */
	public boolean isGetOutOfJailButtonEnabled();
    /**
     * Checks if the trade button is enabled for the specified player.
     * @param i The index of the player for whom to check the trade button status
     * @return True if the trade button is enabled for that player; false otherwise
     */
    public boolean isTradeButtonEnabled(int i);
	/**
	 * Moves the player from a starting position to a new position on the board.
	 * @param index The index of the player to move
	 * @param from The starting position index on the board
	 * @param to The destination position index on the board
	 */
	public void movePlayer(int index, int from, int to);
    /**
     * Opens the dialog window to respond to a trade deal presented to the player.
     * @param deal The trade deal object representing the terms to respond to
     * @return A RespondDialog instance for handling the trade response
     */
    public RespondDialog openRespondDialog(TradeDeal deal);
    /**
     * Opens and returns the dialog for initiating a new trade between players.
     * @return A TradeDialog instance for creating a new trade
     */
    public TradeDialog openTradeDialog();
    /**
     * Enables or disables the UI control for buying houses on properties.
     * @param b True to enable buying houses; false to disable
     */
    public void setBuyHouseEnabled(boolean b);
    /**
     * Sets the enabled state of the 'Draw Card' button.
     * @param b True to enable the draw card button; false to disable
     */
    public void setDrawCardEnabled(boolean b);
    /**
     * Enables or disables the 'End Turn' button in the interface.
     * @param enabled True to enable the end turn button; false to disable
     */
    public void setEndTurnEnabled(boolean enabled);
    /**
     * Sets whether the 'Get Out of Jail' button is enabled or disabled.
     * @param b True to enable the get out of jail button; false to disable
     */
    public void setGetOutOfJailEnabled(boolean b);
    /**
     * Enables or disables the button to purchase properties.
     * @param enabled True to enable purchasing properties; false to disable
     */
    public void setPurchasePropertyEnabled(boolean enabled);
    /**
     * Sets the enabled state for the roll dice button.
     * @param b True to enable rolling dice; false to disable
     */
    public void setRollDiceEnabled(boolean b);
    /**
     * Enables or disables the trade button for the specified player.
     * @param index The index of the player whose trade button is to be updated
     * @param b True to enable the trade button; false to disable
     */
    public void setTradeEnabled(int index, boolean b);
    /**
     * Displays the dialog for a player to buy houses on their properties.
     * @param currentPlayer The player who is attempting to buy houses
     */
    public void showBuyHouseDialog(Player currentPlayer);
    /**
     * Displays a message to the user through the GUI.
     * @param string The message text to show
     */
    public void showMessage(String string);
	/**
	 * Displays the dice roll for utilities and returns the dice sum.
	 * @return The total value of the utility dice roll
	 */
	public int showUtilDiceRoll();
	/**
	 * Initializes and starts the Monopoly game interface and related components.
	 */
	public void startGame();
	/**
	 * Updates the GUI to reflect the current state of the game.
	 */
	public void update();
}
