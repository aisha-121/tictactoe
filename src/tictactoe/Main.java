package tictactoe;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-----------");
		System.out.println("Tic Tac Toe");
		System.out.println("-----------");
		System.out.println();
		System.out.println("Welcome to Tic Tac Toe!!");
		
		
		System.out.println("Please enter a name for Player 1 (X): ");
        String player1Name = scanner.nextLine();
        System.out.println("Please enter a name for Player 2 (O): ");
        String player2Name = scanner.nextLine();
        
        TTTplayer player1 = new TTTplayer(player1Name, 'X'); // player 1 object
        TTTplayer player2 = new TTTplayer(player2Name, 'O'); // player 2 object

	}

}
