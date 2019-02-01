public class PizzaPlanet {

    public static void main(String... args){

        PizzaStore californiaStore = new CaliforniaStore();
        PizzaStore sanFranciscoStore = new SanFranciscoStore();

        californiaStore.orderPizza("standard");
        sanFranciscoStore.orderPizza("standard");

    }

}