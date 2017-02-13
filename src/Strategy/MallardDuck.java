package Strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quakeBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
		
	}
	
	public void display(){
		System.out.println("I'm a real mallard duck!");
	}

}
