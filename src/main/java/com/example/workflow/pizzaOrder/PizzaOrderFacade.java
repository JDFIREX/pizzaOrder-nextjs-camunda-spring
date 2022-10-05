package com.example.workflow.pizzaOrder;

import com.example.workflow.pizzaOrder.dao.PizzaOrder;
import com.example.workflow.pizzaOrder.dto.PizzaOrderDto;
import com.example.workflow.pizzaOrder.enums.PizzaOrderStatus;
import com.example.workflow.pizzaOrder.validation.PizzaOrderCreateValidation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
class PizzaOrderFacade {
    private final PizzaOrderRepository pizzaOrderRepository;
    private final PizzaOrderMapper pizzaOrderMapper;
    private final PizzaOrderCreateValidation pizzaPreValidation;

    PizzaOrderDto create(PizzaOrderDto pizzaOrderDto) {
        pizzaPreValidation.validate(pizzaOrderDto);

        PizzaOrder pizzaOrder = pizzaOrderMapper.toEntity(pizzaOrderDto);
        pizzaOrder.setStatus(PizzaOrderStatus.ACKNOWLEDGE);

        PizzaOrder savedPizzaOrder = pizzaOrderRepository.save(pizzaOrder);
        log.info(String.format("Order saved in database, id: %s", savedPizzaOrder.getId()));

        return pizzaOrderMapper.toDto(savedPizzaOrder);
    }
}
