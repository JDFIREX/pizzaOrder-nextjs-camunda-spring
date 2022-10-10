package com.example.workflow.pizza;

import com.example.workflow.pizza.dao.Pizza;
import com.example.workflow.pizza.dto.PizzaDto;
import org.mapstruct.Mapper;

@Mapper
public interface PizzaMapper {

    PizzaDto toDto(Pizza pizza);

}
