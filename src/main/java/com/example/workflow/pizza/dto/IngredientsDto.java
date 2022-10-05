package com.example.workflow.pizza.dto;

import javax.validation.constraints.NotBlank;

public class IngredientsDto {

    @NotBlank
    private String name;
}
