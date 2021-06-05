package base.spring;

import base.spring.model.Pet;
import base.spring.model.impl.PetOwner;
import base.spring.util.ContextUtil;

public class Main {
    public static void main(String[] args) {
        PetOwner dogOwner = new PetOwner();
        PetOwner catOwner = new PetOwner();
        dogOwner.setPet(ContextUtil.getContext().getBean("dog", Pet.class));
        catOwner.setPet(ContextUtil.getContext().getBean("cat", Pet.class));
        dogOwner.callYourPet();
        catOwner.callYourPet();
        ContextUtil.getContext().close();
    }
}
