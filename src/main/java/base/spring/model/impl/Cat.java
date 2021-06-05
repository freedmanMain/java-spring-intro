package base.spring.model.impl;

public class Cat extends AbstractPet {
    @Override
    public void voice() {
        System.out.println(getVoice());
    }
}
