package com.example.workflow.pizzaOrder.model.dto;

import javax.validation.constraints.NotBlank;

public class IngredientsDto {

    @NotBlank
    private String name;
}
