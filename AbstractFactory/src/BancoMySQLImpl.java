
public class BancoMySQLImpl extends MySQL implements Banco{

	public BancoMySQLImpl() {
		System.out.println("Banco MySQL criado!!");
	}

	@Override
	public void conectar() {
		System.out.println("Conectando ao MySQL...");
		
	}
}
