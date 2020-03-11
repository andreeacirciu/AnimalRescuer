package org.example;


public class Rescuer {
    public Rescuer(String name) {
        this.name = name;
    }

    String name;

    public Rescuer(int money) {
        this.money = money;
    }

    int money; //coins
    String gender;


    public void feeding(Dog dog1, DogFood dogFood1)
    {
        System.out.println(name + "just gave " + dogFood1.getName() + " to " + dog1.getName());
        dog1.hungerLevel--;
        if(dogFood1 == dog1.getFavoriteFood())
        {
            dog1.happinessLevel++;
            System.out.println("Happiness level after eating his favourite food is: " + dog1.happinessLevel );
        }
    }

    public void entertain(Dog dog1, RecreationalActivities activity1)
    {
        System.out.println(name + "is playing " + activity1.name + " with " + dog1.getName() );
        if(activity1 == dog1.getFavoriteActivity()) {
            dog1.happinessLevel += 2;
        }
        else
        {
            dog1.happinessLevel ++;
        }

    }
}
