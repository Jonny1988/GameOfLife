package de.brenner.jonathan.gameoflife.game.gamefield;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Jonathan
 *
 */
@AllArgsConstructor
public class Cell {
	
	private boolean alive = false;
	/*
	 * No Getter and Setter for the position because the position could not be
	 * changed during the whole game
	 */
	private int positionXAxis;
	private int positionYAxis;
	

	public Cell(int xAxis, int yAxis, boolean randomLifeStatus) {
		// TODO Auto-generated constructor stub
	}


	public boolean isAlive() {
		return alive;
	}


	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
}