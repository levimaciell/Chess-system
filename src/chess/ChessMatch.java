package chess;

import chess.enums.Color;
import entities.boardgame.Board;

public class ChessMatch {

	private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	
	private Board board;
	
	public ChessMatch() {
		
		this.board = new Board(8,8);
		
	}
	
	public ChessPiece[][] getPieces(){
		
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for(int k = 0; k < board.getRows(); k++) {
			for(int i = 0; i < board.getColumns(); i++) {
				mat[k][i] = (ChessPiece) board.piece(k, i);
				
			}
		}
		
		return mat;
	}
	
	
}
