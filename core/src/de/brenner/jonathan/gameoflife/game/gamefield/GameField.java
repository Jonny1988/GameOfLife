package de.brenner.jonathan.gameoflife.game.gamefield;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Jonathan
 *
 */
public class GameField {

	private int sizeXAxis;
	private int sizeYAxis;
	private double maxmiumAliveCells;
	
	@Getter
	@Setter
	private Cell[][] gameField;
	
	/**
	 * 
	 * @param sizeXAxis
	 * @param sizeYAxis
	 */
	public GameField(int sizeXAxis, int sizeYAxis) {
		super();
		this.sizeXAxis = sizeXAxis;
		this.sizeYAxis = sizeYAxis;
		this.maxmiumAliveCells = ((sizeXAxis * sizeYAxis) * 0.4);
		gameField = new Cell[sizeXAxis][sizeYAxis];
		generateCellsForGameField();
	}
	
	/**
	 * This method creeates a {@link GameField} with at max 40% alive {@link Cell}s.
	 */
	private void generateCellsForGameField() {
		for(int xAxis = 0; xAxis <this.sizeXAxis;xAxis++) {
			for(int yAxis = 0; yAxis <this.sizeYAxis;yAxis++) {
				gameField[xAxis][yAxis] = new Cell(xAxis,yAxis,getRandomLifeStatus());
			}
		}
	}
	
	/**
	 * TODO
	 * This method generates the life status of a {@link Cell}.
	 * @return boolean
	 */
	private boolean getRandomLifeStatus() {
		return false;
	}
	
	/**
	 * TODO
	 * @param positionXAxis
	 * @param positionYAxis
	 * @return
	 */
	public Cell getCellFromPosition(int positionXAxis, int positionYAxis) {
		return null;
	}
	
	/**
	 * TODO
	 * @param positionXAxis
	 * @param positionYAxis
	 * @return
	 */
	public boolean getCellStatusFromPosition(int positionXAxis, int positionYAxis) {
		return gameField[positionXAxis][positionYAxis].isAlive();
	}

}