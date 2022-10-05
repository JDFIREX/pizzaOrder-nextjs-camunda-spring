package com.example.workflow.pizzaOrder;

import com.example.workflow.pizzaOrder.dto.PizzaOrderDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class PizzaOrderController {
    private final PizzaOrderFacade pizzaOrderFacade;
    private final ObjectMapper objectMapper;

    @PostMapping
    public ResponseEntity<PizzaOrderDto> create(@Valid @RequestBody PizzaOrderDto pizzaOrderDto) throws JsonProcessingException {
        log.info(String.format("Received PizzaOrder %s", objectMapper.writeValueAsString(pizzaOrderDto)));
        PizzaOrderDto createdPizzaOrder = pizzaOrderFacade.create(pizzaOrderDto);
        return new ResponseEntity<>(createdPizzaOrder, HttpStatus.CREATED);
    }
}
