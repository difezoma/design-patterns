public class CaliforniaStore extends PizzaStore{

    public Pizza factoryMethod(String type){

        if(type.equals("standard")){
            return new CalifornianPizza();
        }else{
            return null;
        }

    }

}