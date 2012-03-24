package org.totalbeginner.tutorial;

import java.util.ArrayList;

public class MyLibrary {

	String name;
	ArrayList<Book> books;
	ArrayList<Person> people;

	public MyLibrary(String name) {
		this.name = name;
		books = new ArrayList<Book>();
		people = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void addBook(Book b) {
		this.books.add(b);
	}

	/**
	 * 
	 * @param int i, Book b
	 * @see void java.util.ArrayList.add(int index, E element)
	 */
	public void addBook(int i, Book b) {
		this.books.add(i, b);
	}

	public boolean removeBook(Book b) {
		return this.books.remove(b);
	}

	public void addPerson(Person p) {
		this.people.add(p);

	}

	public boolean removePerson(Person p) {
		return this.people.remove(p);
	}

	public boolean checkOut(Book b, Person p) {
		if (b.getPerson() == null) {
			b.setPerson(p);
			return true;
		}
		return false;
	}

	public boolean checkIn(Book b) {
		if (b.getPerson() != null) {
			b.setPerson(null);
			return true;
		}
		return false;
	}

	public ArrayList<Book> getBooksForPerson(Person p) {
		// TODO Auto-generated method stub
		return null;
	}

}
