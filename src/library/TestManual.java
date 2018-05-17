package library;


class TestManual {
static final String nl = "\n---------------------------------------------------------------------------";	
	
	public static void main(String[] args) {
	Library l = new Library();
	
	l.addBook("AddedBook", "A7", 1800); //should add new book and show 1 books total now
	
	System.out.println(l.testBooksSize());	// should print 1
	
	System.out.println(nl);
	
	l.showAllBooks(); // should display 1 book info
	
	System.out.println(nl);
	
	l.removeBook(1);	//id doesn't duplicate even if book has been deleted
	
	System.out.println(l.testBooksSize());	//should print 0
	
	System.out.println(nl);
	
	l.showAllBooks(); // should print 0 books
	System.out.println(nl);
	
	/*TESTING books*/
	l.addBook("Book1", "A1", 1900);
	l.addBook("Book2", "A1", 1901);
	l.addBook("Book3", "A2", 1900);
	l.addBook("Book4", "A2", 1902);
	l.addBook("Book5", "A3", 1905);
	l.addBook("Book6", "A4", 1906);
	l.addBook("Book7", "A5", 1907);
	l.addBook("Book8", "A6", 1900);
	l.addBook("Book9", "A2", 1903);
	l.addBook("Book10", "A3", 1904);	
	
	/*-------------------------*/
	
	l.showAllBooks(); // should show 10 books - all available - id doesn't duplicate even if book has been deleted
	System.out.println(nl);
	/*Testing search function*/
	l.testgetBookList().filterBooks("Book1", null, null);	// display books meeting criteria - should be only 1 book
	System.out.println(nl);
	l.testgetBookList().filterBooks(null, "A1", null);	// should display 2 books
	System.out.println(nl);
	l.testgetBookList().filterBooks(null, null, 1900);	// should display 3 books
	System.out.println(nl);
	l.testgetBookList().filterBooks("Book3", "A2", null);	//should display 1 book
	System.out.println(nl);
	l.testgetBookList().filterBooks(null, null, null);	// shouldn't display any book and print info
	System.out.println(nl);
	/**/
	
	/*Test members*/
	l.addNewMember("Name1", "Surname1", "Address1", 111111111);
	l.addNewMember("Name2", "Surname2", "Address2", 222222222);
	l.addNewMember("Name3", "Surname3", "Address3", 333333333);
	l.addNewMember("Name4", "Surname4", "Address4", 444444444);
	l.addNewMember("Name5", "Surname5", "Address5", 555555555);
	l.addNewMember("Name6", "Surname6", "Address6", 666666666);
	l.addNewMember("Name7", "Surname7", "Address7", 777777777);
	l.addNewMember("Name8", "Surname8", "Address8", 888888888);
	l.addNewMember("Name9", "Surname9", "Address9", 999999999);
	l.addNewMember("Name10", "Surname10", "Address10", 000000000);
	/**/
	
	/*Testing borrow functions*/
	l.borrowBook(2, 2);	// borrow book id 2 to member 2
	l.checkWhoHas(2);	//lets see who has book id 2
	System.out.println(nl);
	l.checkWhoHas(3); // if we check for book which is available
	System.out.println(nl);
	l.checkWhoHas(255); // if such book deosn't exist
	System.out.println(nl);
	/**/
	
	/*Info tests*/
	l.showDetails(2); // lets see info about book id 2
	System.out.println(nl);
	l.showDetails(3); // available book
	System.out.println(nl);
	l.showDetails(255); // book doesn't exist
	/**/
	
	}
}