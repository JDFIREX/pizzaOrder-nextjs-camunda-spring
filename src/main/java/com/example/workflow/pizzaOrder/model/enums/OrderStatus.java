package com.example.workflow.pizzaOrder.model.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OrderStatus {
    ACKNOWLEDGE("acknowledge"),
    IN_PROGRESS("progress"),
    COMPLETED("complete"),
    CONFIRMED("confirmed"),
    CANCELLED("cancelled"),
    FAILED("failed");

    private String value;
}
