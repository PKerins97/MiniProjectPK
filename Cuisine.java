package problemsolvingweek8.exercisea;

import java.io.Serializable;

/**
 * Created by De Jong Yeong on 18/11/2016 - small modifications by JB 2020
 * @author De Jong Yeong
 * @version 1.0
 */

public class Cuisine implements Serializable {

    private String category;
    private String dish;
    private String description;
    private double price;

    /**
     * No-argument constructor
     */
    public Cuisine() {
        this("Not Given","Not Given","Not Given",0);
    }

    /**
     * 4-arguments constructor
     * @param category The category of the dish
     * @param dish The name of the dish
     * @param description The description of the dish
     * @param price The price of the dish
     */
    public Cuisine(String category, String dish, String description, double price) {
        setCategory(category);
        setDish(dish);
        setDescription(description);
        setPrice(price);
    }


    /**
     * Mutator method to set the category of the dish.
     * @param category The category of the dish.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Mutator method to set the name of the dish
     * @param dish The name of the dish.
     */
    public void setDish(String dish) {
        this.dish = dish;
    }

    /**
     * Mutator method to set the description of the dish
     * @param description The description of the dish.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Mutator method to set the price of the dish.
     * @param price The price of the dish.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Accessor method to return the category of the dish.
     * @return The category of the dish.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Accessor method to return the name of the dish.
     * @return The name of the dish.
     */
    public String getDish() {
        return dish;
    }

    /**
     * Accessor method to return the description of the dish.
     * @return The description of the dish.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Accessor method to return the price of the dish.
     * @return The price of the dish.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Accessor method to return the cuisine details.
     * @return  The details of each dish.
     */
    @Override
    public String toString() {
        return String.format("Category: %s\nDish: %s\nDescription: %s\nPrice: %.2f\n",getCategory(),getDish(),getDescription(),getPrice());
    }
}


