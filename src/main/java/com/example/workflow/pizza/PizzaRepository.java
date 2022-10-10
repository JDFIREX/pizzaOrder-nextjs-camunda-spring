package com.example.workflow.pizza;

import com.example.workflow.pizza.dao.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, String> {
}
