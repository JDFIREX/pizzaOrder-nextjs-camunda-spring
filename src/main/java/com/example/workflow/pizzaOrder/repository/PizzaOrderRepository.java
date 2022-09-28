package com.example.workflow.pizzaOrder.repository;

import com.example.workflow.pizzaOrder.model.dao.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, String> {
}

