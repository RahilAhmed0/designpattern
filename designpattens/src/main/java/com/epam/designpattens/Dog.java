package com.epam.designpattens;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating, woof!");
    }    
}
