package com.example.workflow.pizzaOrder.model.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Pizza {

    @Id
    private String id = UUID.randomUUID().toString();

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Ingredients> ingredients;

}
