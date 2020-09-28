import java.util.Scanner;

public class RandomNumberGuesser {

	
	
	
	public static void main(String[] args) {
		
	
		Scanner userInput = new Scanner(System.in);
		int currGuess= 0, newGuess;
		//used for loop validation
		boolean a = false, ending = false, main = false;
		//my header stuff
		System.out.println("\n\tWelcome to Brad Reynoso's Random number guesser program!!!\n"
				+ "\tGood luck and have fun!!!!\n\nPress enter to continue...");
		userInput.nextLine();
		//new random number/initial random number loop
		do {
			
			
			//must be reset every time a new random number is used
			int rand = RNG.rand(), lowNum = 0, highNum = 100;
			
			//initial guess loop
			do {
				System.out.println("\nPlease enter your first guess: ");
				newGuess = userInput.nextInt();
				a = RNG.inputValidation(newGuess, lowNum, highNum);
			}while(a != true);
			
		
			//main guess validation loop
			do {
				System.out.println("Your number of guesses is " + (RNG.getCount()));
				
				//prevents an invalid input from being used as one of the limits
				currGuess = newGuess;
				
				//receives user input with separate validation metrics
				if(currGuess > rand) {
					do {
						//informs user that their guess will be set as maximum limit
						System.out.println("Your guess is too high"); highNum = currGuess;
						
						System.out.println("Enter your next guess between "+ lowNum + " and " + highNum +": " );
						newGuess = userInput.nextInt();
						a = RNG.inputValidation(newGuess, lowNum, highNum);
					}while(a != true);
				}
				else if(currGuess < rand) {
					do {
						//informs user that their guess will be set as minimum limit
						System.out.println("Your guess is too low"); lowNum = currGuess;
						
						System.out.println("Enter your next guess between "+ lowNum + " and " + highNum +": " );
						newGuess = userInput.nextInt();
						a = RNG.inputValidation(newGuess, lowNum, highNum);
					}while(a != true);
				}
				//if the user guesses correctly, they are told so and the system stores this info
				if(currGuess == rand)
				{
					System.out.println("\nCongratulations, you guessed correctly!!");
					main = true;
				}

			}while(main != true);
			
			String answer;
			//my header stuff
			
			userInput.nextLine();
			System.out.println("\n\tWould you like to play again? (yes or no)");
			answer = userInput.nextLine();
			
			if(answer.equalsIgnoreCase("yes")) {
				ending = false;
			}
			else {
				System.out.println("\n\tThank you for playing!!\n Goodbye...");
				ending = true;
			}
			
			
		}while(ending != true);
		userInput.close();
		
	}
	
}
