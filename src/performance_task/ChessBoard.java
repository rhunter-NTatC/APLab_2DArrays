package performance_task;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * DO NOT PLAY WITH THIS FILE
 * 
 * This is the Chess Board's menu
 * 
 */

public class ChessBoard {

	public static ChessPiece[][] board = new ChessPiece[8][8];

	public static void main(String[] args) {

		board[7][4] = new ChessPiece("King", 1, "E");
		board[5][1] = new ChessPiece("Queen", 3, "B");
		board[2][5] = new ChessPiece("Bishop", 6, "F");
		board[4][3] = new ChessPiece("knight", 4, "D");
		board[2][1] = new ChessPiece("Rook", 6, "B");
		board[0][5] = new ChessPiece("pawn", 8, "F");
		
		printBoard();
		System.out.println(); //print extra space
		
		menu();
		

	}

	public static void menu() {
		
		while (true) {
		
			printMenu();
	
			Scanner inKey = new Scanner(System.in);
	
			System.out.print("Input 1-4: ");
			int input = 0;
			try {
				input = inKey.nextInt();
			}
			catch (InputMismatchException e){
				System.out.println("\nNot a valid choice");
				continue;
			}
			
			System.out.println("\n");  //print extra space
			
			//to store uder inputs
			int row = 0;
			char column = 0;
			
			switch (input) {
				case 1:
					printBoard();
					break;
					
				case 2:
					//get user input for row and column
					row = getRow(false);
					column = getColumn(false);
					
					//print getMoves() return
					System.out.println(board[row][column - 64].getMoves(board, row, String.valueOf(column)));
					break;
					
				case 3:
					
					//get user input for row and column
					row = getRow(false);
					column = getColumn(false);
					int newRow = getRow(true);
					char newColumn = getColumn(true);
					
					board[row][column].movePiece(board, newRow, String.valueOf(newColumn));
					
					printBoard();
					
					break;
				case 4:
					System.out.println("Goodbye");
					return;
				default:
					System.out.println("Not a valid choice");
			}

			System.out.println(); //print extra space
		}
			
	}

	
	public static void printMenu() {
		System.out.println("");
		System.out.println("           Menu");
		System.out.println("---------------------------");
		System.out.println("  1: Print Board");
		System.out.println("  2: Move Piece");
		System.out.println("  3: Check Possible Moves");
		System.out.println("  4: Exit");
		System.out.println();
	}

	
	/*
	 * get the row number from the user.
	 * returned as int
	 * 
	 * if isNew = false it asks for the pieces current position
	 * if isNew = true it asks where you wish to move the piece
	 */
	public static int getRow(boolean isNew) {
		
		int row = 0;  //holds row number
		
		Scanner inKey = new Scanner(System.in);
		
		//loop until receive a valid input
		while (true) {
			if (isNew) {
				System.out.print("What row are you moving to? (1-8): ");
			}
			else {
				System.out.print("Enter the row of the piece you want to move (1-8): ");
			}
			
			//in case there's a bad input
			try { 
				row = inKey.nextInt();
				
				//check if input is not 1-8
				if (row < 1 || row > 8) {
					System.out.println("\nNot a valid choice\n");  //tell user it's a bad input
				}
				else {
					break;  //if good input stop loop
				}
			}
			catch (Exception e) {  //in case of bad input
				inKey.nextLine(); //stops infinity try catch loop
				System.out.println("\nNot a valid choice\n");  //tell user it's a bad input
			}
		}
		return row;
	}
	
	/*
	 * get the column letter from the user.
	 * returned as char
	 * 
	 * if isNew = false it asks for the pieces current position
	 * if isNew = true it asks where you wish to move the piece
	 */
	public static char getColumn(boolean isNew){
		char column = 0; //holds column letter
		
		Scanner inKey = new Scanner(System.in);  //create keyboard scanner
		
		//loop until receive valid input
		while (true) {
			
			//print appropriate prompt
			if (isNew) {
				System.out.print("What column are you moving to? (A-H): ");
			}
			else {
				System.out.print("Enter the column of the piece you want to move (A-H): ");
			}
			
			column = inKey.next().toUpperCase().charAt(0); //scan as an upper case char
			
			//check if it's NOT between A-H
			if (column < 65 || column > 72) { 
				System.out.println("\nNot a valid choice\n");
			}
			else {  //stop loop if it's a valid input 
				break; 
			}  
			
		}
		
		return column;  //return input
	}
	
	
	
	public static void printBoard() {

		String rows = "87654321"; // to pirnt row numbers
		System.out.println();
		for (int i = 0; i < board.length; i++) {

			System.out.print("    " + rows.charAt(i) + " "); // print row number

			for (int j = 0; j < board[i].length; j++) {

				if (board[i][j] == null) {
					if ((i + j) % 2 == 1) {
						System.out.print("_");
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print(board[i][j].getType().charAt(0));
				}
			}
			System.out.println();

		}
		System.out.println("\n      ABCDEFGH");

	}

}
