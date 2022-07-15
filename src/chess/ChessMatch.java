package chess;

import chess.enums.Color;
import chess.pieces.King;
import chess.pieces.Rook;
import entities.boardgame.Board;
import entities.boardgame.Position;

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
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
	}
}
