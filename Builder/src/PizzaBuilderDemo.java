
public class PizzaBuilderDemo {

	public static void main(String[] args) {
		
		Garcon garcon = new Garcon();
		
		CalabresaPizzaBuilder pizzaCalabresa = new CalabresaPizzaBuilder();
		garcon.setPizzaBuilder(pizzaCalabresa);
		
		garcon.construirPizza();
		
		Pizza pizza = garcon.getPizza();
		System.out.println("Pizza pronta...");
		System.out.println("Massa: " + pizza.getMassa());
		System.out.println("Molho: " + pizza.getMolho());
		System.out.println("Cobertura: " + pizza.getCobertura());
	}

}
