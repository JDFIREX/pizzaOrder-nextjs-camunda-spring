package com.example.workflow.pizzaOrder.api;

import com.example.workflow.pizzaOrder.mapper.PizzaOrderMapper;
import com.example.workflow.pizzaOrder.model.dao.PizzaOrder;
import com.example.workflow.pizzaOrder.model.dto.PizzaOrderDto;
import com.example.workflow.pizzaOrder.model.enums.OrderStatus;
import com.example.workflow.pizzaOrder.repository.PizzaOrderRepository;
import com.example.workflow.pizzaOrder.validation.PizzaPreValidation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@ResponseBody
@RequestMapping("/pizza-order")
@AllArgsConstructor
public class PizzaController {

    private final PizzaOrderRepository pizzaOrderRepository;
    private final PizzaOrderMapper pizzaOrderMapper;
    private final PizzaPreValidation pizzaPreValidation;

    @PostMapping
    public ResponseEntity<PizzaOrder> create(@Valid @RequestBody PizzaOrderDto pizzaOrderDto) {
        log.info(String.format("Received PizzaOrder %s", pizzaOrderDto));

        pizzaPreValidation.validate(pizzaOrderDto);

        PizzaOrder pizzaOrder = pizzaOrderMapper.toEntity(pizzaOrderDto);
        pizzaOrder.setStatus(OrderStatus.ACKNOWLEDGE);

        PizzaOrder savedPizzaOrder = pizzaOrderRepository.save(pizzaOrder);
        log.info(String.format("Order saved in database, id: %s", savedPizzaOrder.getId()));

        return new ResponseEntity<>(savedPizzaOrder, HttpStatus.CREATED);
    }
}
