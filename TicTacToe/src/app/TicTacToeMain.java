package app;

import java.util.Scanner;

import data.TicTacToe;
import functions.TTTfunc;

public class TicTacToeMain {

	public static void main(String[] args) {

		// creating objects
		TTTfunc f = new TTTfunc();

		// Getting the data from the function class to get the player data when the
		// player switches
		TicTacToe data = f.getData();

		// Initiating scanner inputs parameter
		int row = 0;
		int col = 0;

		Scanner scanner = new Scanner(System.in);

		// Just a title with the game rules
		System.out.println(" ");

		f.printDecBoard();
		f.printDecBoard(); // decorative boards

		System.out.println(" ************Welcome to to the tic-tac-toe game!********** ");
		System.out.println(" ");
		System.out.println("How to play:" + "\n" + "\n" + " 1. First player to start is the X player." + "\n"
				+ " 2. Players will be asked to enter the row number(location). Row" + "\n"
				+ " 3. numbers are from 0 to 2 and then the column number also between 0 and 2.");
		System.out.println(" ");

		// The game
		while (true) {
			// print the board
			f.currentBoardStatus();

			// prompt the user to enter a row numbers
			System.out.print("Player " + data.getPlayer() + ", specify row location: ");
			// Validate row input
			do {
				while (!scanner.hasNextInt()) {
					System.out.println("Invalid row input. Please choose a number from 0 to 2.");
					System.out.print("Player " + data.getPlayer() + ", specify row location: ");
					scanner.next();
				}
				row = scanner.nextInt();
				if (row < 0 || row > 2) {
					System.out.println("Invalid row input. Please choose a number from 0 to 2.");
					System.out.print("Player " + data.getPlayer() + ", specify row location: ");
					while (!scanner.hasNextInt()) {
						System.out.println("Invalid row input. Please choose a number from 0 to 2.");
						System.out.print("Player " + data.getPlayer() + ", specify row location: ");
						scanner.next();
					}
				}
			} while (row < 0 || row > 2);

			// prompt the user to enter a column numbers
			System.out.print("Player " + data.getPlayer() + ", specify column location: ");
			// Validate column input
			do {
				while (!scanner.hasNextInt()) {
					System.out.println("Invalid column input. Please choose a number from 0 to 2.");
					System.out.print("Player " + data.getPlayer() + ", specify column location: ");
					scanner.next();
				}
				col = scanner.nextInt();
				if (col < 0 || col > 2) {
					System.out.println("Invalid column input. Please choose a number from 0 to 2.");
					System.out.print("Player " + data.getPlayer() + ", specify column location: ");
					while (!scanner.hasNextInt()) {
						System.out.println("Invalid column input. Please choose a number from 0 to 2.");
						System.out.print("Player " + data.getPlayer() + ", specify column location: ");
						scanner.next();
					}
				}
			} while (col < 0 || col > 2);

			// place the symbol at the specified position
			if (f.SymbolBoardLocation(row, col)) {
				// check if the player has won
				if (f.checkWinner()) {
					f.currentBoardStatus();
					System.out.println("Player " + data.getPlayer() + " has won!");
					break;
				}

				// check if the board is full
				if (f.fullBoard()) {
					f.currentBoardStatus();
					System.out.println("It is a draw!");
					break;
				}

				// switch to the other player
				f.changePlayer();
			} else {
				// the specified position was not empty
				System.out.println("Position taken, try again!");
			}

		}

	}

}
