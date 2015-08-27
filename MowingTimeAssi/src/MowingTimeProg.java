import java.util.Scanner;

public class MowingTimeProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the length of the lawn.");
		double length = keyboard.nextDouble();
		
		System.out.print("Please enter the width of the lawn.");
		double width = keyboard.nextDouble();
		
		System.out.println("The square yardage is " + length * width + " sq yards.");
		System.out.println("The mowing time will be " + 2 * length * width + " minutes.");
	}

}
