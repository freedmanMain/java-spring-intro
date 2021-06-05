package base.spring;

import base.spring.model.impl.PetOwner;
import base.spring.util.ClassPathXmlApplicationContextUtil;

public class Main {
    public static void main(String[] args) {
        PetOwner petOwner = ClassPathXmlApplicationContextUtil
                .getContext()
                .getBean("petOwner", PetOwner.class);
        petOwner.callYourPet();
        ClassPathXmlApplicationContextUtil.getContext().close();
    }
}
