/**
 * 
 */
package school.management.system;

/**
 * @author solomon
 * This class is responsible for keeping track of 
 * students id, name, grade and fees 
 */
public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	/**
	 * To create a new student by initializing
	 * Fees for every student is $30,000
	 * initial fee paid is $0.00
	 * @param id id for the student: unique
	 * @param name name of the student
	 * @param grade grade of the student
	 */
	
	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	//Not altering student's name and id
	
	
	/**
	 * Used to update student's grade.
	 * @param grade new grade of the student
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	/**
	 * Keep adding the fees to feesPaid field
	 * Add the fees to the fee paid
	 * The School will receive the funds
	 * @param fees the fees paid by student
	 */
	public void payFees(int fees) {
		feesPaid += fees;
		School.udateTotalMoneyEarned(feesPaid);
	}

	/**
	 * 
	 * @return id of student
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return name of student
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return grade of student
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * 
	 * @return FeesPaid by the students
	 */
	public int getFeesPaid() {
		return feesPaid;
	}

	
	/**
	 * 
	 * @return Feestotal of student
	 */
	public int getFeesTotal() {
		return feesTotal;
	}

	/**
	 * 
	 * @return the remaining fees
	 */
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	
	@Override
	public String toString() {
		return "Student's name :" + name + 
				". Total fees paid so far $" + feesPaid;
	}
	
	
}
