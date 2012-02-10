package org.totalbeginner.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test
	public final void testBook() {
		Book b1 = new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unknown author", b1.author);
	}
	@Test
	public void testGetPerson(){
		Book b2 = new Book("Война и Мир");
		Person p2 = new Person();
		p2.setName("Минчо");
		//to whom the book is loaned?
		b2.setPerson(p2);
		//which is the name of the person ho has the book
//		Person testPerson = b2.getPerson();
//		String personName = testPerson.getName();
		String personName = b2.getPerson().getName();
		assertEquals("Минчо", personName);
		
	}
}
