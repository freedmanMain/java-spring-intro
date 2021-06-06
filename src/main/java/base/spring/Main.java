package base.spring;

import base.spring.model.impl.PetOwner;
import base.spring.util.ClassPathXmlApplicationContextUtil;

public class Main {
    public static void main(String[] args) {
        PetOwner petOwner = ClassPathXmlApplicationContextUtil
                .getContext()
                .getBean("petOwnerBean", PetOwner.class);
        System.out.println("Pet owner info=" + petOwner);
        petOwner.callYourPet();
        ClassPathXmlApplicationContextUtil.getContext().close();
    }
}
