package br.com.chrezende.userBooks.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("User")
public class User {

	@Id
	private String cpf;
	private String name;
	private String email;
	private List<Book> books;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public User(String cpf, String name, String email, List<Book> books) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.email = email;
		this.books = books;
	}

}
