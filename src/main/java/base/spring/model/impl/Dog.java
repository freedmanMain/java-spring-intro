package base.spring.model.impl;

import base.spring.model.Pet;

public class Dog extends AbstractPet implements Pet {
    @Override
    public void voice() {
        System.out.println(getVoice());
    }

    @Override
    public void destroy() {
        System.out.println("Dog object is destroyed!");
    }
}
