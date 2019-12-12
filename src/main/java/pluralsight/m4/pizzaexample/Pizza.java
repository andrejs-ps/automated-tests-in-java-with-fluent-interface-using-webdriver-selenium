package pluralsight.m4.pizzaexample;

public class Pizza {

    private int size;
    private boolean cheese;
    private boolean ham;

    public static class PizzaBuilder {
        //mandatory
        private final int size;

        // default is false
        private boolean cheese;
        private boolean ham;

        public PizzaBuilder(int size) {
            this.size = size;
        }

        public PizzaBuilder cheese(boolean value) {
            cheese = value;
            return this;
        }

        public PizzaBuilder ham(boolean value) {
            ham = value;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(PizzaBuilder builder) {
        size = builder.size;
        cheese = builder.cheese;
        ham = builder.ham;
    }
}
