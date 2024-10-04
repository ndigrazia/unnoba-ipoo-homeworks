package eje7;

public class PizzaMargheritaBuilder implements PizzaBuilder {

    private PizzaMargherita pizza = new PizzaMargherita();

    @Override
    public Pizza build() {
       return pizza;
    }

    @Override
    public void addFlour() {
       pizza.setFlour(Flour.Comun);
    }

    @Override
    public void addSauce() {
        pizza.setSauce(Sauce.Tomate);
    }

    @Override
    public void addCheese() {
        pizza.setCheese(Cheese.Mozzarella);
    }

    @Override
    public void addToppings() {
        pizza.addTopping(Topping.Albahaca);
        pizza.addTopping(Topping.Tomate);
    }  

}
