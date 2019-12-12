package pluralsight.m4.pizzaexample;

public class App {


    public static void main(String[] args){
        Pizza pizza = new Pizza.PizzaBuilder(12)
                                .cheese(true)
                                .ham(true)
                                .build();
        // deliver pizza
    }
}
