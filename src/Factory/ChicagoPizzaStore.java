package Factory;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item){
		if(item.equals("Cheese")){
			return new ChicagoStyleCheesePizza();
		}else if(item.equals("Pepperoni")){
			return new ChicagoStylePepperoniPizza();
		}else {
			return null;
		}
	}

}
