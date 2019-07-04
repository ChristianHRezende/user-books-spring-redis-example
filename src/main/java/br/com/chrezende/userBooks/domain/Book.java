package br.com.chrezende.userBooks.domain;

public class Book {
	private String title;
	private int pages;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Book(String title, int pages) {
		super();
		this.title = title;
		this.pages = pages;
	}

}
