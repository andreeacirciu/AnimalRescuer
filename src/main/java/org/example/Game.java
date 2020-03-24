package org.example;

public class Game {
    private Rescuer rescuerName;
    private Animal animal;
    private Vet vet;

    public Rescuer getRescuerName() {
        return rescuerName;
    }

    public void setRescuerName(Rescuer rescuerName) {
        this.rescuerName = rescuerName;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
