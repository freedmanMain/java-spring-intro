package base.spring.model.impl;

import base.spring.model.AbstractPet;
import base.spring.model.Pet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("catBean")
@Scope("prototype")
public class Cat extends AbstractPet implements Pet {
    @Override
    @Value("${pet.cat.name}")
    public void setPetName(String petName) {
        super.setPetName(petName);
    }

    @Override
    @Value("${pet.cat.age}")
    public void setPetAge(int petAge) {
        super.setPetAge(petAge);
    }

    @Override
    public void voice() {
        System.out.println("Meow! Meow!");
    }

    @PostConstruct
    protected void init() {
        System.out.println("Cat was created.");
    }

    @PreDestroy
    protected void destroy() {
        System.out.println("This method doesn't called because bean scope type is 'prototype'");
    }
}
