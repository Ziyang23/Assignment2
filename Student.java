package assignment2;

//Model Class for Student
public class Student {
	private int id;
	private String name;
	private double math_Mark;
	private double science_Mark;
	private String department;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMath_Mark() {
		return math_Mark;
	}
	public void setMath_Mark(double math_Mark) {
		this.math_Mark = math_Mark;
	}
	public double getScience_Mark() {
		return science_Mark;
	}
	public void setScience_Mark(double science_Mark) {
		this.science_Mark = science_Mark;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
