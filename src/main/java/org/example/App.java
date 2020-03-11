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
        Dog dog1 = new Dog("Rex");
        dog1.setAge(2);
        dog1.setHungerLevel(5);
        dog1.setHealthLevel(10);
        dog1.setHappinessLevel(7);
        dog1.setColor("grey");
        dog1.setGender("male");
        dog1.setCleanLevel(9);

        //first cat
        Cat cat1 =new Cat("Tom");
        cat1.setAge(1);
        cat1.setHungerLevel(7);
        cat1.setHealthLevel(9);
        cat1.setHappinessLevel(8);
        cat1.setColor("pink");
        cat1.setGender("female");
        cat1.setCleanLevel(8);


        //first type of food for dogs
        DogFood dogFood1 = new DogFood("Royal Canin");
        dogFood1.availability = 4;
        dogFood1.price = 10;
        dogFood1.quantity = 85;
        dogFood1.setFoodType("Dry");

        //current date
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);

        //Expiration date for dogFood1
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        String dateInString = "22-05-2020";
        Date date = sdf.parse(dateInString);
        System.out.println("Expiration Date:" + date);

        dogFood1.expirationDate = date;

        //warning if food is expired
        if (currentDate.after(date)) {
            System.out.println("Food expired!!!");
        }

        //favorite food for the first animal
        dog1.setFavoriteFood(dogFood1);

        //first rescuer
        Rescuer rescuer1 = new Rescuer("John ");
        rescuer1.money = 150; //coins
        rescuer1.gender = "female";

        //apelare metoda feeding
        rescuer1.feeding(dog1, dogFood1);
        System.out.println("The hunger level of " + dog1.getName() + " is: " + dog1.getHungerLevel());

        //a recreational activity
        RecreationalActivities activity1 = new RecreationalActivities( "Hide and seek");

        //another activity
        RecreationalActivities activity2 = new RecreationalActivities("Walking");
        //activity2.toolsForActivities.leash = true;

        //favorite activity for the first animal
        dog1.setFavoriteActivity(activity1);

        //apelare metoda entertain
        rescuer1.entertain(dog1, activity1);
        System.out.println("The happiness level of " + dog1.getName() + " is: " + dog1.getHappinessLevel());


        //first doctor
        Vet doctor1 = new Vet("Mr. Smith");
        doctor1.specialization = "dogs"; //???
        doctor1.gender = "male";


        //first game
        Game game1 = new Game();
        game1.rescuerName = rescuer1;
        game1.animal = dog1;
        game1.vet = doctor1;


        }
    }


