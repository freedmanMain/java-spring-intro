package base.spring;

import base.spring.model.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext");

        Pet dog = context.getBean("dog", Pet.class);
        Pet cat = context.getBean("cat", Pet.class);

        dog.voice();
        cat.voice();

        context.close();
    }
}
