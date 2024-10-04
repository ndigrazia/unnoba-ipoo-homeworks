package eje7;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<Topping> toppings = new ArrayList<Topping>();

    private Flour flour;
    private Cheese cheese;
    private Sauce sauce;

    public Flour getFlour() {
        return flour;
    }
    public void setFlour(Flour flour) {
        this.flour = flour;
    }
    public Cheese getCheese() {
        return cheese;
    }
    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }
    public Sauce getSauce() {
        return sauce;
    }
    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }
    public void addTopping(Topping t) {
        toppings.add(t);
    }
    
}
