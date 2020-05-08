package org.example;

public class Vet {

    public void medicalConsult(Animal animal) {
        System.out.println("Your animal is healthy!");
        animal.setHealthLevel(10);
        animal.setHappinessLevel(animal.getHappinessLevel() + 2);

    }
}
