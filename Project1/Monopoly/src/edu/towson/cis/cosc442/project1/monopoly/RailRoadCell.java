package edu.towson.cis.cosc442.project1.monopoly;

public class RailRoadCell extends Cell {
	static private int baseRent;
	static public String COLOR_GROUP = "RAILROAD";
	static private int price;

	/**
	 * Sets the base rent amount for all railroad properties.
	 * @param baseRent the base rent value to set
	 */
	public static void setBaseRent(int baseRent) {
		RailRoadCell.baseRent = baseRent;
	}

	/**
	 * Sets the purchase price for all railroad properties.
	 * @param price the price value to set
	 */
	public static void setPrice(int price) {
		RailRoadCell.price = price;
	}
	
	/**
	 * Returns the current purchase price of the railroad property.
	 * @return the price of the railroad property
	 */
	public int getPrice() {
		return RailRoadCell.price;
	}

	/**
	 * Calculates and returns the rent owed based on the number of railroads owned by the owner.
	 * @return the rent amount to be paid
	 */
	public int getRent() {
		return RailRoadCell.baseRent * (int)Math.pow(2, theOwner.numberOfRR() - 1);
	}
	
	/**
	 * Executes the action triggered when a player lands on this railroad cell, including rent payment if applicable.
	 */
	public void playAction() {
		Player currentPlayer = null;
		if(!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
			if(theOwner != currentPlayer) {
				currentPlayer.payRentTo(theOwner, getRent());
			}
		}
	}
}
