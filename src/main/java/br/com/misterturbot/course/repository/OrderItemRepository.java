package br.com.misterturbot.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.misterturbot.course.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
