package chess;

import chess.enums.Color;
import entities.boardgame.Board;
import entities.boardgame.Piece;
import entities.boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	} 
	
	public Color getColor() {
		return color;
	}

	public int getMoveCount() {
		return moveCount;
	}
	

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected void increaseMoveCount() {
		moveCount++;
	}
	
	protected void decreaseMoveCount() {
		moveCount--;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		 ChessPiece p = (ChessPiece) getBoard().piece(position);
		 return p != null && p.getColor() != color;
	}
	
	
	
}
