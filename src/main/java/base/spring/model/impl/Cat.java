package base.spring.model.impl;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat extends AbstractPet {
    @Override
    public void voice() {
        System.out.println(getVoice());
    }
}
