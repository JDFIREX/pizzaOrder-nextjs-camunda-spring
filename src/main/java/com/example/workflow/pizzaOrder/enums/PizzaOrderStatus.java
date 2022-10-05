package com.example.workflow.pizzaOrder.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PizzaOrderStatus {
    ACKNOWLEDGE("acknowledge"),
    IN_PROGRESS("progress"),
    COMPLETED("complete"),
    CONFIRMED("confirmed"),
    CANCELLED("cancelled"),
    FAILED("failed");

    private final String value;
}
