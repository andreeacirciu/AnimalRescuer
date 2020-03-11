package org.example;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
   }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
