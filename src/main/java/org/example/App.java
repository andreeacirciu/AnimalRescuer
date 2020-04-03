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


        Game game = new Game();
        game.start();

        //first dog
        Animal dog1 = new Dog("dog", "Rex", 1, "brown", "male");
        dog1.setHungerLevel(5);
        dog1.setHealthLevel(10);
        dog1.setHappinessLevel(7);
        dog1.setCleanLevel(9);
        ((Dog) dog1).setBite(false);

        //first cat
        Animal cat1 =new Cat("cat", "Cindy", 1, "pink", "female");
        cat1.setHungerLevel(7);
        cat1.setHealthLevel(9);
        cat1.setHappinessLevel(5);
        cat1.setCleanLevel(8);
        ((Cat) cat1).setPurr(true);


//
//        //favorite food for the first animal
//        dog1.setFavoriteFood(dogFood1.getFoodName());

        //first rescuer
        Rescuer rescuer1 = new Rescuer("John ");
        rescuer1.setMoney(150);
        rescuer1.setGender("male");

//        //apelare metoda feeding
//        rescuer1.feeding((Dog) dog1, dogFood1);
//        System.out.println("The hunger level of " + dog1.getAnimalName() + " is: " + dog1.getHungerLevel());



//        //favorite activity for the first animal
//        dog1.setFavoriteActivity(activity1.getActivityName());
//
//        //apelare metoda entertain
//        rescuer1.entertain((Dog) dog1, activity1);
//        System.out.println("The happiness level of " + dog1.getAnimalName() + " is: " + dog1.getHappinessLevel());

        //////////apelare metoda animalMood
//        dog1.animalMood();
//        cat1.animalMood();

        //first doctor
        Vet doctor1 = new Vet("Mr. Smith");
        doctor1.setSpecialization("dogs");
        doctor1.setGender("male");


        //first game
//        Game game1 = new Game();
//        game1.setRescuerName(rescuer1);
//        game1.setAnimal(dog1);
//        game1.setVet(doctor1);
//

        }
    }


