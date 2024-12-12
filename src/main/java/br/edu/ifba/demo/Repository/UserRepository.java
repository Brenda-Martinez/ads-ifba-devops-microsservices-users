package br.edu.ifba.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifba.demo.Entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);

    boolean existsByEmail(String email);
}