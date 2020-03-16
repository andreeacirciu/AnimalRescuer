package org.example;


public class Rescuer {

    private String name;
    private int money; //coins
    private String gender;

    public Rescuer(String name) {
        this.name = name;
    }

    public void feeding(Dog dog1, AnimalFood dogFood1)
    {
        System.out.println(name + "just gave " + dogFood1.getFoodName() + " to " + dog1.getAnimalName());
        dog1.setHungerLevel(dog1.getHungerLevel() -1);
        if(dogFood1.getFoodName().equals(dog1.getFavoriteFood()))
        {
            dog1.setHappinessLevel(dog1.getHappinessLevel()+1);
            System.out.println("Happiness level after eating his favourite food is: " + dog1.getHappinessLevel());
        }
    }

    public void entertain(Dog dog1, RecreationalActivities activityName)
    {
        System.out.println(name + "is playing " +  activityName.getActivityName() + " with " + dog1.getAnimalName() );
        if(activityName.getActivityName().equals(dog1.getFavoriteActivity()) )
        {
            dog1.setHappinessLevel(dog1.getHappinessLevel() + 2);
            System.out.println("Happiness level after playing his favourite game is: " + dog1.getHappinessLevel() );
        }
        else
        {
            dog1.setHappinessLevel(dog1.getHappinessLevel() + 1);
        }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
