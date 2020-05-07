package SchoolManagementSystem;

/**
 * This class is responsible for  keeping the track
 * of the teacher details and salary
 * @author Abhay
 *
 */
public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	
	/**
	 * Created a teacher constructor
	 * @param id : id of the teacher
	 * @param name : name of the teacher
	 * @param salary : salary of the teacher
	 */
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	/**
	 * Returns the name of the teacher
	 * @return : name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 
	 * @return : id of the teacher
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * 
	 * @return : returns salary of the teacher
	 */
	public int getSalary() {
		return this.salary;
	}
	
	/**
	 * 
	 * @param salary : updates the salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * Adds to salary
	 * Removes from the total money earned by the school
	 * @param salary
	 */
	public void recieveSalary(int salary) {
		
		salaryEarned = salary;
		School.updateTotalMoneySpent(salary);
		
	}

}
