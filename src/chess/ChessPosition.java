package chess;

import chess.exception.ChessException;
import entities.boardgame.Position;

public class ChessPosition {

	private int row;
	private char column;
	
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
		}
		
		this.row = row;
		this.column = column;
	}
	

	public int getRow() {
		return row;
	}

	public char getColumn() {
		return column;
	}

	protected Position toPosition() {
		int toPositionRow = 8 - row;
		int toPositionColumn = column - 'a';
		return new Position(toPositionRow, toPositionColumn);
	}
	
	protected static ChessPosition fromPosition(Position position) {
		int fromPositionRow = 8 - position.getRow();
		char fromPositionColumn = (char) ((char)'a' + position.getColumn());
		
		return new ChessPosition(fromPositionColumn, fromPositionRow);
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}
