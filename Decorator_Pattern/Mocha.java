public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+ ", Mocha"; 
    }

    public String getSize(){
        return beverage.getSize();
    }

    public double cost(){
        if(beverage.getSize().equals("Small")){
            return .20 + beverage.cost();
        }else if(beverage.getSize().equals("Medium")){
            return .25 + beverage.cost();
        }else if(beverage.getSize().equals("Large")){
            return .30 + beverage.cost();
        }else{
            return .20 + beverage.cost();
        }
        
    }

}