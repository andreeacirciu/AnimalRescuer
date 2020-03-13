package org.example;


public class Rescuer {

    private String name;
    private int money; //coins
    private String gender;

    public Rescuer(String name) {
        this.name = name;
    }

    public void feeding(Dog dog1, AnimalFood dogFood1)
    {
        System.out.println(name + "just gave " + dogFood1.getFoodName() + " to " + dog1.getAnimalName());
        dog1.hungerLevel--;    //aici am modificat variabila hungerLevel din Animal din private in public ca altfel nu stiu cum sa o decrementez
        //cum ar trebui sa fac sa convertesc din tipul AnimalFood in String ca sa pot verifica egalitatea, in afara de varianta pe care mi-ai sugerat-o in tema?
        if(dogFood1.getFoodName().equals(dog1.getFavoriteFood()))
        {
            dog1.happinessLevel++; //la fel si aici am modificat din private in public
            System.out.println("Happiness level after eating his favourite food is: " + dog1.happinessLevel );
        }
    }

    public void entertain(Dog dog1, RecreationalActivities activityName)
    {
        System.out.println(name + "is playing " +  activityName + " with " + dog1.getAnimalName() );

        /*nu intra in if-ul asta decat daca schimb din activity1.activityName in activityName,
        daaar daca fac schimbarea asta la afisare imi apare "John is playing org.example.RecreationalActivities@...  with Rex"*/

        if(activityName.equals(dog1.getFavoriteActivity()) )
        {
            dog1.happinessLevel = dog1.happinessLevel + 2;
            System.out.println("Happiness level after playing his favourite game is: " + dog1.happinessLevel );
        }
        else
        {
            dog1.happinessLevel ++;
        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
