package org.example;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game {
    private Rescuer rescuerName;
    private Animal animal;
    private Vet vet;

    private List<AnimalFood> availableFood = new ArrayList<>();
    private RecreationalActivities[] availableActivities = new RecreationalActivities[5];

    public void start() throws ParseException {
        initFood();
        initActivities();
        displayFood();
        displayActivities();
    }


    private void initFood() throws ParseException {
        //first type of food for dogs
        AnimalFood dogFood1 = new AnimalFood("Royal Canin", "dry");
        dogFood1.setAvailability(4);
        dogFood1.setPrice(10);
        dogFood1.setQuantity(85);

        //second type of food for dogs
        AnimalFood dogFood2 = new AnimalFood("Happy dog", "wet");
        dogFood1.setAvailability(2);
        dogFood1.setPrice(6);
        dogFood1.setQuantity(100);

        //current date
        Date currentDate = new Date();
        //System.out.println("Current Date: " + currentDate);

        //Expiration date for dogFood1
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        String dateInStringDogFood1 = "22-05-2020";
        Date expirationDateDogFood1 = sdf.parse(dateInStringDogFood1);
        //System.out.println("Expiration Date:" + expirationDateDogFood1);
        dogFood1.setExpirationDate(expirationDateDogFood1);

        //warning if food is expired
        if (currentDate.after(expirationDateDogFood1)) {
            System.out.println("Food expired!!!");
        }

        //Expiration date for dogFood2
        // SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        String dateInStringDogFood2 = "22-05-2020";
        Date expirationDateDogFood2 = sdf.parse(dateInStringDogFood2);
       // System.out.println("Expiration Date:" + expirationDateDogFood2);
        dogFood1.setExpirationDate(expirationDateDogFood2);

        //warning if food is expired
        if (currentDate.after(expirationDateDogFood2)) {
            System.out.println("Food expired!!!");
        }


        availableFood.add(dogFood1);
        availableFood.add(dogFood2);
    }


    private void initActivities() {
        //first recreational activity
        RecreationalActivities activity1 = new RecreationalActivities("Hide and seek");
        availableActivities[0] = activity1;

        //second recreational activity
        RecreationalActivities activity2 = new RecreationalActivities("Walking");
        availableActivities[1] = activity2;
    }

    public void displayFood(){
        System.out.println("Available food: ");
        for (AnimalFood animalFood : availableFood)
        //for(int i=0; i< availableFood.size(); i++)
        {
            System.out.println(animalFood.getFoodName());
        }
    }

    public void displayActivities(){
        System.out.println("Available activities: ");
        for (int i=0; i < availableActivities.length; i++)
        {
            if(availableActivities[i] != null)
            System.out.println((i + 1) + " . " + availableActivities[i].getActivityName());
        }
    }

    public Rescuer getRescuerName() {
        return rescuerName;
    }

    public void setRescuerName(Rescuer rescuerName) {
        this.rescuerName = rescuerName;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
