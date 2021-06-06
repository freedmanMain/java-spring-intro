package base.spring.model.impl;

import base.spring.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("petOwnerBean")
@Scope("prototype")
public class PetOwner {
    @Value("${pet.owner.firstName}")
    private String firstName;
    @Value("${pet.owner.lastName}")
    private String lastName;
    private Pet pet;

    public PetOwner() {

    }

    public PetOwner(Pet pet) {
        this.pet = pet;
    }

    public PetOwner(String firstName, String lastName, Pet pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hi, my lovely pet <3");
        pet.voice();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Pet getPet() {
        return pet;
    }

    @Autowired
    @Qualifier("catBean")
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @PostConstruct
    protected void init() {
        System.out.println("PetOwner was created.");
    }

    @PreDestroy
    protected void destroy() {
        System.out.println("This method doesn't called because bean scope type is 'prototype'");
    }

    @Override
    public String toString() {
        return "PetOwner{" + "firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + ", pet=" + pet + '}';
    }
}
