public class SanFranciscoStore extends PizzaStore{

    public Pizza factoryMethod(String type){

        if(type.equals("standard")){
            return new SanFranciscoPizza();
        }else{
            return null;
        }

    }

}