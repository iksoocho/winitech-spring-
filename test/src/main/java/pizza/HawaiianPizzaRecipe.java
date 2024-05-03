package pizza;

import org.springframework.stereotype.Component;

@Component
public class HawaiianPizzaRecipe implements PizzaRecipe {

	@Override
	public String getRecipe() {
		return "하와이안피자 레시피 입니다.";

	}

}
