package chess.pieces;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.enums.Color;
import entities.boardgame.Board;

public class King extends ChessPiece{

	private ChessMatch chessMatch;
	
	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}
}
