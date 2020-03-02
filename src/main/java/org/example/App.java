package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        System.out.println( "Welcome to Animal Rescuer!" );

        //first animal
        Animal firstAnimal = new Animal();
        firstAnimal.type = "dog";
        firstAnimal.name = "Rex";
        firstAnimal.age = 2;
        firstAnimal.hungerLvl = 5;
        firstAnimal.healthLvl =10;
        firstAnimal.happinessLvl = 7;
        firstAnimal.color = "grey";
        firstAnimal.gender ="female";
        firstAnimal.cleanLvl = 9;

        //first type of food
        AnimalFood food1 = new AnimalFood();
        food1.name="Royal Canin";
        food1.availability = 4;
        food1.price = 10;
        food1.quantity = 85;

        //current date
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);

        //Expiration date for food1
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        String dateInString = "22-05-2020";
        Date date = sdf.parse(dateInString);
        System.out.println("Expiration Date:" + date);

        food1.expirationDate = date;

        //warning if food is expired
        if (date.after(currentDate)) {
            System.out.println("Food expired!!!");
        }


        //favorite food for the first animal
        firstAnimal.favoriteFood.name = food1.name;

        //first rescuer
        Rescuer rescuer1 = new Rescuer();
        rescuer1.name = "John";
        rescuer1.money = 150; //coins
        rescuer1.gender = "female";

        //an recreational activity
        RecreationalActivities activity1 = new RecreationalActivities();
        activity1.name = "Hide and seek";

        //another activity
        RecreationalActivities activity2 = new RecreationalActivities();
        activity2.name = "Walking";
        activity2.toolsForActivities.leash = true;

        //favorite activity for the first animal
        firstAnimal.favoriteActivity.name = activity1.name;

        //first doctor
        Vet doctor1 = new Vet();
        doctor1.name = "Mr. Smith";
        doctor1.specialization = "dogs"; //???
        doctor1.gender = "male";


        //first game
        Game game1 = new Game();
        game1.name = rescuer1;
        game1.animal = firstAnimal;
        game1.vet = doctor1;

    }


}
