package base.spring.model.impl;

import base.spring.model.AbstractPet;
import base.spring.model.Pet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
@Scope("prototype")
public class Dog extends AbstractPet implements Pet {
    @Override
    @Value("${pet.dog.name}")
    public void setPetName(String petName) {
        super.setPetName(petName);
    }

    @Override
    @Value("${pet.dog.age}")
    public void setPetAge(int petAge) {
        super.setPetAge(petAge);
    }

    @Override
    public void voice() {
        System.out.println("Woof! Woof!");
    }

    @PostConstruct
    protected void init() {
        System.out.println("Dog was created.");
    }

    @PreDestroy
    protected void destroy() {
        System.out.println("This method doesn't called because bean scope type is 'prototype'");
    }
}
