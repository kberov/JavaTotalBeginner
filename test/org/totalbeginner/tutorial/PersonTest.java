package org.totalbeginner.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
	@Test
	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown", p1.getName());
		assertEquals(3, p1.getMaximumBooks());
	}

	@Test
	public final void testSetName() {
		Person p1 = new Person();
		p1.setName("Краси");
		assertEquals("Краси", p1.getName());
		
	}

	@Test
	public final void testSetMaximumBooks() {
		Person p2 = new Person();
		p2.setMaximumBooks(12);
		assertEquals(12, p2.getMaximumBooks());
		
	}
	
	@Test
	public void testToString(){
		Person p3 = new Person();
		
		assertEquals("unknown(3)", p3.toString());
	}
}
