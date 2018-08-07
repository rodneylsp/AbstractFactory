
public class Garcon {

	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pb){
		pizzaBuilder = pb;
	}
	
	public Pizza getPizza(){
		return pizzaBuilder.getPizza();
	}
	
	public void construirPizza(){
		pizzaBuilder.createNewPizza();
		pizzaBuilder.buildMassa();
		pizzaBuilder.buildMolho();
		pizzaBuilder.buildCobertura();
	}
}
