package org.example;

public class Animal {
    private String animalType;
    private String animalName;
    private int age;
    private int healthLevel;
    public int hungerLevel;
    public int happinessLevel;
    private int cleanLevel;
    private String color;
    private String gender;
    private AnimalFood favoriteFood;
    private RecreationalActivities favoriteActivity;

    public Animal(String animalType, String animalName, int age, String color, String gender) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.age = age;
        this.color = color;
        this.gender = gender;
    }

    //setterii si getterii
    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
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
