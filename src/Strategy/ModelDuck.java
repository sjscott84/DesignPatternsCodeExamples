package Strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quakeBehaviour = new Quack();
	}
	
	public void display(){
		System.out.println("I'm a model duck!");
	}

}
