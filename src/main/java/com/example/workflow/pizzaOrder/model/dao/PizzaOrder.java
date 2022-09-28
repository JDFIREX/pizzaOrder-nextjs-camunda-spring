package com.example.workflow.pizzaOrder.model.dao;

import com.example.workflow.pizzaOrder.model.enums.OrderStatus;
import lombok.*;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PizzaOrder {

    @Id
    private String id = UUID.randomUUID().toString();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Pizza> pizza;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    private OffsetDateTime orderDate = OffsetDateTime.now();
}
