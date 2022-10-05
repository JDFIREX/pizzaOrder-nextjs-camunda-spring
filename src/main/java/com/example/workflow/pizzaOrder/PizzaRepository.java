package com.example.workflow.pizzaOrder;

import com.example.workflow.pizza.dao.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PizzaRepository extends JpaRepository<Pizza, String> {
}
