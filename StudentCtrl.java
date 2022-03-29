package assignment2;

import java.sql.*;

public class StudentCtrl {
	private Student model;
	private StudentView view;
	
	public StudentCtrl(Student model, StudentView view) {
		this.model = model;
		this.view = view; 
	}
	
	public void insertData(int id, String name, double mathMark, double scienceMark, String department) throws SQLException {
		Student student = new Student();
		// Connect to database
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?" + "user=root&password=ziyang123");	
		
		// Create a statement to retrieve objects
		Statement stmt = conn.createStatement();        
		
		stmt.executeUpdate("INSERT INTO STUDENT VALUES (" + id + ", '" + name + "', " + scienceMark + ", " + mathMark + ", '" + department+ "');");
		
		System.out.println("Data saved Successfully!");
	}
	
	public void getStudent(int id) throws SQLException {
		Student student = new Student();
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?" + "user=root&password=ziyang123");	
		Statement stmt = conn.createStatement();
		// SQL statement to retrieve data for specific student with id
		String sql = "SELECT * FROM STUDENT where id ='" + id +"'";
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			student.setMath_Mark(rs.getInt("mathMark"));
			student.setScience_Mark(rs.getInt("scienceMark"));
			student.setDepartment(rs.getString("department"));
		}
		view.displayStudentMarks(student.getId(), student.getName(), student.getMath_Mark(), student.getScience_Mark(),student.getDepartment());
		
		
	}
}
