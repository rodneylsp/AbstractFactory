
public class BancoOracleImpl extends Oracle{

	public BancoOracleImpl() {
		System.out.println("Banco Oracle criado!!");
	}

	@Override
	public void conectar() {
		System.out.println("Conectando ao banco...");
	}
}
