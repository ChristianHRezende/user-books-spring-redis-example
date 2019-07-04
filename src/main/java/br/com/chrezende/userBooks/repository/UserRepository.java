package br.com.chrezende.userBooks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.chrezende.userBooks.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{
	
}
