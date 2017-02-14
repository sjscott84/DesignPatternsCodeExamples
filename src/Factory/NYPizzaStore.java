package Factory;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item){
		if(item.equals("Cheese")){
			return new NYStyleCheesePizza();
		}else if(item.equals("Pepperoni")){
			return new NYStylePepperoniPizza();
		}else{
			return null;
		}
	}
}
