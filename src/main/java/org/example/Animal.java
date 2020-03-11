package org.example;

public class Animal {
    private int age;
    private int healthLevel;
    int hungerLevel;
    int happinessLevel;
    private int cleanLevel;
    AnimalFood favoriteFood;
    private RecreationalActivities favoriteActivity;

    private String color;
    private String gender;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getCleanLevel() {
        return cleanLevel;
    }

    public void setCleanLevel(int cleanLevel) {
        this.cleanLevel = cleanLevel;
    }

    public AnimalFood getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(AnimalFood favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public RecreationalActivities getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(RecreationalActivities favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
