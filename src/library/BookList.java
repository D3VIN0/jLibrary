package library;
import java.util.ArrayList;
import java.util.function.Predicate;


 class BookList {
	private ArrayList<Book> Books;	//create new ArrayList of Books
	static int countl = 0;
	/*Const*/
	private static final String notfound = "\nCannot find book with this id... please check and try again!";
	private static final String notavailable = "\n This book is not available - please check who has it";
	private static final String completed = "\nCompleted... you can pass this book to the lender now";
	private static final String av = "\nBook is available...";
	private static final String hasBook = "\n\t\t Person who has this book";
	private static final String filter = "\nYou didn't pass any argument, try again,,,";
	
	
	/**/
	
	 BookList()	//constructor of BookList object
	{
		ArrayList<Book> bList = new ArrayList<Book>();
		this.Books = bList;
	}
	
	/*BookList Functions */
	
	 void newBook(String t,String a, int y)	//function to add new book to database
	{
		Book nb = new Book(t,a,y);	//create new book object
		Books.add(nb);	// add book to ArrayList
	}
	
	 void removeBook(int id)	//function to remove book from BookList via ID (checking if Book exist and is available)
	{
		boolean exist = false;
		boolean available = false;
		for(Book b : Books)
		{
			if(b.getBookID() == id)
			{
				if(b.isAvailable())
				{
					available = true;
					exist = true;
				}else
				{
					System.out.println(notavailable);
					exist = true;
				}
			}
		}
		
		if(available && exist)
		{
			Predicate<Book> bookPredicate = b-> b.getBookID() == id;	//find object of this id and delete from ArrayList
			Books.removeIf(bookPredicate);
		}
		if(!exist)
		{
			System.out.println(notfound);
		}
	}
	
	 int displayAllBooks()	//function to show all books
	{
		int tl = 0;
		for(Book b : Books)
		{
			System.out.println(b.basicInfo());
			tl++;
		}
		System.out.println("\n\nNumber of all books in the library: " + Books.size()
				+ "\nAvailable: " + (Books.size() - countl)
				+ "\nBorrowed: " + countl);
		return tl;
	}

	 void checkWhoHas(int id) // function to check who has book
	{
		boolean found = false;
		
		for(Book b : Books)
		{
			if(id == b.getBookID())
			{
				if(b.isAvailable())
				{

					System.out.println(av);
					found = true;
				}else
				{
					System.out.println(hasBook
							+ b.getWhoHas().getAllInfo());
					found = true;
				}
				
			}
		}
		
		if(!found)
		{
			System.out.println(notfound);
		}
	}

	 void showAllInfo(int id)	// function shows all info about a book
	{
		boolean exist = false;
		for(Book b : Books)
		{
			if(id == b.getBookID())
			{
				exist = true;
				System.out.println(b.basicInfo());
				if(!b.isAvailable())
				{
					System.out.println(hasBook + b.getWhoHas().getAllInfo());
				}
			}
		}
		if(!exist)
		{
			System.out.println(notfound);
		}	
	}
	
	 void borrowBook(int id,int memId,MemberList m) //function to borrow a book to a member (also checking if it can be done)
	{
		boolean found = false;
		Member p = null;
		
		for(Book b : Books)
		{
			if(id == b.getBookID())
			{
				if(!b.isAvailable())	//if book is not available
				{
					System.out.println(notavailable);
					found = true;
				}else	//if book is available
				{
					for(Member mem : m.getAL())
					{
						if(memId == mem.getMemID())
						{
							p = mem;
						}
					}
					if(p!=null)
					{
					System.out.println(completed);
					found = true;
					b.setAvailable(false);
					countl++;
					b.setWhoHas(p);
					}else
					{
						System.out.println("Member doesn't exist...");
					}
				}
			}
		}
		if(!found)
		{
			System.out.println(notfound);
		}
	}

	 int filterBooks(String title,String author,Integer year)
	{
		boolean add = true;
		ArrayList<Book> filtered = new ArrayList<>();	//create array which will store filtered Books
		
		if(title == null && author == null && year == null)
		{
			System.out.println(filter);
		}
		else
		{
		for(Book b : Books)	//checking if books meet criteria and add to filtered array if yes
		{
			add = true;
			if(title!= null && !b.compareTitle(title))
			{
				add = false;
			}
			if(author!= null && !b.compareAuthor(author))
			{
				add = false;
			}
			if(year!= null && !b.compareYear(year))
			{
				add = false;
			}
		if(add)
		{
			filtered.add(b);
		}
		}
		
		for(Book f: filtered)
		{
			System.out.println(f.basicInfo());
		}
		
		}
		return filtered.size();
	}
	//*Test functions*//
	ArrayList<Book> returnBooksTest()
	{
		return this.Books;
	}
}
