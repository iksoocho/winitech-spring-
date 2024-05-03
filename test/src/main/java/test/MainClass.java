package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import pizza.CheesePizzaRecipe;
import pizza.HawaiianPizzaRecipe;
import pizza.PepperoniPizzaRecipe;
import pizza.PizzaChef;
import pizza.PotatoPizzaRecipe;


@Component
public class MainClass {

    @Autowired
    PepperoniPizzaRecipe pepperoniPizzaRecipe;
    
    @Autowired
    HawaiianPizzaRecipe hawaiianPizzaRecipe;
    
    
    public static void main(String[] args) {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("context-common.xml");

        MainClass main = ac.getBean(MainClass.class);
        main.run();
    }
    
    public void run() {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("context-common.xml");
    	
    	
    	//xml 방식
        CheesePizzaRecipe cheesePizza = ac.getBean("cheesePizza", CheesePizzaRecipe.class);
        PizzaChef pc = new PizzaChef(cheesePizza);
        pc.printRecipe();

        PotatoPizzaRecipe potatoPizza = ac.getBean("potatoPizza", PotatoPizzaRecipe.class);
        pc = new PizzaChef(potatoPizza);
        pc.printRecipe();

        
        //어노테이션(자동 주입) 방식
        pc = new PizzaChef(pepperoniPizzaRecipe);
        pc.printRecipe();
        
        pc = new PizzaChef(hawaiianPizzaRecipe);
        pc.printRecipe();
    }
}
