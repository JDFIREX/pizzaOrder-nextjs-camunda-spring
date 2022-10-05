package com.example.workflow.pizzaOrder;

import com.example.workflow.pizzaOrder.dao.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PizzaOrderRepository extends JpaRepository<PizzaOrder, String> {
}

