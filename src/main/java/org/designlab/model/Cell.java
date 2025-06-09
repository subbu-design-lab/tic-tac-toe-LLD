package org.designlab.model;
/**
 * Author: subramanyamadimulam
 * Date: 05/06/25
*/
 
public class Cell {

    private int row;
    private int column;
    private Player player;
    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.player = null;
    }

    public boolean isEmpty() {
        return player == null;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public String display() {
        return player == null ? "-" : player.symbol().toString();
    }

}
