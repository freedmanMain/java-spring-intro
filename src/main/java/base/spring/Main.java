package base.spring;

import base.spring.model.impl.PetOwner;
import base.spring.util.AnnotationConfigApplicationContextUtil;

public class Main {
    public static void main(String[] args) {
        PetOwner petOwner = AnnotationConfigApplicationContextUtil
                .getContext()
                .getBean("petOwnerBean", PetOwner.class);
        System.out.println(petOwner);
        AnnotationConfigApplicationContextUtil.getContext().close();
    }
}
