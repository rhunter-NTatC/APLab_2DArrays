package performance_task;

/*
 * This stores the information for 1 chess piece
 * 
 * It's methods should list the available moves for a given piece
 *   A2, B3, C4...
 * And it should move the piece to a new location.
 * 
 * Normal movement rules apply.
 * Assume all pieces are the same color.
 * 
 * Complete all the necessary methods.
 * 
 * Instance Variables and Constructor is already completed
 * getColumnNumber(), getType, and isOccupied() are already completed
 * 
 * 
 */

public class ChessPiece {

	private String type;	//the name of the piece
	private String column;	//the column the piece occupies
	private int row;		//the row the piece occupies
	
	//Standard Constructor
	public ChessPiece(String type, int row, String column) {
		this.type = type;
		this.row = row;
		this.column = column;
	}
	
	
	
	
	/*
	 * Returns all the possible moves for the given piece as a String.
	 * 
	 * Board is a 2D array of ChessPieces
	 * 
	 * It should not return moves the piece cannot get to.
	 * If there is no piece in the given location return a string syaing so.
	 */
	public String getMoves(ChessPiece[][] board, int row, String column) {
		return "";
	}
	
	
	
	
	/*
	 * Takes the 2D array representing the board, 
	 *    and letter/number representing the new position.
	 * 
	 * If the space is not occupied and no piece is in the 
	 *    way, it returns a new board with the desired move.
	 *    Otherwise the original board is returned.
	 *    
	 * Be sure to prompt the user if the move is not possible.
	 * 
	 */
	public ChessPiece[][] movePiece(ChessPiece[][] board, int newRow, String newColumn) {
		
		//choose the correct move method based upon the piece type
		
		return board;
	}
	
	
	
	
	/*
	 * These return the possible moves for the given piece
	 * 
	 * Normal movement rules apply
	 * 
	 * Assume all pieces on the board are the same color
	 * 
	 */
	private String kingsMoves() {
		return "";
	}
	private String pawnsMoves() {
		return "";
	}
	private String knightsMoves() {
		return "";
	}
	private String rooksMoves() {
		return "";
	}
	private String bishopsMoves() {
		return "";
	}
	private String queensMoves() {
		return "";
	}
	
	
	
	
	
	/*
	 * These move the piece based upon the piece's type.
	 * Example: moveKing() moves like the king piece
	 * 
	 * Only move if it's a legitimate move, no other piece 
	 *   is there and no other piece is in the way. 
	 */
	public ChessPiece[][] moveKing(ChessPiece[][] board, int newRow, String newColumn) {
		
		
		return board;
	}
	
	public ChessPiece[][] movePawn(ChessPiece[][] board, int newRow, String newColumn) {
		
		
		return board;
	}
	
	public ChessPiece[][] moveRook(ChessPiece[][] board, int newRow, String newColumn) {
		
		
	return board;
	}
	
	public ChessPiece[][] moveKnight(ChessPiece[][] board, int newRow, String newColumn) {
		
		
	return board;
	}
	
	public ChessPiece[][] moveBishop(ChessPiece[][] board, int newRow, String newColumn) {
		
		
	return board;
	}	
	
	public ChessPiece[][] moveQueen(ChessPiece[][] board, int newRow, String newColumn) {
		
		
		return board;
	}

	

	
	
	
	
	
	/*
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * THESE ARE ALREADY COMPLETED
	 * 
	 */
	
	public String getType() { return type;}
	
	
	
	/*
	 * Returns true if the place on the board is currently occupied.
	 * Otherwise it returns false.
	 */
	private boolean isOccupied(ChessPiece[][] board,int row, String column) {
		
		//if nothing is there
		if (board[row - 1][getColumnNumber(column)] == null) {
			return false;
		}
		return true;  //
	}
	
	
	/*
	 * Returns the number associated with the given column
	 */
	private int getColumnNumber(String column) {
		
		switch (column) {
		case "a": case "A":
			return 0;
		case "b": case "B":
			return 1;
		case "c": case "C":
			return 2;
		case "d": case "D":
			return 3;
		case "e": case "E":
			return 4;
		case "f": case "F":
			return 5;
		case "g": case "G":
			return 6;
		case "h": case "H":
			return 7;
		default:
			return 8;
		}
	}
	
	
	
	
	
	
}
