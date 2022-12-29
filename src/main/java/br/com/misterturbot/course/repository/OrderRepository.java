package br.com.misterturbot.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.misterturbot.course.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
