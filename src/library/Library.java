package library;


public class Library {
	private BookList Books;
	private MemberList Members;

	public Library()
	{
		BookList b = new BookList();
		this.Books = b;
		
		MemberList m = new MemberList();
		this.Members = m;
	}
	
	//function to add new book to database	
	public void addBook(String title,String author, int year)
	{
		Books.newBook(title, author, year);
	}
	
	//function to remove book from BookList via ID (checking if Book exist and is available)
	public void removeBook(int bookID)
	{
		Books.removeBook(bookID);
	}
	
	//function to show all books from the library
	public int showAllBooks()
	{
		Books.displayAllBooks();
		return Books.displayAllBooks();
	}
	
	// function to check who has book if its not available
	public void checkWhoHas(int bookID)
	{
		Books.checkWhoHas(bookID);
	}
	
	// function that display all info about a book
	public void showDetails(int bookID)
	{
		Books.showAllInfo(bookID);
	}
	
	//function to borrow a book to a member (also checking if it can be done)
	public void borrowBook(int bookID,int memID)
	{
		Books.borrowBook(bookID, memID, Members);
	}
	
	//function to filter books specified of arguments(title,author,year)
	public void filterBooks(String title,String author,Integer year)
	{
		String t = title;
		String a = author;
		Integer y = year;
		
		if(title == null)
		{
			t = null;
		}
		if(author == null)
		{
			a = null;
		}
		if(year == null)
		{
			y = null;
		}
		Books.filterBooks(t, a, y);
	}
	
	//function to add new member of the library
	public void addNewMember(String name,String surname,String address,int phone)
	{
		Members.addNewMember(name, surname, address, phone);
	}
	
	//Test functions
	int testBooksSize()
	{
		return Books.returnBooksTest().size();
	}
	
	BookList testgetBookList()
	{
		return this.Books;
	}
	
	MemberList testgetMemberList()
	{
		return this.Members;
	}

}
