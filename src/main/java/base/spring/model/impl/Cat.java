package base.spring.model.impl;

import base.spring.model.Pet;

public class Cat implements Pet {
    @Override
    public void voice() {
        System.out.println("Meow! Meow!");
    }
}
