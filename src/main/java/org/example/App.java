package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        System.out.println( "Welcome to Animal Rescuer!" );

        //first dog
        Dog dog1 = new Dog("dog", "Rex", 1, "brown", "male");
        dog1.setHungerLevel(5);
        dog1.setHealthLevel(10);
        dog1.setHappinessLevel(7);
        dog1.setCleanLevel(9);
        dog1.setBite(false);

        //first cat
        Cat cat1 =new Cat("cat", "Cindy", 1, "pink", "female");
        cat1.setHungerLevel(7);
        cat1.setHealthLevel(9);
        cat1.setHappinessLevel(5);
        cat1.setCleanLevel(8);
        cat1.setPurr(true);

        //first type of food for dogs
        AnimalFood dogFood1 = new AnimalFood("Royal Canin", "dry");
        dogFood1.setAvailability(4);
        dogFood1.setPrice(10);
        dogFood1.setQuantity(85);

        //second type of food for dogs
        AnimalFood dogFood2 = new AnimalFood("Happy dog", "dry");
        dogFood1.setAvailability(2);
        dogFood1.setPrice(6);
        dogFood1.setQuantity(100);

        //current date
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);

        //Expiration date for dogFood1
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        String dateInString = "22-05-2020";
        Date date = sdf.parse(dateInString);
        System.out.println("Expiration Date:" + date);

        dogFood1.setExpirationDate(date);

        //warning if food is expired
        if (currentDate.after(date)) {
            System.out.println("Food expired!!!");
        }

        //favorite food for the first animal
        dog1.setFavoriteFood(dogFood1.getFoodName());

        //first rescuer
        Rescuer rescuer1 = new Rescuer("John ");
        rescuer1.setMoney(150);
        rescuer1.setGender("male");

        //apelare metoda feeding
        rescuer1.feeding(dog1, dogFood1);
        System.out.println("The hunger level of " + dog1.getAnimalName() + " is: " + dog1.getHungerLevel());

        //////////apelare metoda animalMood
        dog1.animalMood();
        cat1.animalMood();
        //a recreational activity
        RecreationalActivities activity1 = new RecreationalActivities( "Hide and seek");

        //another activity
        RecreationalActivities activity2 = new RecreationalActivities("Walking");
        //activity2.toolsForActivities.leash = true;

        //favorite activity for the first animal
        dog1.setFavoriteActivity(activity1.getActivityName());

        //apelare metoda entertain
        rescuer1.entertain(dog1, activity1);
        System.out.println("The happiness level of " + dog1.getAnimalName() + " is: " + dog1.getHappinessLevel());


        //first doctor
        Vet doctor1 = new Vet("Mr. Smith");
        doctor1.setSpecialization("dogs");
        doctor1.setGender("male");


        //first game
        Game game1 = new Game();
        game1.setRescuerName(rescuer1);
        game1.setAnimal(dog1);
        game1.setVet(doctor1);


        }
    }


