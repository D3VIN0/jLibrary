package library;


class Book {
	private int bookID = 0;
	private static int count = 1;
	private String bookTitle;
	private int bookYear;
	private String bookAuthor;
	private boolean available;
	private Member whoHas;
	
	
	/* Constructor */
	Book(String title,String author,int year)
	{
		setBookTitle(title);
		setBookYear(year);
		setBookAuthor(author);
		setAvailable(true);
		whoHas = new Member("-","-","-",0,0);
		setBookID(count++);
	}
	
	/*Functions*/
	String basicInfo()	//return basic info of book id/title/author/release year/availiblity
	{
		return "\nID: " + getBookID()
		+ "\tTitle: " + getBookTitle()
		+ "\tAuthor: " + getBookAuthor()
		+ "\tRelease year: " + getBookYear()
		+ "\tAvailable: " + availiblity();	
	}
	
	private String availiblity()	//return yes if book is available or no if book is not available
	{
		if(isAvailable())
		{
			return "yes";
		}else
		{
			return "no";
		}
	}
	
	boolean compareTitle(String title)
	{
		if(getBookTitle().equals(title))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	boolean compareAuthor(String author)
	{
		if(getBookAuthor().equals(author))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	boolean compareYear(int year)
	{
		if(getBookYear() == year)
		{
			return true;
		}else
		{
			return false;
		}
	}	
	
	/**
	 */
	/**
	 * @return the bookTitle
	 */
	public String getBookTitle() {
		return bookTitle;
	}
	/**
	 * @param bookTitle the bookTitle to set
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	/**
	 * @return the bookYear
	 */
	public int getBookYear() {
		return bookYear;
	}
	/**
	 * @param bookYear the bookYear to set
	 */
	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}
	/**
	 * @return the bookAuthor
	 */
	public String getBookAuthor() {
		return bookAuthor;
	}
	/**
	 * @param bookAuthor the bookAuthor to set
	 */
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}

	/**
	 * @return the bookID
	 */
	public int getBookID() {
		return bookID;
	}

	/**
	 * @param bookID the bookID to set
	 */
	private void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public Member getWhoHas() {
		return whoHas;
	}

	public void setWhoHas(Member whoHas) {
		this.whoHas = whoHas;
	}

}
