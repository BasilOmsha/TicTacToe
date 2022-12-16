package data;

public class TicTacToe {
	
	  // stores the current state of the game in a two dimensional list
	  // ' ' represents an empty cell
	  // 'X' and 'O' represent the players
	 private char[][] board = {
	    {' ', ' ', ' '},
	    {' ', ' ', ' '},
	    {' ', ' ', ' '}
	  };

	  // stores the current player
	  // 'X' or 'O'
	  private char player = 'X';
	  
	  
	  
	public TicTacToe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicTacToe(char[][] board, char player) {
		super();
		this.board = board;
		this.player = player;
	}

	public char[][] getBoard() {
		return this.board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}

	public char getPlayer() {
		return this.player;
	}

	public void setPlayer(char player) {
		this.player = player;
	}

}
