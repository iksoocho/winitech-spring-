package pizza;

import org.springframework.stereotype.Component;

@Component
public class PepperoniPizzaRecipe implements PizzaRecipe {

	@Override
	public String getRecipe() {
		
		return "페페로니피자 레시피 입니다.";
	}

}
