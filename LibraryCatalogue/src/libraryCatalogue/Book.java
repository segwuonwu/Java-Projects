 package libraryCatalogue;

public class Book {
	
	// Properties, field, global variables
	String tittle;
	int pageCount;
	int ISBN;
	boolean isCheckedOut; // whether or not the book is checked out
	int dayCheckedOut = -1;
	
	/**
	 * @param tittle
	 * @param pageCount
	 * @param iSBN
	 */
	public Book(String tittle, int pageCount, int iSBN) {
		super();
		this.tittle = tittle;
		this.pageCount = pageCount;
		this.ISBN = iSBN;
		isCheckedOut = false;
	}

	//Getters --> Instance methods
	public String getTittle() {
		return this.tittle;
	}

	public int getPageCount() {
		return this.pageCount;
	}

	public int getISBN() {
		return this.ISBN;
	}

	public boolean getIsCheckedOut() {
		return this.isCheckedOut;
	}

	public int getDayCheckedOut() {
		return this.dayCheckedOut;
	}

	
	//SETTERS
	public void setIsCheckedOut(boolean isCheckedOut, int currentDayCheckedOut) {
		this.isCheckedOut = isCheckedOut;
		setDayCheckedOut(currentDayCheckedOut);
	}

	private void setDayCheckedOut(int dayCheckedOut) {
		this.dayCheckedOut = dayCheckedOut;
	}
	
	
	
	
}
