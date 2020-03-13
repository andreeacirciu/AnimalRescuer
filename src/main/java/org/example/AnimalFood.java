package org.example;

import java.util.Date;

public class AnimalFood {

    private String foodName;
    private String foodType; //wet or dry
    //   private String forWho;
    private int price;
    private int quantity; // grams
    private Date expirationDate;
    private int availability;

    public AnimalFood(String foodName, String foodType) {
        this.foodName = foodName;
        this.foodType = foodType;
    }


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }



}
