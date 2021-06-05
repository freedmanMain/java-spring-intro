package base.spring.model.impl;

public class Cat extends AbstractPet {
    @Override
    public void voice() {
        System.out.println(getVoice());
    }

    @Override
    public void destroy() {
        System.out.println("Cat object is destroyed!");
    }
}
