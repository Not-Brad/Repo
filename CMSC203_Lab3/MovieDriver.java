import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		//scanner object
		Scanner sc = new Scanner(System.in);
		//movie object
		Movie M = new Movie();
		String c;
		//begin loop here
		do {
		
		//input name of film
		System.out.print("Please input the name of the film: ");		
		M.setTitle(sc.nextLine());
		
		//input rating
		System.out.print("Please enter the rating: ");
		M.setRating(sc.nextLine());
		
		//input tickets sold
		System.out.print("Please enter the number of tickets sold: ");
		M.setSoldTickets(sc.nextInt());
		
		sc.nextLine();
		
		//Output
		System.out.print(M.toString());
		
		//loop check
		System.out.print("\nWould to enter another? Enter yes or no: ");
		c = sc.nextLine();
			
		}while(c.equals("yes"));
		
	System.out.print("\nGoodbye\n");
	//close scanner
	sc.close();
	}

}
