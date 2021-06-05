package base.spring.model.impl;

import base.spring.model.Pet;

public abstract class AbstractPet implements Pet {
    private String voice;

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public abstract void destroy();
}
