package org.totalbeginner.tutorial;

public class Person {

	private String name = "unknown";
	private int maximumBooks = 3;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the maximumBooks
	 */
	public int getMaximumBooks() {
		return maximumBooks;
	}
	/**
	 * @param maximumBooks the maximumBooks to set
	 */
	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	public String toString() {
		return getName() + "(" + this.getMaximumBooks() + ")";
	}
}
