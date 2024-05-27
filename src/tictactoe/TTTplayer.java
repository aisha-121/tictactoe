package tictactoe;

public class TTTplayer {

	
	// Declares a private String variable 'name' to hold the name of the player.
		// The 'private' keyword restricts access to this variable, meaning it can only be accessed within the same class.
		// This encapsulation ensures the player's name is protected from unauthorized access and modification from outside the class.
		 private String name;
		 
		// Declares a private char variable 'mark' to hold the game marker for the player, which could be either 'X' or 'O'.
		// Similar to 'name', the 'private' keyword ensures that 'mark' can only be accessed and modified through methods within the same class,
		// adhering to the principle of encapsulation. This helps maintain the integrity of the player's mark, ensuring it can be controlled and validated.
		 private char mark; // This is 'X' or 'O'
		 
		 
		// Constructor that initializes a player object with a name and a mark
		// Demonstrates the use of the 'this' keyword to distinguish between class fields and constructor parameters
		    public TTTplayer(String name, char mark) {
		    	this.name = name; // Assigns the input name to the player's name
		        this.mark = mark; // Assigns the input mark to the player's name
		}

		    // Getter method for the player's name
		    // Encapsulation: Provides controlled access to the player's name
		    public String getName() {
		        return name;
		    }

			 // Getter method for the player's mark
			 // Encapsulation: Provides controlled access to the player's mark
		    public char getMark() {
		        return mark;
		    }
		    
}
