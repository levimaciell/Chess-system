package chess;

import chess.enums.Color;
import chess.pieces.King;
import chess.pieces.Rook;
import entities.boardgame.Board;

public class ChessMatch {

	private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	
	private Board board;
	
	public ChessMatch() {
		
		this.board = new Board(8,8);
		initialSetup();
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
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
}
