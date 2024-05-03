package pizza;



public class PizzaChef {

	private PizzaRecipe pizzaRecipe;
	
	public PizzaChef(PizzaRecipe pizzaRecipe) {
		this.pizzaRecipe = pizzaRecipe;
	}
	
	public void printRecipe(){
		System.out.println(pizzaRecipe.getRecipe());
	}
}
