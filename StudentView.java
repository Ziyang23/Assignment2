package assignment2;

import java.util.Scanner;
import java.sql.SQLException;
public class StudentView {
	public void displayMenu(int option) {
	Student student = new Student();
	StudentCtrl controller = new StudentCtrl(student, this);
	Scanner sc = new Scanner(System.in);
	
	if (option == 1) {
		try {
			System.out.println("Insert Student data ");
			System.out.print("Student ID: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Math Mark: ");
			double mathMark = sc.nextDouble();
			
			System.out.print("Science Mark: ");
			double scienceMark = sc.nextDouble();
			
			System.out.print("Department: ");
			String department = sc.next();
			controller.insertData(id, name, mathMark, scienceMark, department);
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	else if (option == 2) {
		System.out.print("\nEnter Student id: ");
		int id = sc.nextInt();
		try {
			controller.getStudent(id);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}
		
		//method to display student's marks
		public void displayStudentMarks(int id, String name, double mathMark, double scienceMark, String department) {
	        System.out.println("\nStudent Marks");
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + department);
	        System.out.println("Math: " + mathMark);
	        System.out.println("Science: " + scienceMark);
		}
}
