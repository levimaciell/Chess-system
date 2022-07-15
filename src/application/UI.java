package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		
		for(int k = 0; k < pieces.length; k++) {
			System.out.print((8 - k) + " ");
			
			for(int i = 0; i < pieces.length; i++) {
				printPiece(pieces[k][i]);
			}	
			System.out.println();
		}
		
		System.out.println("  A B C D E F G H");
	}

	private static void printPiece(ChessPiece piece) {
		
		if(piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		
		System.out.print(" ");
	}
}
