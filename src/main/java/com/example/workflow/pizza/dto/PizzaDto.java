package com.example.workflow.pizza.dto;

import com.example.workflow.pizza.dto.IngredientsDto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.Set;

public class PizzaDto {

    @NotBlank
    private String name;

    @Valid
    private Set<IngredientsDto> ingredients;

}
