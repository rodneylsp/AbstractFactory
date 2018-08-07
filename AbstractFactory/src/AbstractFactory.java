
public abstract class AbstractFactory {
	
	private static final FabricaBanco FABRICA_BANCO = new FabricaBanco();
	
	static AbstractFactory getFactory(BancoDeDados banco){
		
		return FABRICA_BANCO;
	}

	public abstract Oracle createBancoOracle();
	
	public abstract MySQL createBancoMySQL();
}
