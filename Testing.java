package assignment2;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To receive input
		Scanner input = new Scanner(System.in);
		
		// Creating a new object from view class
		StudentView view = new StudentView();
		
		// Counter to loop the process
		boolean looping = true;
		
		while(looping) {
			// Displaying information about this program
			System.out.println("This program is able to \n(a)Save data for a new student into the database." + "\n(b)Retrieve a student's info from the database using the student's id.");
			// Offer choice for user and receive input
			System.out.print("\nInsert 1 for option (a), insert 2 for option (b):");
			int option = input.nextInt();
			
			// Check input and request value again if input is not available
			while(option != 1 && option != 2) {
				System.out.println("Invalid input. Please enter again.");
				System.out.println("Insert 1 for option (a), insert 2 for option (b):");
				option = input.nextInt();
			}
			
			// Displaying the result based on the choice
			view.displayMenu(option);
			
			// Request input from user to loop the process
			System.out.println("Enter 1 to continue, enter 2 to escape.");
			if (input.nextInt() == 1)
				looping = true;
			else
				looping = false;
		}
		
	}

}