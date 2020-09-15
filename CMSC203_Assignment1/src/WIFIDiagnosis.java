import java.util.Scanner;

public class WIFIDiagnosis {
	
	//Private global variables 
	Scanner sc = new Scanner(System.in);
	
	//Public methods
	public void intro()
	{
		
		System.out.print("\nHello!! This Wifi Diagnostics test can help you troube shoot any problems you may have with your wifi\n");	
		System.out.print("Press enter to continue...");
		sc.nextLine();
	}
	
	public void stepOne()
	{	
		//user entered choice holder variable
		String choice;
		Boolean check;
		
		//loops if input validation is failed
		do {
		System.out.print("\nReboot your computer, this may solve the problem ");
		System.out.print("\nDid this solve your problem? (yes or no): ");
		choice = sc.nextLine();
		
		//yes?
		check = inputVal(choice);
		}while(!check.booleanValue());		
		
	}
	
	public void stepTwo()
	{	
		//user entered choice holder variable
		String choice;
		Boolean check;
		
		//loops if input validation is failed
		do {
		System.out.print("\nReboot your Router and try to reconnect");
		System.out.print("\nDid this solve your problem? (yes or no): ");
		choice = sc.nextLine();
		
		//yes?
		check = inputVal(choice);
		}while(!check.booleanValue());		
	}
	
	public void stepThree()
	{
		//user entered choice holder variable
		String choice;
		Boolean check;
		
		//loops if input validation is failed
		do {
		System.out.print("\nMake sure all cables are properly connected to the router, power may not be properly getting to the router");
		System.out.print("\nDid this solve your problem? (yes or no): ");
		choice = sc.nextLine();
		
		//yes?
		check = inputVal(choice);
		}while(!check.booleanValue());		
	}
	
	public void stepFour()
	{
		//user entered choice holder variable
		String choice;
		Boolean check;
		
		//loops if input validation is failed
		do {
		System.out.print("\nThere may be interference between your computer and the router, try moving it closer to the router");
		System.out.print("\nDid this solve your problem? (yes or no): ");
		choice = sc.nextLine();
		
		//yes?
		check = inputVal(choice);
		}while(!check.booleanValue());		
	}
	
	public void lastChance()
	{
		System.out.print("\nUnfortnately, your only option is to contact your ISP");	
	}
	
	//checks if yes was entered
	private boolean inputVal(String C) {
		if(C.equalsIgnoreCase("Yes"))
		{
			ifYes();
		}
		else if (C.equalsIgnoreCase("No"))
		{
			return true;
		}
		//if neither yes or no
		return false;
	}
	
	//Outputs end message
	private void ifYes() {
		System.out.print("\nWonderful!!\nThank you for using Wifi diagnosis by Brad Reynoso.");
		closeSC();
		System.exit(0);
	}
	
	public void closeSC() {
		System.out.print("\nGoodbye\n");
		sc.close();
	}
}
