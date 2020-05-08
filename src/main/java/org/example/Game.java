package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Game {
    private Rescuer rescuer;
    private Animal animal;
    private Vet vet;

    private List<AnimalFood> availableFoodForDogs = new ArrayList<>();
    private List<AnimalFood> availableFoodForCats = new ArrayList<>();
    private RecreationalActivities[] availableActivities = new RecreationalActivities[5];

    AnimalFood dogFood1 = new AnimalFood("Royal Canin", "dry");
    AnimalFood dogFood2 = new AnimalFood("Happy dog", "wet");
    AnimalFood catFood1 = new AnimalFood("Purina", "dry");
    AnimalFood catFood2 = new AnimalFood("Kitty Kat", "wet");


    public void start() throws ParseException {
        initRescuer();

        System.out.println("\nHi, " + rescuer.getName() + "\nYou will gave you 100 coins to buy food for your animal or to take him to the vet. \nYou can earn more coins if you play with the animal or if you clean him! \nEnjoy!\n ");
        rescuer.setMoney(100);
        initAnimal();
        nameAnimal();

        initFood();
        requireFeeding();

        requireCleaning();
        requireMedicalConsult();

        initActivities();
        requireEntertain();


        for (int i = 0; i < 3; i++) { //rounds
            while (animal.getHappinessLevel() != 10 && animal.getHungerLevel() > 4) {
                if (animal.getHungerLevel() > 4) {
                    requireFeeding();
                }
                if (animal.getHappinessLevel() < 9) {
                    requireEntertain();
                }

            }
        }

        if (animal.getHappinessLevel() == 10 && animal.getCleanLevel() == 10 && animal.getHungerLevel() <= 4 && animal.getHealthLevel() == 10) {
            System.out.println("Congratulation you win the game!");
        } else {
            System.out.println("You lost the game! Try again!\n");
        }
        System.out.println("Happiness level: " + animal.getHappinessLevel());
        System.out.println("Hunger level: " + animal.getHungerLevel());
        System.out.println("Clean level: " + animal.getCleanLevel());
        System.out.println("Health level: " + animal.getHealthLevel());

        System.out.println("\nRemain money: " + rescuer.getMoney());
    }

    private void initRescuer() {

        rescuer = new Rescuer();
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String introducedName = scanner.nextLine();
        rescuer.setName(introducedName);


    }

    private void initAnimal() {
        System.out.println("Do you want a dog or a cat?");
        Scanner scanner = new Scanner(System.in);
        String enteredAnimalType = scanner.nextLine();

        //    animal.setAnimalType(enteredAnimalType);

        if (enteredAnimalType.equalsIgnoreCase("dog")) {
            //dog
            animal = new Dog();
            animal.setAnimalType("dog");
            animal.setAge(1);
            animal.setGender("male");
            animal.setColor("grey");
            animal.setHungerLevel(10);
            animal.setHealthLevel(0);
            animal.setHappinessLevel(0);
            animal.setCleanLevel(0);
            ((Dog) animal).setBite(true);
        } else if (enteredAnimalType.equalsIgnoreCase("cat")) {
            //first cat
            animal = new Cat();
            animal.setAnimalType("cat");
            animal.setHungerLevel(10);
            animal.setHealthLevel(0);
            animal.setHappinessLevel(0);
            animal.setCleanLevel(0);
            ((Cat) animal).setPurr(false);
        }
    }

    private void nameAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a name for your animal: ");
        String enteredAnimalName = scanner.nextLine();
        animal.setAnimalName(enteredAnimalName);
    }

    private void requireFeeding() throws ParseException {
        System.out.println("Please feed the animal!");

        if (animal.getAnimalType().equals("dog")) {
            displayFoodForDogs();
        } else
            displayFoodForCats();

        System.out.println("Choose one of the foods shown above: ");
        Scanner scanner = new Scanner(System.in);
        String enteredFood = scanner.nextLine();

        //check food availability
        //current date
        Date currentDate = new Date();
        if (enteredFood.equalsIgnoreCase("Royal Canin")) {
            //Expiration date for dogFood1
            SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
            String dateInStringDogFood1 = "22-03-2020";
            Date expirationDateDogFood1 = sdf.parse(dateInStringDogFood1);
            dogFood1.setExpirationDate(expirationDateDogFood1);
            dogFood1.setPrice(55);

            //warning if food is expired
            if (currentDate.after(expirationDateDogFood1)) {
                System.out.println("Food expired!!! Please choose another food!");
                requireFeeding();
            } else {
                rescuer.feeding(animal, enteredFood);
                rescuer.setMoney(rescuer.getMoney() - dogFood1.getPrice());
            }


        } else if (enteredFood.equalsIgnoreCase("Happy dog")) {
            //Expiration date for dogFood2
            String dateInStringDogFood2 = "22-05-2020";
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd-M-yyyy");
            Date expirationDateDogFood2 = sdf2.parse(dateInStringDogFood2);
            dogFood2.setExpirationDate(expirationDateDogFood2);
            dogFood2.setPrice(40);

            //warning if food is expired
            if (currentDate.after(expirationDateDogFood2)) {
                System.out.println("Food expired!!! Please choose another food!");
                requireFeeding();
            } else {
                rescuer.feeding(animal, enteredFood);
                rescuer.setMoney(rescuer.getMoney() - dogFood2.getPrice());
            }

        } else if (enteredFood.equalsIgnoreCase("Purina")) {
            //Expiration date for catFood1
            String dateInStringCatFood1 = "22-07-2020";
            SimpleDateFormat sdf3 = new SimpleDateFormat("dd-M-yyyy");
            Date expirationDateCatFood1 = sdf3.parse(dateInStringCatFood1);
            catFood1.setExpirationDate(expirationDateCatFood1);
            catFood1.setPrice(36);

            //warning if food is expired
            if (currentDate.after(expirationDateCatFood1)) {
                System.out.println("Food expired!!! Please choose another food!");
                requireFeeding();
            } else {
                rescuer.feeding(animal, enteredFood);
                rescuer.setMoney(rescuer.getMoney() - catFood1.getPrice());
            }

        } else if (enteredFood.equalsIgnoreCase("Kitty Kat")) {
            //Expiration date for catFood2
            String dateInStringCatFood2 = "23-07-2020";
            SimpleDateFormat sdf4 = new SimpleDateFormat("dd-M-yyyy");
            Date expirationDateCatFood2 = sdf4.parse(dateInStringCatFood2);
            catFood2.setExpirationDate(expirationDateCatFood2);
            catFood2.setPrice(30);


            //warning if food is expired
            if (currentDate.after(expirationDateCatFood2)) {
                System.out.println("Food expired!!! Please choose another food!");
                requireFeeding();
            } else
                rescuer.feeding(animal, enteredFood);
            rescuer.setMoney(rescuer.getMoney() - dogFood2.getPrice());
        }
    }


    private void requireEntertain() {
        System.out.println("Please entertain your animal!");
        displayActivities();
        System.out.println("Choose one of the activities shown above: ");
        Scanner scanner = new Scanner(System.in);
        String enteredActivity = scanner.nextLine();
        rescuer.entertain(animal, enteredActivity);
        rescuer.setMoney(rescuer.getMoney() + 20);
    }

    private void requireCleaning() {
        System.out.println("Do you want to clean the animal? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            rescuer.cleaning(animal);
            rescuer.setMoney(rescuer.getMoney() + 20);

        } else if (answer.equals("no")) {
            System.out.println("You should clean the animal!\n");

        }
    }

    private void initFood() {

        //first type of food for dogs
        dogFood1.setAvailability(4);
        dogFood1.setPrice(10);
        dogFood1.setQuantity(85);

        //second type of food for dogs
        dogFood1.setAvailability(2);
        dogFood1.setPrice(6);
        dogFood1.setQuantity(100);

        availableFoodForDogs.add(dogFood1);
        availableFoodForDogs.add(dogFood2);

        // first type of food for cats
        catFood1.setAvailability(3);
        catFood1.setPrice(9);
        catFood1.setQuantity(100);

        //second type of food for cats
        catFood2.setAvailability(2);
        catFood2.setPrice(7);
        catFood2.setQuantity(120);

        availableFoodForCats.add(catFood1);
        availableFoodForCats.add(catFood2);

    }

    private void requireMedicalConsult() {
        System.out.println("Do you want to take the animal to a medical consult? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            vet = new Vet();

            Map<String, Integer> doctors = new HashMap<>();
            doctors.put("Mr Smith", 60);
            doctors.put("Mrs Roman", 55);
            doctors.put("Mrs Brown", 50);
            doctors.put("Mr Raynolds", 65);
            System.out.println("\nThis is a list with available doctors and their prices for a medical consult:");
            for (Map.Entry<String, Integer> entry : doctors.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", " + entry.getValue() + " coins.");
            }


            System.out.println("\nI remind you that you have " + rescuer.getMoney() + " coins. \nPlease choose a vet:");
            String chosenVet = scanner.nextLine();
            for (Map.Entry<String, Integer> entry : doctors.entrySet()) {
                if (chosenVet.equalsIgnoreCase(entry.getKey())) {
                    rescuer.setMoney(rescuer.getMoney() - entry.getValue());
                }
            }
            vet.medicalConsult(animal);
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("You should check the level health of your animal!");
        }

    }

    private void initActivities() {
        //first recreational activity
        RecreationalActivities activity1 = new RecreationalActivities("Hide and seek");
        availableActivities[0] = activity1;

        //second recreational activity
        RecreationalActivities activity2 = new RecreationalActivities("Walking");
        availableActivities[1] = activity2;
    }

    public void displayFoodForDogs() {
        System.out.println("Available food: ");
        for (AnimalFood animalFood : availableFoodForDogs)
        //for(int i=0; i< availableFood.size(); i++)
        {
            System.out.println(animalFood.getFoodName());
        }
    }

    public void displayFoodForCats() {
        System.out.println("Available food: ");
        for (AnimalFood animalFood : availableFoodForCats) {
            System.out.println(animalFood.getFoodName());
        }
    }


    public void displayActivities() {
        System.out.println("Available activities: ");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null)
                System.out.println((i + 1) + " . " + availableActivities[i].getActivityName());
        }
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
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
