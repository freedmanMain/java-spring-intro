package base.spring.model.impl;

import base.spring.model.Pet;

public class Dog implements Pet {
    private String voice;

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public void voice() {
        System.out.println(voice);
    }

    public void destroyDog() {
        System.out.println("Dog object is destroyed!");
    }
}
