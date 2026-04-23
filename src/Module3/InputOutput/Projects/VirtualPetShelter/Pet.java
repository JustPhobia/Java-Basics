package Module3.InputOutput.Projects.VirtualPetShelter;

public class Pet {
    String name;
    String species;
    int hungerLevel = 0;
    boolean adopted;

    public Pet(String name, boolean adopted){
        this.name = name;
        this.adopted = adopted;
    }

    public boolean feed(int hungerRegen){
        if (hungerRegen-this.hungerLevel <0){
            return false;
        } else {
            this.hungerLevel -= hungerRegen;
            return true;
        }
    }

    public boolean isAdopted(){
        return this.adopted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    @Override
    public String toString() {
        return "========================"+
                "\n| Name: "+this.name+
                ""; // You Are here!
    }
}
