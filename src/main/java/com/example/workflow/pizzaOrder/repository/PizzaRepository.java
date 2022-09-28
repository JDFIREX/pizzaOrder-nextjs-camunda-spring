package com.example.workflow.pizzaOrder.repository;

import com.example.workflow.pizzaOrder.model.dao.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, String> {
}
