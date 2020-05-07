package SchoolManagementSystem;


/**
 * 
 * @author Abhay
 *This is a student class
 *Keeps the track of the students personal details
 *and the fees to paid by the student
 *
 *Fees for every student = $30000
 */

public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * 
	 * @param id : unique id for the student
	 * @param name : Name of the student
	 * @param grade : Grade in which the student is in 
	 */
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		feesPaid = 0;
		feesTotal = 30000;
	}
	
	//We are not going to alter a students name
	//Also , students id not to be altered
	
	/**
	 * used to update the students grade
	 * @param grade : new grade of the student
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	/**
	 * Add the fees to the feesPaid
	 * The school is going to recieve the funds
	 * 
	 * @param fees
	 */
	public void payFees(int fees) {
		
		this.feesPaid += fees;
		School.updateTotalMoneyEarned(fees);
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @return the feesPaid
	 */
	public int getFeesPaid() {
		return feesPaid;
	}

	/**
	 * @return the feesTotal
	 */
	public int getFeesTotal() {
		return feesTotal;
	}
	
	/**
	 * returns remaining fees
	 * @return
	 */
	public int getRemainingFees() {
		return feesTotal - feesTotal;
	}
		
	
	

}
