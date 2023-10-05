package com.company.tacoapp.tacocloud;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;
@Data
public class Taco {
    @NotNull
    @Size(min=5,message = "Name must be at least 5 characters long")
    private String name;
    @NotNull
    @Size(min=1,message = "You must choose at least one ingredient")
    private List<Ingredient> ingredients;



}
