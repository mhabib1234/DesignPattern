package Builder2;

public class Test {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        PizzaBuilder hawaiianPizzaBuilder = new HawaaianPizza();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizza();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza1 = waiter.getPizza();

        System.out.println(pizza1.toString());


        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza2 = waiter.getPizza();

        System.out.println(pizza2.toString());
    }
}