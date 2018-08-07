
public class CalabresaPizzaBuilder extends PizzaBuilder{

	@Override
	public PizzaBuilder buildMassa() {
		pizza.setMassa("Crocante");
		return this;
	}

	@Override
	public PizzaBuilder buildMolho() {
		pizza.setMolho("suave");
		return this;
	}

	@Override
	public PizzaBuilder buildCobertura() {
		pizza.setCobertura("calabresa + queijo");
		return this;
	}

}
