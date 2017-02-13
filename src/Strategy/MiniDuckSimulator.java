package Strategy;

public class MiniDuckSimulator {
	
	/*The strategy pattern defines a family of algorithms. encapsulates each one, and makes them interchangeable.
	 * Strategy lets the algorithm vary independently from the clients that use it.
	 */

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}

}
