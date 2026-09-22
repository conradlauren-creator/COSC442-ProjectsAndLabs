package edu.towson.cis.cosc442.project1.monopoly;

public class FreeParkingCell extends Cell {

	/**
	 * Constructs a FreeParkingCell and sets its name to "Free Parking".
	 */
	public FreeParkingCell() {
		setName("Free Parking");
	}

	/**
	 * Performs the action for landing on the Free Parking cell, which has no effect.
	 */
	public void playAction() {
		return;
	}
}
