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
	public void setup(){
		b1 = new Book("War and Peace"); 
		b2 = new Book("Под Игото");
		p1 = new Person();
		p2 = new Person();
		p1.setName("Fred");
		p2.setName("Ганчо");
		ml = new MyLibrary("Test");
	}

	//test constructor
	@Test
	public void testMyLibrary() {
		assertEquals("Test", ml.name);
		assertTrue(ml.books instanceof ArrayList<?>);
		assertTrue(ml.people instanceof ArrayList<?>);
	}

	@Test
	public void testGetName(){
		assertEquals("Test", ml.getName());
		
	}
	@Test
	public void testAddBook(){
		assertEquals(0, ml.getBooks().size());
		ml.addBook(b1);
		ml.addBook(1,b2);
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
}
