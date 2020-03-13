package org.example;

public class Dog extends Animal {
     private boolean bite;

     public Dog(String animalType, String animalName, int age, String color, String gender) {
          super(animalType, animalName, age, color, gender);
     }


     public boolean isBite() {
          return bite;
     }

     public void setBite(boolean bite) {
          this.bite = bite;
     }


}
