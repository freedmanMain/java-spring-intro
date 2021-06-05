package base.spring;

import base.spring.model.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext");
        Pet pet = context.getBean("dog", Pet.class);
        pet.voice();
        context.close();
    }
}
