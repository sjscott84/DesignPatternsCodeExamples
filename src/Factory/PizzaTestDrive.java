package Factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("Cheese");
		System.out.println("You ordered a "+ pizza.getName()+"\n");
		
		Pizza pizza2 = chicagoStore.orderPizza("Pepperoni");
		System.out.println("You ordered a "+ pizza2.getName());

	}
}
