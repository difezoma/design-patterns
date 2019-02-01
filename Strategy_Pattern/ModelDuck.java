public class ModelDuck extends Duck{

	public ModelDuck(){
		flyBehaviour = new CantFly();
		quackBehaviour = new CantQuack();
	}

	public void display(){
		System.out.println("I am a model Duck!");
	}

}