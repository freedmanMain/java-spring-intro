package base.spring.model.impl;

public abstract class AbstractPet {
    private String voice;

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public abstract void destroy();
}
