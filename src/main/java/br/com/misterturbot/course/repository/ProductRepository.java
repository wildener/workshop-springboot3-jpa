package br.com.misterturbot.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.misterturbot.course.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
