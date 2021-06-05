package base.spring.model.impl;

public class Dog extends AbstractPet {
    @Override
    public void voice() {
        System.out.println(getVoice());
    }

    @Override
    public void destroy() {
        System.out.println("Dog object is destroyed!");
    }
}
