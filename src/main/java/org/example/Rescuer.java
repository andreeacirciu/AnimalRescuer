package org.example;


public class Rescuer {

    private String name;
    private int money; //coins

    public Rescuer(String name) {
        this.name = name;
    }
    public Rescuer(){
        super();
    }


    public void feeding(Animal animal, String enteredFood)
    {
        System.out.println(name + " just gave " + enteredFood + " to " + animal.getAnimalName());
        animal.setHungerLevel(animal.getHungerLevel() - 3);
        animal.setHappinessLevel(animal.getHappinessLevel() + 2);
        System.out.println("Happiness level after first meal after being rescued: " + animal.getHappinessLevel() + "\n");
    }


    public void entertain(Animal animal, String enteredActivity)
    {
        System.out.println(name + " is playing " +  enteredActivity + " with " + animal.getAnimalName() );
        animal.setHappinessLevel(animal.getHappinessLevel() + 2);
        System.out.println("\nHappiness level after playing first time with its rescuer: " + animal.getHappinessLevel() + "\n");
    }


    public void cleaning(Animal animal){
        System.out.println("Very well, you cleaned the animal!\n");
        animal.setCleanLevel(10);
        animal.setHappinessLevel(animal.getHappinessLevel()+2);
       // System.out.println("Now, its happiness level is: " + animal.getHappinessLevel() + "\nand its clean level is: " + animal.getCleanLevel()+ "\nand its hunger level is: " + animal.getHungerLevel());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
