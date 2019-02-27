package school.management.system;

import java.util.List;

/**
 * @author solo4
 * Many teachers, many students.
 * Implement both using an ArrayList
 */
public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * new school object created
	 * @param teacher list of teachers in the school
	 * @param student list of students in the school
	 */
	public School(List<Teacher> teacher, List<Student> student) {
		super();
		this.teachers = teacher;
		this.students = student;
		School.totalMoneyEarned = 0;
		School.totalMoneySpent = 0;
	}

	/**
	 * @return the list of teachers in the school
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * @param teachers the teachers to to be add
	 */
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * @return the list of students in the school
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Add students to the school
	 * @param students the students to be added
	 */
	public void setStudents(Student student) {
		students.add(student);
	}

	/**
	 * @return the total Money Earned by the school
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Add the total money erned by the school
	 * @param totalMoneyEarned update the totalMoneyEarned 
	 */
	public static void udateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}

	/**
	 * @return the total Money Spent by the school
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * update the money spent by the school which is
	 * the salary given by the school to its teachers
	 * @param totalMoneySpent the totalMoneySpent spent
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}
	
	
	
	
}
