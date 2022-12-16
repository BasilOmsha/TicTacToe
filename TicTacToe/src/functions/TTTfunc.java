package functions;

import data.TicTacToe;

public class TTTfunc extends TicTacToe {
	
	private TicTacToe data = new TicTacToe();
	
	
	public TTTfunc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TTTfunc(char[][] board, char player) {
		super(board, player);
		// TODO Auto-generated constructor stub
	}

	public TTTfunc(TicTacToe data) {
		super();
		this.data = data;
	}

	public TicTacToe getData() {
		return this.data;
	}

	public void setData(TicTacToe data) {
		this.data = data;
	}

	/*checks whether the current player has won by 
	 * checking the rows, columns and diagonals*/
	public boolean checkWinner() {
		// check the rows
		for (int i = 0; i < 3; i++) {
			if (data.getBoard()[i][0] == data.getPlayer() && 
					data.getBoard()[i][1] == data.getPlayer()
					&& data.getBoard()[i][2] == data.getPlayer()) {
				return true;
			}
		}

		// check the columns
		for (int j = 0; j < 3; j++) {
			if (data.getBoard()[0][j] == data.getPlayer() && 
					data.getBoard()[1][j] == data.getPlayer() 
					&& data.getBoard()[2][j] == data.getPlayer()) {
				return true;
			}
		}

		// check the diagonals
		if (data.getBoard()[0][0] == data.getPlayer() && 
				data.getBoard()[1][1] == data.getPlayer() 
				&& data.getBoard()[2][2] == data.getPlayer()) {
			return true;
		}
		if (data.getBoard()[0][2] == data.getPlayer() && 
				data.getBoard()[1][1] == data.getPlayer() 
				&& data.getBoard()[2][0] == data.getPlayer()) {
			return true;
		}

		return false;
	}

	// checks whether the board is full
	public boolean fullBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (data.getBoard()[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	// places the current player's symbol at the specified position
	public boolean SymbolBoardLocation(int row, int col) {
		// check if the specified position is empty
		if (data.getBoard()[row][col] == ' ') {
			data.getBoard()[row][col] = data.getPlayer();
			return true;
		}
		return false;
	}

	// Changes the player
	public void changePlayer() {
		if (data.getPlayer() == 'X') {
			data.setPlayer('O');
		} else if (data.getPlayer() == 'O') {
			data.setPlayer('X');
		}
	}

	// prints the current state of the board to the console
	public void currentBoardStatus() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(data.getBoard()[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// prints a decorative board
	public void printDecBoard() {
		for (int i = 0; i < 3; i++) {
				System.out.print(data.getBoard()[i][i] + 
						"************TIC************"
						+ "TAC************"
						+ "TOE************"
								);
			System.out.println("");
		}
	}

}
