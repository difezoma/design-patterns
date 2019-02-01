public class Mallard extends Duck{

	public Mallard(){
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
		
	}

	public void display(){
		System.out.println("I am a Mallard Duck");
	}

}