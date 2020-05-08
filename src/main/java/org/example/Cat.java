package org.example;

public class Cat extends Animal {
    private boolean purr;

    public Cat(String animalType, String animalName, int age, String color, String gender) {
        super(animalType, animalName, age, color, gender);
    }

    public Cat() {
        super();
    }

    @Override
    public void animalMood() {
        if (getHappinessLevel() >= 8) {
            System.out.println("The cat is very happy and purr!");
        } else if (getHappinessLevel() >= 6 && getHappinessLevel() < 8) {
            System.out.println("The cat is happy!");
        } else if (getHappinessLevel() <= 5) {
            System.out.println("The cat is sad!");
        }
    }

    public boolean isPurr() {
        return purr;
    }

    public void setPurr(boolean purr) {
        this.purr = purr;
    }


}
