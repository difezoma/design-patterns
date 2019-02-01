public abstract class PizzaStore{

    public void orderPizza(String type){

        Pizza pizza = factoryMethod(type);

        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.getDescription();

    }

    public abstract Pizza factoryMethod(String type);

} 