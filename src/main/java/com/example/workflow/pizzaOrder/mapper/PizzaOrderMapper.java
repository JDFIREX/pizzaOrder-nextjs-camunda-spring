package com.example.workflow.pizzaOrder.mapper;

import com.example.workflow.pizzaOrder.model.dao.PizzaOrder;
import com.example.workflow.pizzaOrder.model.dto.PizzaOrderDto;
import org.mapstruct.Mapper;

@Mapper
public interface PizzaOrderMapper {
    PizzaOrder toEntity(PizzaOrderDto pizzaOrderDto);

}
