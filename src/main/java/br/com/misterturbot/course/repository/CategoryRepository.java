package br.com.misterturbot.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.misterturbot.course.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
