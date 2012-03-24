package org.totalbeginner.tutorial;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;

public class MyLibraryTest {

	private Book b1;
	private Book b2;
	private Person p1;
	private Person p2;
	private MyLibrary ml;

	@Before
	public void setup() {// not special in JUnit 4. @Before makes it special
		b1 = new Book("War and Peace");
		b2 = new Book("Под Игото");
		p1 = new Person();
		p2 = new Person();
		p1.setName("Fred");
		p2.setName("Ганчо");
		ml = new MyLibrary("Test");
	}

	// test constructor
	@Test
	public void testMyLibrary() {
		assertEquals("Test", ml.name);
		assertTrue(ml.books instanceof ArrayList<?>);
		assertTrue(ml.people instanceof ArrayList<?>);
	}

	@Test
	public void testGetName() {
		assertEquals("Test", ml.getName());

	}

	@Test
	public void testAddBook() {
		assertEquals(0, ml.getBooks().size());
		ml.addBook(b1);
		ml.addBook(1, b2);
		assertEquals(2, ml.getBooks().size());
		assertEquals(0, ml.getBooks().indexOf(b1));
		assertEquals(1, ml.getBooks().indexOf(b2));

		ml.removeBook(b1);
		assertEquals(1, ml.getBooks().size());
		assertEquals(0, ml.getBooks().indexOf(b2));

		assertTrue(ml.removeBook(b2));
		assertEquals(0, ml.getBooks().size());
	}

	@Test
	public void testAddPerson() {
		ml.addPerson(p1);
		ml.addPerson(p2);
		assertEquals(2, ml.getPeople().size());
		assertEquals(0, ml.getPeople().indexOf(p1));
		assertEquals(1, ml.getPeople().indexOf(p2));

		ml.removePerson(p1);
		assertEquals(1, ml.getPeople().size());
		assertEquals(0, ml.getPeople().indexOf(p2));
	}

	@Test
	public void testCheckOut() {
		addItems();
		assertTrue("Book did not chekout correctly.", ml.checkOut(b1, p1));
		assertEquals("Fred", b1.getPerson().getName());
		assertFalse("Book was already checked out.", ml.checkOut(b1, p2));

		assertTrue("Book chek in failed", ml.checkIn(b1));
		assertFalse("Book was already checked in.", ml.checkIn(b1));
		assertFalse("Book was never checked out.", ml.checkIn(b2));
		
		// additional test for maximumBooks
		p1.setMaximumBooks(1);
		addItems();
		assertTrue("First book did not check out", ml.checkOut(b2, p2));
		assertFalse("Second book should not have checked out.", 
				ml.checkOut(b1, p1));
	}

	public void addItems() {
		ml.addBook(b1);
		ml.addBook(b2);
		ml.addPerson(p1);
		ml.addPerson(p2);
	}
	
	@Test
	public void testGetBooksForPerson() {
		addItems();
		assertEquals(0, ml.getBooksForPerson(p1).size());
		ArrayList<Book> testBooks = ml.getBooksForPerson(p1);
		assertEquals(1, testBooks.size());
		assertEquals(0, testBooks.indexOf(b1));
		
		ml.checkOut(b2,p1);
		testBooks = ml.getBooksForPerson(p1);
		assertEquals(2, testBooks.size());
		assertEquals(1, testBooks.indexOf(b2));
	}
}
