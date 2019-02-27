/**
 * 
 */
package school.management.system;

/**
 * @author solo4
 * This class is responsible for keeping track
 * of teacher's name, id, salary
 */
public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	
	/**
	 * Create a new teacher object
	 * @param id id for the teacher
	 * @param name name of the teacher
	 * @param salary salary of the teacher
	 */
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.setSalaryEarned(0);
	}
	
	/**
	 * 
	 * @return id of Teacher
	 */
	public int getId() {
		return id;
	}
	
	
	/**
	 * 
	 * @return name of teacher
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return salary of teacher
	 */
	public int getSalary() {
		return salary;
	}

	
	/**
	 * 
	 * @param salary of teacher
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	/**
	 * Adds to salary
	 * Removes from the total money earned by school
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		setSalaryEarned(getSalaryEarned() + salary);
		School.updateTotalMoneySpent(salary);
	}

	/**
	 * @return the salaryEarned
	 */
	public int getSalaryEarned() {
		return salaryEarned;
	}

	/**
	 * @param salaryEarned the salaryEarned to set
	 */
	public void setSalaryEarned(int salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	
	@Override
	public String toString() {
		return "Teachers's name :" + name + 
				". Total salary earned so far $" + salaryEarned;
	}
}
