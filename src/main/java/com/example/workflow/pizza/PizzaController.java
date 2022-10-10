package com.example.workflow.pizza;

import com.example.workflow.pizza.dto.PizzaDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/pizza")
@RequiredArgsConstructor
public class PizzaController {

    private final PizzaRepository pizzaRepository;

    private final PizzaMapper pizzaMapper;

    @GetMapping
    List<PizzaDto> get() {
        return pizzaRepository.findAll().stream().map(pizzaMapper::toDto).collect(Collectors.toList());
    }

}
