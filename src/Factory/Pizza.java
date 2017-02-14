package Factory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	void prepare() {
		System.out.println("Preparing "+ name);
		System.out.println("Tossing dough....");
		System.out.println("Adding sauce....");
		System.out.println("Adding toppings: ");
		for(int i = 0; i <toppings.size(); i++){
			System.out.println(" " + toppings.get(i));
		}
	}
	
	void bake() {
		System.out.println("Baking");
	}
	
	void cut() {
		System.out.println("Cutting");
	}
	
	void box() {
		System.out.println("Boxing");
	}
	
	public String getName(){
		return name;
	}
}
