package eje7;

public class Main {

    public static void main(String[] args) {
        PizzaBuilder builder = new PizzaMargheritaBuilder();
        Pizza pizza = build(builder);
        System.out.println(pizza);
    }

    private static Pizza build(PizzaBuilder builder) {
        builder.addFlour();
        builder.addSauce();
        builder.addCheese();
        builder.addToppings();
        return builder.build();
    }
}
