
package edu.towson.cis.cosc442.project1.monopoly;

public class GameBoardFreeParking extends GameBoard {
	/**
	 * Constructs a GameBoardFreeParking instance with Jail, FreeParking, and GoToJail cells added.
	 */
	public GameBoardFreeParking() {
		super();
		JailCell jail = new JailCell();
		FreeParkingCell freeParking = new FreeParkingCell();
		GoToJailCell goToJail = new GoToJailCell();
		addCell(jail);
		addCell(freeParking);
		addCell(goToJail);

	}
}
