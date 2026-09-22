package edu.towson.cis.cosc442.project1.monopoly;

public class GoCell extends Cell {
	/**
	 * Constructs a GoCell and sets its name to "Go" and availability to false.
	 */
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	/**
	 * Performs the action associated with landing on the Go cell, currently no operation.
	 */
	public void playAction() {
	}
	
	/**
	 * Overrides setName to do nothing, preventing name changes for GoCell.
	 * @param name the name to set, ignored in this method
	 */
	void setName(String name) {
	}
}
