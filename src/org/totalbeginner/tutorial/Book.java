package org.totalbeginner.tutorial;

public class Book {
	//fields
	String title;
	String author;
	Person person;

	// constructor
	public Book(String string) {
		this.title = string;
		this.author = "unknown author";
	}

	// getters/setter
	/**
	 * @return the author
	 */
	public Object getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the title
	 */
	public Object getTitle() {
		return title;
	}

	public void setPerson(Person p2) {
		this.person = p2;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

}
