
public class CalabresaPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildMassa() {
		pizza.setMassa("Crocante");
	}

	@Override
	public void buildMolho() {
		pizza.setMolho("suave");
	}

	@Override
	public void buildCobertura() {
		pizza.setCobertura("calabresa + queijo");
	}

}
