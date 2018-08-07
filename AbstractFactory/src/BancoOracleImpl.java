
public class BancoOracleImpl extends Oracle implements Banco{

	public BancoOracleImpl() {
		System.out.println("Banco Oracle criado!!");
	}

	@Override
	public void conectar() {
		System.out.println("Conectando ao Oracle...");
	}
}
