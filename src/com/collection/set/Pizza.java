package com.collection.set;

public class Pizza {

	int pizzaPrice;
	String pizzaBrand;

	public int getPizzaPrice() {
		return pizzaPrice;
	}

	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}

	public String getPizzaBrand() {
		return pizzaBrand;
	}

	public void setPizzaBrand(String pizzaBrand) {
		this.pizzaBrand = pizzaBrand;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaPrice=" + pizzaPrice + ", pizzaBrand=" + pizzaBrand + "]";
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

}
