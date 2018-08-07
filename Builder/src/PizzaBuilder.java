
public abstract class PizzaBuilder {

	protected Pizza pizza;
	
	public Pizza getPizza(){
		return this.pizza;
	}
	
	public PizzaBuilder createNewPizza(){
		pizza = new Pizza();
		return this;
	}
	
	public abstract PizzaBuilder buildMassa();
	
	public abstract PizzaBuilder buildMolho();
	
	public abstract PizzaBuilder buildCobertura();
}
