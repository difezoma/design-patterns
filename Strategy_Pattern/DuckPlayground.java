public class DuckPlayground {

	public static void main(String[] args){

		Duck mallard = new Mallard();

		mallard.display();
		mallard.performFly();
		mallard.performQuack();

		ModelDuck modelDuck = new ModelDuck();

		modelDuck.display();
		modelDuck.performFly();
		modelDuck.performQuack();

		modelDuck.setFlyBehaviour(new FlyWithWings());
		modelDuck.setQuackBehaviour(new Quack());

		modelDuck.performFly();
		modelDuck.performQuack();


	}


}