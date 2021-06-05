package base.spring.model.impl;

import base.spring.model.Pet;

public class PetOwner {
    private String firstName;
    private String lastName;
    private Pet pet;

    public PetOwner() {

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

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "PetOwner{" + "firstName='" + firstName
                + '\'' + ", lastName='" + lastName + '}';
    }
}
