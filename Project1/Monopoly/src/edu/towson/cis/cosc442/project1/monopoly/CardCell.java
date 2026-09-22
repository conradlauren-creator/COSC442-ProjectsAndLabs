package edu.towson.cis.cosc442.project1.monopoly;

public class CardCell extends Cell {
    private int type;
    
    /**
     * Constructs a CardCell with the specified type and name.
     * @param type the type of the card cell
     * @param name the name of the card cell
     */
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    /**
     * Executes the action associated with this card cell, currently with no implemented behavior.
     */
    public void playAction() {
    }
    
    /**
     * Returns the type identifier of this card cell.
     * @return the integer type of the card cell
     */
    public int getType() {
        return type;
    }
}
