package base.spring.model.impl;

import base.spring.model.Pet;

public class Dog implements Pet {
    @Override
    public void voice() {
        System.out.println("Woof! Woof!");
    }
}
