package org.example;

public class Cat extends Animal {
    private boolean purr;

    public Cat(String animalType, String animalName, int age, String color, String gender) {
        super(animalType, animalName, age, color, gender);
    }

    public boolean isPurr() {
        return purr;
    }

    public void setPurr(boolean purr) {
        this.purr = purr;
    }



}
