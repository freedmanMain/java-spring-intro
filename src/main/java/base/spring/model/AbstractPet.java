package base.spring.model;

public class AbstractPet {
    private String petName;
    private int petAge;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    @Override
    public String toString() {
        return "AbstractPet{" + "petName='" + petName + '\''
                + ", petAge=" + petAge + '}';
    }
}
