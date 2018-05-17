package library;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;


class JunitTests {
	
Library generateTestData(Library lib)
{
lib.addNewMember("Name1", "Surname1", "Address1", 111111111);
lib.addNewMember("Name2", "Surname2", "Address2", 222222222);
lib.addNewMember("Name3", "Surname3", "Address3", 333333333);
lib.addNewMember("Name4", "Surname4", "Address4", 444444444);
lib.addNewMember("Name5", "Surname5", "Address5", 555555555);
lib.addNewMember("Name6", "Surname6", "Address6", 666666666);
lib.addNewMember("Name7", "Surname7", "Address7", 777777777);
lib.addNewMember("Name8", "Surname8", "Address8", 888888888);
lib.addNewMember("Name9", "Surname9", "Address9", 999999999);
lib.addNewMember("Name10", "Surname10", "Address10", 000000000);

lib.addBook("Book1", "A1", 1900);
lib.addBook("Book2", "A1", 1901);
lib.addBook("Book3", "A2", 1900);
lib.addBook("Book4", "A2", 1902);
lib.addBook("Book5", "A3", 1905);
lib.addBook("Book6", "A4", 1906);
lib.addBook("Book7", "A5", 1907);
lib.addBook("Book8", "A6", 1900);
lib.addBook("Book9", "A2", 1903);
lib.addBook("Book10", "A3", 1904);	
return lib;

}
	@Test
	void checkIfBookAdded()
	{
		Library l = new Library();
		assertEquals(0,l.testBooksSize());
		l.addBook("Book1", "Author1", 1992);
		assertEquals(1,l.testBooksSize());
		l.addBook("Book2", "Author2", 1900);
		assertEquals(2,l.testBooksSize());		
	}
	
	@Test
	void checkIfBookRemoved()
	{
	    final ByteArrayOutputStream out = new ByteArrayOutputStream();System.setOut(new PrintStream(out));

		Library l = new Library();
		l.addBook("Book1", "Author1", 1992);
		assertEquals(1,l.testBooksSize());
		l.removeBook(1);
		assertEquals(0,l.testBooksSize());
		generateTestData(l);
		assertEquals(10,l.testBooksSize());
		l.removeBook(5);
		assertEquals(9,l.testBooksSize());
		
		//if id doesn't exist
		l.removeBook(15);
		 assertEquals("\nCannot find book with this id... please check and try again!\r\n", out.toString());
		 //if book is not available
		 l.borrowBook(4, 2);
		 out.reset();
		 l.removeBook(4);
		 assertEquals("\n This book is not available - please check who has it\r\n", out.toString());
		 
	}
	
	@Test
	void testSearch()
	{
		Library l = new Library();
		l = generateTestData(l);	//generates test data for object
		assertEquals(1,l.testgetBookList().filterBooks("Book1", null, null));	//filterbooks return size of filtered array
		assertEquals(2,l.testgetBookList().filterBooks(null, "A1", null));
		assertEquals(3,l.testgetBookList().filterBooks(null, null, 1900));
		assertEquals(1,l.testgetBookList().filterBooks("Book3", "A2", null));
		assertEquals(0,l.testgetBookList().filterBooks(null, null, null));				
	}	
	
	@Test
	void testShowAll()
	{
		Library l = new Library();
		l = generateTestData(l);
		
		assertEquals(10,l.showAllBooks());
		
	}
	
	@Test
	void testMemberADD()
	{
		Library l = new Library();
		assertEquals(0,l.testgetMemberList().getAL().size());
		l.addNewMember("m1", "m2", "M3", 5555);
		assertEquals(1,l.testgetMemberList().getAL().size());
		l.addNewMember("m3", "m3", "M4", 5555);
		assertEquals(2,l.testgetMemberList().getAL().size());
	}

	

}
