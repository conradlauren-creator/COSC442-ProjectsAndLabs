package edu.towson.cis.cosc442.project1.monopoly;

public class GoToJailCell extends Cell {
	
	/**
	 * Constructs a Go to Jail cell and sets its name to "Go to Jail".
	 */
	public GoToJailCell() {
		setName("Go to Jail");
	}

	/**
	 * Sends the current player directly to jail.
	 */
	public void playAction() {
		Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		GameMaster.instance().getGameBoard().queryCell("Jail");
		GameMaster.instance().sendToJail(currentPlayer);
	}
}
