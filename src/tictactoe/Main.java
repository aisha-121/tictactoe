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
        String player1Name = scanner.nextLine(); // Set string name to the next line user inputs
        System.out.println("Please enter a name for Player 2 (O): ");
        String player2Name = scanner.nextLine(); // Set string name to the next line user inputs

	}

}
