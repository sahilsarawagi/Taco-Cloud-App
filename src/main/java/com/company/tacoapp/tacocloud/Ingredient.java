package com.company.tacoapp.tacocloud;

import lombok.Data;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;


// We can remove these error sign by installing lombok plugin on the ide, even if you run your app with these error message related to lombok your app will work fine
// these error will resolve at compile time by lombok
//    public Ingredient(String id, String name, Type type) {   // these class constructor and like getter and setter all are generated by lombok at compile time
//        this.id = id;
//        this.name = name;
//        this.type = type;
//    }

    public enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE;
    }

}
