package base.spring;

import base.spring.model.impl.PetOwner;
import base.spring.util.ContextUtil;

public class Main {
    public static void main(String[] args) {
        PetOwner petOwner = ContextUtil.getContext().getBean("petOwner", PetOwner.class);
        petOwner.callYourPet();
        ContextUtil.getContext().close();
    }
}
