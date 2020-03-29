package org.example;

public class Dog extends Animal {
     private boolean bite;

     public Dog(String animalType, String animalName, int age, String color, String gender) {
          super(animalType, animalName, age, color, gender);
     }

     @Override
     public void animalMood() {
          if(getHappinessLevel()>=8 ){
               System.out.println("The dog is very happy!");
          }else if(getHappinessLevel() >= 6 && getHappinessLevel()<8){
               System.out.println("The dog is happy!");
          }else if(getHappinessLevel()<=5) {
               System.out.println("The dog is sad and starts to bite!");
          }
     }

     public boolean isBite() {
          return bite;
     }

     public void setBite(boolean bite) {
          this.bite = bite;
     }


}
