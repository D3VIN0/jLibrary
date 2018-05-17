Library Class methods

.addBook(String title,String author, int year) - Adding new book to library

.removeBook(int bookID) - Removing book from the library (if not borrowed)

.showAllBooks() - Showing all books in the library

.checkWhoHas(int bookID) - checking who has book

.showDetails(int bookID) - showing details of book

.borrowBook(int bookID,int memID) - function to borrow book to member

.filterBooks(String title,String author,Integer year) - function to search books specified by arguments - set null to skip any parameter

.addNewMember(String name,String surname,String address,int phone) - function to add new member of the library


Testing:
Manual tests can be run via TestManual.java file.

JUnit automate tests at JunitTests.java file

You have to import library.Library package to use main class

@M.P. 2018