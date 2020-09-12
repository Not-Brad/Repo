import java.util.Scanner;

public class SphereVolume 
{ 
public static void main(String[] args) 
{ 
	Scanner sc = new Scanner(System.in);
	
// add your declaration and code here 
	System.out.print("This program will find the volume of your sphere, you have been warned\n");
	
	double radius;
	
	System.out.print("Good, now enter the diameter of your sphere: ");
	double diameter = sc.nextDouble();
	
	radius = diameter/2;
	
	final double volume = ((4.0/3) * (Math.PI) * Math.pow(radius, 3)); 
	
	System.out.print("The volume is " + volume);
	
	
} 
} 
