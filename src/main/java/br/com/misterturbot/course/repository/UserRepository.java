package br.com.misterturbot.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.misterturbot.course.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
