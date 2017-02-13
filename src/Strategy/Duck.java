package Strategy;


public abstract class Duck {
	
	FlyBehaviour flyBehaviour;
	QuakeBehaviour quakeBehaviour;
	
	public Duck() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehaviour.fly();
	}
	
	public void performQuack(){
		quakeBehaviour.quake();
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys");
	}
	
	public void setFlyBehaviour(FlyBehaviour fb){
		flyBehaviour = fb;
	}
	
	public void setQuakeBehaviour(QuakeBehaviour qb){
		quakeBehaviour = qb;
	}

}
