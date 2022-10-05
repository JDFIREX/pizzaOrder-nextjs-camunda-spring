package com.example.workflow.pizzaOrder;

import com.example.workflow.pizzaOrder.dao.PizzaOrder;
import com.example.workflow.pizzaOrder.dto.PizzaOrderDto;
import org.mapstruct.Mapper;

@Mapper
interface PizzaOrderMapper {
    PizzaOrder toEntity(PizzaOrderDto pizzaOrderDto);
    PizzaOrderDto toDto(PizzaOrder pizzaOrder);

}
