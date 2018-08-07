
public abstract class PizzaBuilder {

	protected Pizza pizza;
	
	public Pizza getPizza(){
		return this.pizza;
	}
	
	public void createNewPizza(){
		pizza = new Pizza();
	}
	
	public abstract void buildMassa();
	
	public abstract void buildMolho();
	
	public abstract void buildCobertura();
}
