package org.example;

public class Animal {
    private String animalType;
    private String animalName;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int happinessLevel;
    private int cleanLevel;
    private String color;
    private String gender;
    private String favoriteFood;
    private String favoriteActivity;

    public Animal(String animalType, String animalName, int age, String color, String gender) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.age = age;
        this.color = color;
        this.gender = gender;
    }

    public Animal(){
        super();
    }

public void animalMood(){
        if(getHappinessLevel()>=8 ){
            System.out.println("The animal is very happy!");
        }else if(getHappinessLevel() >= 6 && getHappinessLevel()<8){
            System.out.println("The animal is happy!");
        }else if(getHappinessLevel()<=5) {
            System.out.println("The animal is sad!");
        }
}


    //setterii si getterii
    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

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
