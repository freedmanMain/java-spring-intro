package base.spring.model.impl;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog extends AbstractPet {
    @Override
    public void voice() {
        System.out.println(getVoice());
    }
}
