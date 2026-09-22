package edu.towson.cis.cosc442.project1.monopoly;

public class PropertyCell extends Cell {
	private String colorGroup;
	private int housePrice;
	private int numHouses;
	private int rent;
	private int sellPrice;

	/**
	 * Returns the color group of this property cell.
	 * @return the color group as a String
	 */
	public String getColorGroup() {
		return colorGroup;
	}

	/**
	 * Returns the price of building one house on this property.
	 * @return the house price as an integer
	 */
	public int getHousePrice() {
		return housePrice;
	}

	/**
	 * Returns the number of houses currently built on this property.
	 * @return the number of houses as an integer
	 */
	public int getNumHouses() {
		return numHouses;
	}
    
    /**
     * Returns the selling price of this property.
     * @return the selling price as an integer
     */
    public int getPrice() {
		return sellPrice;
	}

	/**
	 * Executes getRent.
	 * @param 2(Low the input value
	 * @return the result
	 */
	public int getRent() {  //CCM: 2(Low)
		int rentToCharge = rent;
		String [] monopolies = theOwner.getMonopolies();
		rentToCharge = calculateMonopoliesRent(rentToCharge, monopolies);
		if(numHouses > 0) {
			rentToCharge = rent * (numHouses + 1);
		}
		return rentToCharge;
	}

	/**
	 * Executes calculateMonopoliesRent.
	 * @param rentToCharge the input value
	 * @param 3(Low the input value
	 * @return the result
	 */
	private int calculateMonopoliesRent(int rentToCharge, String[] monopolies) { //CCM: 3(Low)
		for(int i = 0; i < monopolies.length; i++) {
			if(monopolies[i].equals(colorGroup)) {
				rentToCharge = rent * 2;
			}
		}
		return rentToCharge;
	}

	/**
	 * Executes the action that occurs when a player lands on this property cell.
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

	/**
	 * Sets the color group of this property cell.
	 * @param colorGroup the new color group to set
	 */
	public void setColorGroup(String colorGroup) {
		this.colorGroup = colorGroup;
	}

	/**
	 * Sets the price of building one house on this property.
	 * @param housePrice the new house price to set
	 */
	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}

	/**
	 * Sets the number of houses currently built on this property.
	 * @param numHouses the new number of houses to set
	 */
	public void setNumHouses(int numHouses) {
		this.numHouses = numHouses;
	}

	/**
	 * Sets the selling price of this property.
	 * @param sellPrice the new selling price to set
	 */
	public void setPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	/**
	 * Sets the base rent amount for this property.
	 * @param rent the new rent amount to set
	 */
	public void setRent(int rent) {
		this.rent = rent;
	}
}
