
public class Cliente {
	
	public static void main(String[] args) {
		
		AbstractFactory factory = AbstractFactory.getFactory(BancoDeDados.ORACLE);
		Oracle banco = factory.createBancoOracle();
		banco.conectar();
		
		factory.createBancoOracle().conectar();
	}
	

}
