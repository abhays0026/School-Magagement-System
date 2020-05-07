package SchoolManagementSystem;

import java.util.*;

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * A new school object is created
	 * @param teachers : List of the teachers in school
	 * @param students : List of the students in school
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		this.totalMoneyEarned = 0;
		this.totalMoneySpent = 0;
	}

	/**
	 * @return list of teachers of the school
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * @return list of the students of the school
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * @return the totalMoneyEarned by the school
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * @return the totalMoneySpent
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * @param teachers : adds new teacher to set
	 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * @param students : adds a new student to the list
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	/**
	 * @param moneyEarnerd : adds to the totalMoney earned
	 * by the school
	 */
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}

	/**
	 * updates the money spent by the school
	 * which is salary given by the school 
	 * to its teachers
	 * @param moneySpent : updates the money spent
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
	     totalMoneySpent += moneySpent;
	     totalMoneyEarned -= moneySpent;
	}
	
	

}
