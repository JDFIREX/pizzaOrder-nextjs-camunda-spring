package com.example.workflow.pizzaOrder.model.dto;

import lombok.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PizzaOrderDto {

    @Valid
    private List<String> pizzaIds;

}
