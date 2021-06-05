package base.spring.model.impl;

public class Dog extends AbstractPet {
    @Override
    public void voice() {
        System.out.println(getVoice());
    }
}
